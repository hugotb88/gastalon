package com.freelanceando.gastalon.controller;

import com.freelanceando.gastalon.model.User;
import com.freelanceando.gastalon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.QueryParam;

/**
 * Endpoints for Gastalon
 */
@RestController
public class GastalonController {

    //User Service
    @Autowired
    UserService userService;


    @PostMapping("/user/create")
    public void addUser(@RequestBody User user){
        //TODO Logic to create a new user in the DB
        userService.createUser(user);
    }

    @GetMapping("user/email")
    public User getUserByEmail(@QueryParam("email") String email){
        return userService.getUserByEmail(email);

    }

}
