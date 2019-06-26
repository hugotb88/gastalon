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


    //Create User
    public User createUser (User user){
        User userToCreate = new User(
                user.getIdFb(),
                user.getName(),
                user.getLastName(),
                user.getEmail()
        );
        userToCreate =userDao.save(userToCreate);
        return userToCreate;
    }


    //Update User
    public User updateUser(User user){
        return userDao.save(user);
    }


    //Delete User
    public void deleteUser(User user){
        userDao.delete(user);
    }


    //checks if user already exists
    public boolean checkIfUserExists (String email){
        if (userDao.checkIfUserExists(email) >=1)
            return true;
        return false;
    }


    public User getUserByEmail (String email){
        return userDao.getUserByEmail(email);
    }

}
