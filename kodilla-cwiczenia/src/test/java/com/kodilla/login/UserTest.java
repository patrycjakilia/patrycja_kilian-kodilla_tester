package com.kodilla.login;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    public void loginTest(){
        User user = new User("patki", "kodowanie1");
        List<User> users = new ArrayList<>();
        users.add(user);

      boolean login = user.login("patki", "kodowa3nie1");

        assertEquals(true, login);
    }

}