package com.example.loginpassword.service;

import com.example.loginpassword.model.User;
import com.example.loginpassword.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> login(String name, String password) {
        return userRepository.findByNameAndPassword(name, password);
    }
}
