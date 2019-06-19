package com.freelanceando.gastalon.service;

import com.freelanceando.gastalon.dao.UserDao;
import com.freelanceando.gastalon.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Victor Hugo Olvera Cruz
 * User Service, calls User DAO
 */
@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public void createUser (User user){
        User userToReturn = new User();
        userDao.createUser(user);
    }

}
