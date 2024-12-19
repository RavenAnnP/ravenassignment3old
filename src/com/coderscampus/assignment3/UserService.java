package com.coderscampus.assignment3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserService {
    private User[] users;

    public UserService(String filePath) {
        this.users = loadUsers(filePath);
    }

    public User[] loadUsers(String filePath) {
        List<User> userList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] userData = line.split(",");
                if (userData.length == 2) {
                    String username = userData[0].trim();
                    String password = userData[1].trim();
                    userList.add(new User(username, password));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userList.toArray(new User[0]);
    }

    public User validateLogin(String username, String password, User[] users) {
        for (User  user : users) {
            if (user.getName().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}