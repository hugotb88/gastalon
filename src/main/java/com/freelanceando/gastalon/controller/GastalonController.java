package com.freelanceando.gastalon.controller;

import com.freelanceando.gastalon.model.User;
import com.freelanceando.gastalon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.ws.rs.QueryParam;
import java.sql.SQLException;

/**
 * Endpoints for Gastalon
 */
@RestController
public class GastalonController {

    //User Service
    @Autowired
    UserService userService;


    @PostMapping("/user/create")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public User addUser(@RequestBody User user){
        if (userService.checkIfUserExists(user.getEmail()))
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "User already exists");
        return userService.createUser(user);
    }


    @PutMapping("/user/update")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public User updateUser(@RequestBody User user){
        try{
            return userService.updateUser(user);
        } catch (Exception exc) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "The user couldn't be updated", exc);
        }

    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public void deleteUser(@RequestBody User user){
        try{
            userService.deleteUser(user);
        }catch (Exception ex){
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "The user doesn't exists", ex);
        }
    }


    @GetMapping("user/email")
    public User getUserByEmail(@QueryParam("email") String email){
        return userService.getUserByEmail(email);

    }

}
