package com.magdy.demo.postgresqlDemo.services;

import com.magdy.demo.postgresqlDemo.entities.User;
import com.magdy.demo.postgresqlDemo.entities.UserResponse;
import com.magdy.demo.postgresqlDemo.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServices {
    private final UserRepository userRepository;

    public UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponse getUserById(Integer id) {
       User user = userRepository.findById(id).orElseThrow(()->new RuntimeException("not found"));
       return new UserResponse(user.getName(),user.getMail());
    }
}
