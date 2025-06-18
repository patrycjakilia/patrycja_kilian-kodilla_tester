package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersManager;
import com.kodilla.stream.UsersRepository;

import java.util.List;

import static java.util.Arrays.stream;

public class ForumStats {

    public static void main(String[] args) {
        List<User> users = UsersRepository.getUsersList();

        double avgPosts40Plus = avgFortyPlus(users);
        double avgPostsBelow40 = avgFortyMinus(users);

        System.out.println(avgPosts40Plus);
        System.out.println(avgPostsBelow40);

    }

    public static double avgFortyPlus(List <User> users){
        return  users.stream()
                .filter(user -> user.getAge() >=40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .getAsDouble();
    }

    public static double avgFortyMinus(List <User> users){
        return users.stream()
                .filter(user -> user.getAge() <40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .getAsDouble();
    }
}
