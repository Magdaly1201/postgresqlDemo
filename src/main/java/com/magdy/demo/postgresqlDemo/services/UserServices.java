package com.magdy.demo.postgresqlDemo.services;

import com.magdy.demo.postgresqlDemo.entities.UserResponse;
import com.magdy.demo.postgresqlDemo.repositories.UserRepository;

public class UserServices {
    private UserRepository userRepository;

    public UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponse getUserById(Integer id) {
       return new UserResponse("name","email");
    }
}
