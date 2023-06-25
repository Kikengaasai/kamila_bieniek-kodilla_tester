package com.kodilla.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserManager {

    List<User> people = new ArrayList<>();

    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames(UsersRepository.getUsersList());
        System.out.println(chemistGroupUsernames);
    }


    public static List<String> filterChemistGroupUsernames(List<User> userList) {
        return userList.stream().filter(user -> user.getGroup().equals("Chemists")).map(UserManager::getUserName).collect(Collectors.toList());
    }

    public static List<String> filterOlderPeople(int age) {
        return UsersRepository.getUsersList().stream().filter(user -> user.getAge() > age).map(UserManager::getUserName).collect(Collectors.toList());
    }

    public static List<String> filterPeopleWhoDontHavePosts(List<User> userList) {
       return userList .stream().filter(user -> user.getNumberOfPost() == 0).map(UserManager::getUserName).collect(Collectors.toList());
    }


    public static void processUsersStream() {
        UsersRepository.getUsersList().stream().filter(user -> user.getGroup().equals("Chemists")).map(UserManager::getUserName).forEach(username -> System.out.println(username));
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }


}




