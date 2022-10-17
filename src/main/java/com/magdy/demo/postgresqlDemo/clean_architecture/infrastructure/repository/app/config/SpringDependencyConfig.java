package com.magdy.demo.postgresqlDemo.clean_architecture.infrastructure.repository.app.config;

import com.magdy.demo.postgresqlDemo.clean_architecture.adapter.repository.UserAdapterRepository;
import com.magdy.demo.postgresqlDemo.clean_architecture.infrastructure.repository.dao.UserDao;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
public class SpringDependencyConfig {

    private final UserDao userDao;

    public SpringDependencyConfig(UserDao userDao) {
        this.userDao = userDao;
    }

    @Bean
    public UserAdapterRepository userRepository(){
        return new UserAdapterRepository(userDao);
    }

}
