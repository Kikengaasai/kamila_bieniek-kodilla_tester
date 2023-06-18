package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;
import java.util.OptionalDouble;

public class ForumStats {

    public static void main(String[] args) {
        ForumStats forumStats = new ForumStats();

        double averageNumberOfPostUnder40 = forumStats.averageNumberOfPostUnder40(UsersRepository.getUsersList());
        double averageNumberOfPostAbove40 = forumStats.averageNumberOfPostAbove40(UsersRepository.getUsersList());

        System.out.println("averageNumberOfPostUnder40: " + averageNumberOfPostUnder40);
        System.out.println("averageNumberOfPostAbove40: " + averageNumberOfPostAbove40);
    }

    public double averageNumberOfPostUnder40(List<User> userList) {
        OptionalDouble average = userList.stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(User::getNumberOfPost)
                .average();

        return average.orElse(0);
    }

    public double averageNumberOfPostAbove40(List<User> userList) {
        OptionalDouble average = userList.stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(User::getNumberOfPost)
                .average();

        return average.orElse(0);
    }

}