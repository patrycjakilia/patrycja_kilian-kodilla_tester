package com.kodilla.login;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String login;
    private String password;
    List<User> userList = new ArrayList<>();

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public boolean login(String username, String password) {
        return this.login.equals(username) && this.password.equals(password);
    }
}
