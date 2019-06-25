package com.freelanceando.gastalon.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.freelanceando.gastalon.dao.UserDao;
import com.freelanceando.gastalon.model.User;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @author Victor Hugo Olvera Cruz
 * User Service, calls User DAO
 */
@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public void createUser (User user){
        userDao.save(user);
    }

    public User getUserByEmail (String email){
        return userDao.getUserByEmail(email);
    }

}
