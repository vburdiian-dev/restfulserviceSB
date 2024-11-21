package com.vburdiian.dev.restfulservice.controller;

import java.util.List;
import java.util.Optional;

import com.vburdiian.dev.restfulservice.model.User;
import com.vburdiian.dev.restfulservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome";
    }

    // is it a good practice to set same path for GET and POST?
    @PostMapping("users/{id}")
    public User createUser(@PathVariable Long id, @RequestBody User user) {
        user.setId(id);
        return userRepository.save(user);
    }

}