package com.magdy.demo.postgresqlDemo.services;

import com.magdy.demo.postgresqlDemo.clean_architecture.core.user.model.User;
import com.magdy.demo.postgresqlDemo.clean_architecture.core.user.port.UserRepository;
import com.magdy.demo.postgresqlDemo.clean_architecture.core.user.model.UserResponse;
import org.springframework.stereotype.Service;

@Service
public class UserServices {
    private final UserRepository userRepository;

    public UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponse getUserById(Integer id) {
       User user = userRepository.findById(id);
       return new UserResponse(user.getName(),user.getMail());
    }
}
