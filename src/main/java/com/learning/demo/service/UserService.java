package com.learning.demo.controller;

import com.example.bidding.model.User;
import com.example.bidding.repository.UserRepository;
import com.learning.demo.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private com.learning.demo.repo.UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    // Signup a new user
    public User signup(User user) {
        if (userRepository.findByUsername(user.getUsername()).isPresent()) {
            throw new RuntimeException("Username already exists");
        }
        user.setPassword(passwordEncoder.encode(user.getPassword())); // encode password
        user.setRole("USER");
        return userRepository.save(user);
    }

    // Login user
    public User login(String username, String password) {
        Optional<User> userOpt = userRepository.findByUsername(username);
        if (userOpt.isPresent()) {
            User user = userOpt.get();
            if (passwordEncoder.matches(password, user.getPassword())) {
                return user;
            } else {
                throw new RuntimeException("Invalid password");
            }
        } else {
            throw new RuntimeException("User not found");
        }
    }

    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }
}
