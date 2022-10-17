package com.magdy.demo.postgresqlDemo.clean_architecture.core.user.port;

import com.magdy.demo.postgresqlDemo.clean_architecture.core.user.model.User;

public interface UserRepository {

   User findById(Integer id);
}
