package com.magdy.demo.postgresqlDemo.clean_architecture.infrastructure.delivery;

import com.magdy.demo.postgresqlDemo.clean_architecture.adapter.delivery.UserEnpoints;
import com.magdy.demo.postgresqlDemo.clean_architecture.core.user.model.UserResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/user")
@RestController
public class UserRestController {

    public UserEnpoints userEnpoints;

    public UserRestController(UserEnpoints userEnpoints) {
        this.userEnpoints = userEnpoints;
    }

    @GetMapping
    public UserResponse getUser(@RequestParam Integer id){
       return userEnpoints.getUser(id);
    }
}
