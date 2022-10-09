package com.magdy.demo.postgresqlDemo.repositories;

import com.magdy.demo.postgresqlDemo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
