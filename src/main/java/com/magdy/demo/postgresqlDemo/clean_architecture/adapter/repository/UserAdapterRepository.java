package com.magdy.demo.postgresqlDemo.clean_architecture.adapter.repository;

import com.magdy.demo.postgresqlDemo.clean_architecture.core.user.model.User;
import com.magdy.demo.postgresqlDemo.clean_architecture.core.user.port.UserRepository;
import com.magdy.demo.postgresqlDemo.clean_architecture.infrastructure.repository.dao.UserDao;
import com.magdy.demo.postgresqlDemo.clean_architecture.infrastructure.repository.entity.UserEntity;

public class UserAdapterRepository implements UserRepository {

    private UserDao userDao;

    public UserAdapterRepository(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User findById(Integer id) {
        UserEntity user = userDao.findById(id).orElseThrow(()-> new RuntimeException("Not found"));
        return (new User(user.getId(),user.getName(),user.getMail()));
    }
}
