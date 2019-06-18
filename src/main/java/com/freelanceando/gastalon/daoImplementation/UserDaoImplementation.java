package com.freelanceando.gastalon.daoImplementation;

import com.freelanceando.gastalon.dao.UserDao;
import com.freelanceando.gastalon.model.User;
import org.springframework.stereotype.Repository;

/**
 * @author Victor Hugo Olvera Cruz
 * Implementation of User interface to create, update and delete and user
 */
@Repository
public class UserDaoImplementation implements UserDao {

    @Override
    public User createUser(User userToCreate) {
        return null;
    }
}
