package com.magdy.demo.postgresqlDemo.clean_architecture.adapter.delivery;

import com.magdy.demo.postgresqlDemo.clean_architecture.core.user.model.User;
import com.magdy.demo.postgresqlDemo.clean_architecture.core.user.model.UserResponse;
import com.magdy.demo.postgresqlDemo.clean_architecture.core.user.useCase.UserServices;

public class UserEnpoint {

    public UserServices userServices;

    public UserEnpoint(UserServices userServices) {
        this.userServices = userServices;
    }

    public UserResponse getUser(Integer id){
        User user = userServices.getUserById(id) ;
        return  new UserResponse(user.getName(),user.getMail());
    }
}
