package com.magdy.demo.postgresqlDemo.clean_architecture.adapter.delivery;

import com.magdy.demo.postgresqlDemo.clean_architecture.core.user.model.UserResponse;
import com.magdy.demo.postgresqlDemo.services.UserServices;

public class UserEnpoints {

    public UserServices userServices;

    public UserEnpoints(UserServices userServices) {
        this.userServices = userServices;
    }

    public UserResponse getUser(Integer id){
        return userServices.getUserById(id);
    }
}
