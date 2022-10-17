package com.magdy.demo.postgresqlDemo.clean_architecture.adapter.repository;

import com.magdy.demo.postgresqlDemo.clean_architecture.core.user.model.User;
import com.magdy.demo.postgresqlDemo.clean_architecture.core.user.port.UserRepository;
import com.magdy.demo.postgresqlDemo.clean_architecture.infrastructure.repository.dao.UserDao;

public class UserAdapterRepository implements UserRepository {

    private UserDao userDao;

    public UserAdapterRepository(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User findById(Integer id) {
        return null;
    }
}
