package com.freelanceando.gastalon.controller;

import com.freelanceando.gastalon.model.User;
import com.freelanceando.gastalon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Endpoints for Gastalon
 */
@RestController
public class GastalonController {

    //User Service
    @Autowired
    UserService userService;


    @PostMapping("/add/user")
    public void addUser(@RequestBody User user){
        //TODO Logic to create a new user in the DB
        userService.createUser(user);
    }


}
