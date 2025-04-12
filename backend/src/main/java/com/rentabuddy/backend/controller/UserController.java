package com.rentabuddy.backend.controller;

import com.rentabuddy.backend.entity.User;
import com.rentabuddy.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "https://rent-a-buddy.vercel.app/",
        methods = {RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.POST, RequestMethod.OPTIONS},
        allowedHeaders = "*",
        allowCredentials = "true")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @PostMapping("/register")
    public User register(@RequestBody User user)  {
        return userRepository.save(user);
    }

    @GetMapping
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}
