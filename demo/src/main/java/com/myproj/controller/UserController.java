package com.myproj.controller;

import com.myproj.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.myproj.repository.UserRepository;

@RestController
public class UserController
{
    private UserRepository userRepository;

    @PostMapping("/users")
    void addUser(@RequestBody User user) {
        userRepository.save(user);
    }
}
