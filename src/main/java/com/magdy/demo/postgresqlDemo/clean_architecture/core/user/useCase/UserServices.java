package com.magdy.demo.postgresqlDemo.clean_architecture.core.user.useCase;

import com.magdy.demo.postgresqlDemo.clean_architecture.core.user.model.User;
import com.magdy.demo.postgresqlDemo.clean_architecture.core.user.port.UserRepository;

public class UserServices {

    private final UserRepository userRepository;

    public UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserById(Integer id) {
        return userRepository.findById(id);
    }
}
