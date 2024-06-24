package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String getUserById(Long userId) {
        // Simulating fetching user data from a database or external service
        return "User " + userId;
    }

    public void saveUser(String username) {
        // Simulating saving user to a database or external service
        System.out.println("User " + username + " saved.");
    }
}
