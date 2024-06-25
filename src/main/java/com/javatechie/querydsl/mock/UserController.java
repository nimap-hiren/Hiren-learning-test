package com.example.demo.controller;

//import com.example.demo.service.UserService;
import com.javatechie.querydsl.mock.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/{userId}")
    public String getUser(@PathVariable Long userId) {
        return userService.getUserById(userId);
    }

    @PostMapping("/user")
    public String saveUser(@RequestBody String username) {
        userService.saveUser(username);
        return "User saved.";
    }
}
