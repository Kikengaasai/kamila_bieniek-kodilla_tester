package com.kodilla.jdbc;

import java.sql.*;
import java.util.AbstractMap;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DbManagerTestSuite {
    private static DbManager dbManager;

    @BeforeAll
    public static void setup() throws SQLException {
        dbManager = DbManager.getInstance();
    }

    @Test
    void testConnect() {
        //Given
        //When
        //Then
        Assertions.assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsers() throws SQLException {
        //Given
        String countQuery = "SELECT COUNT(*) FROM USERS";
        Statement statement = createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count = getRowsCount(rs);
        insertUsers(statement);

        //When
        String sqlQuery = "SELECT * FROM USERS";
        statement = createStatement();
        rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = getResultsCount(rs);
        int expected = count + 5;
        assertEquals(expected, counter);

        rs.close();
        statement.close();
    }

    private Statement createStatement() throws SQLException {
        return dbManager.getConnection().createStatement();
    }

    private static final List<AbstractMap.SimpleEntry<String, String>> USERS = List.of(
            new AbstractMap.SimpleEntry<>("Zara", "Ali"),
            new AbstractMap.SimpleEntry<>("Otman", "Use"),
            new AbstractMap.SimpleEntry<>("Mark", "Boq"),
            new AbstractMap.SimpleEntry<>("Uli", "Wimer"),
            new AbstractMap.SimpleEntry<>("Oli", "Kosiw")
    );

    private void insertUsers(Statement statement) throws SQLException {
        for (AbstractMap.SimpleEntry<String, String> user : USERS) {
            statement.executeUpdate(
                    String.format("INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('%s', '%s')",
                            user.getKey(),
                            user.getValue()
                    )
            );
        }
    }

    private static int getResultsCount(ResultSet rs) throws SQLException {
        int counter = 0;
        while(rs.next()) {
            System.out.printf("%d, %s, %s%n",
                    rs.getInt("ID"),
                    rs.getString("FIRSTNAME"),
                    rs.getString("LASTNAME"));
            counter++;
        }
        return counter;
    }

    private static int getRowsCount(ResultSet rs) throws SQLException {
        int count = 0;
        while (rs.next()) {
            count = rs.getInt("COUNT(*)");
        }
        return count;
    }


    @Test
    public void testSelectUsersAndPosts() throws SQLException {
        // Tworzenie połączenia do bazy danych
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/localhost", "root", "BardzoKochamZebre123!");

        // Tworzenie zapytania SQL
        String query = "SELECT u.username " +
                "FROM users u " +
                "JOIN posts p ON u.id = p.user_id " +
                "GROUP BY u.username " +
                "HAVING COUNT(p.user_id) >= 2";

        // Wykonanie zapytania SQL
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        // Wyświetlanie imion i nazwisk użytkowników i zliczanie
        int actualUserCount = 0;
        while (resultSet.next()) {
            String username = resultSet.getString("username");
            System.out.println("Username: " + username);
            actualUserCount++;
        }

        // Zamknięcie połączenia do bazy danych
        resultSet.close();
        statement.close();
        connection.close();

        int expectedUserCount = countUsersWithMinTwoPosts(connection);
        assertEquals(expectedUserCount, actualUserCount);
    }


    private int countUsersWithMinTwoPosts(Connection connection) throws SQLException {
        // Tworzenie zapytania SQL do zliczenia rekordów w tabeli użytkowników, którzy mają co najmniej 2 posty
        String countQuery = "SELECT COUNT(*) AS count FROM users u JOIN posts p ON u.id = p.user_id GROUP BY u.id HAVING COUNT(p.id) >= 2";

        // Wykonanie zapytania SQL
        Statement countStatement = connection.createStatement();
        ResultSet countResultSet = countStatement.executeQuery(countQuery);
        countResultSet.next();
        int userCount = countResultSet.getInt("count");

        // Zamknięcie zasobów
        countResultSet.close();
        countStatement.close();

        return userCount;
    }
}
