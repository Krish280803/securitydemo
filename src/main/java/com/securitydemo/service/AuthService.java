package com.securitydemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.securitydemo.entity.Role;
import com.securitydemo.entity.User;
import com.securitydemo.exception.UserAlreadyExistsException;
import com.securitydemo.repository.UserRepository;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User registerUser(
            String username,
            String password,
            Role role) {

        if (userRepository.existsByUsername(username)) {
            throw new UserAlreadyExistsException(
                    "Username already exists");
        }

        User user = new User();

        user.setUsername(username);
        user.setPassword(
                passwordEncoder.encode(password));
        user.setRole(role);

        return userRepository.save(user);
    }
}