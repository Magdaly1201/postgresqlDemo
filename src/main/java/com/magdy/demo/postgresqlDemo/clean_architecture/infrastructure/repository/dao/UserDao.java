package com.magdy.demo.postgresqlDemo.clean_architecture.infrastructure.repository.dao;

import com.magdy.demo.postgresqlDemo.clean_architecture.infrastructure.repository.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<UserEntity,Integer> {
}
