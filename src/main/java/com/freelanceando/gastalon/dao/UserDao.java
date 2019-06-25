package com.freelanceando.gastalon.dao;


import com.freelanceando.gastalon.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * @author Victor Hugo Olvera Cruz
 * User DAO interface
 */
@Repository
public interface UserDao extends JpaRepository<User, Serializable> {

    @Query(value="SELECT * FROM public.user  WHERE email = :email",nativeQuery=true)
    public User getUserByEmail(@Param("email") String email);
}
