package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.stream.homework.ForumStats.avgFortyMinus;
import static com.kodilla.stream.homework.ForumStats.avgFortyPlus;
import static org.junit.jupiter.api.Assertions.*;
class ForumStatsTest {

    @Test
    public void avgAgeLessThan40(){
        List<User> users = UsersRepository.getUsersList();
        double actualResult = avgFortyMinus(users);
        double expectedResult = (116 + 4648) / 2.0;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void avgAgeMoreThan40(){
        List<User> users = UsersRepository.getUsersList();
        double actualResult = avgFortyPlus(users);
        double expectedResult = (7+20+2+0) / 4.0;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void noUserAbove40(){
        List<User> users = new ArrayList<>();
        users.add( new User("User1", 40, 5, "Group"));
        users.add( new User("User1", 45, 15, "Group"));

        double result = avgFortyMinus(users);
        assertEquals(0.0, result);
    }

    @Test
    public void noUserBelow40(){
        List<User> users = new ArrayList<>();
        users.add( new User("User1", 39, 5, "Group"));
        users.add( new User("User1", 38, 15, "Group"));

        double result = avgFortyPlus(users);
        assertEquals(0.0, result);

    }


  
}