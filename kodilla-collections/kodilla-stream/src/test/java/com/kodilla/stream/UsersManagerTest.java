package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {

    @Test
    public void testFilterChemistGroupUsernames() {
        List<String> chemists = UsersManager.filterChemistGroupUsernames();

        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Walter White");
        expectedResult.add("Gale Boetticher");
        assertEquals(expectedResult, chemists);
    }

    @Test
    public void filterUsers(){
        List<User> users = UsersManager.filterUsersByAge(40);

        List<User> expectedResutl = new ArrayList<>();
        expectedResutl.add(new User("Walter White", 50, 7, "Chemists"));
        expectedResutl.add(new User("Gus Firing", 49, 0, "Board"));
        expectedResutl.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        expectedResutl.add(new User("Mike Ehrmantraut", 57, 0, "Security"));

        assertEquals(expectedResutl, users);
    }

    @Test
    public void fiterChemistGroupByPosts(){
        List<String> users = UsersManager.fiterChemistGroupByPosts(2);

        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Walter White");

        assertEquals(expectedResult, users);
    }

}