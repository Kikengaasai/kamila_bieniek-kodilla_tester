package com.kodilla.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UserManager {

    Map<String, List<User> > people = new HashMap<>();
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
    }


    //nie wiem czy w ogóle ta metoda jest potrzebna
    public List<User> addUser (String person, User user){

        List<User> users = people.getOrDefault(person, new ArrayList<>());
        users.add(user);
        people.put(person,users);

        return users;
    }


    private static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UserManager::getUserName)
                .collect(Collectors.toList());

        return usernames;

    }

    private static List<String> filterOlderPeople(int age) {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() == age)
                .map(UserManager::getUserName)
                .collect(Collectors.toList());

        return usernames;

    }

    private static List<String> filterPeopleWhoDontHavePosts(int numberOfPosts) {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getNumberOfPost() ==numberOfPosts)
                .map(UserManager::getUserName)
                .collect(Collectors.toList());

        return usernames;

    }



    private static void processUsersStream() {
        UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UserManager::getUserName)
                .forEach(username -> System.out.println(username));
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }

    }

