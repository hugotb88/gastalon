package com.freelanceando.gastalon.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDateTime;

/**
 * @Author: Victor Hugo Olvera Cruz
 * Model for users
 */
@Data
@Entity(name = "users")
public class User implements Serializable {

    //Attributes
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private BigInteger id;

    @Column
    private BigInteger idFb;

    @Column
    private String name;

    @Column
    private String lastName;

    @Column
    private String email;

    @Column
    private Float dailyLimit;

    @Column
    private LocalDateTime joinDate;

    @Column
    private LocalDateTime updateDate;

    @Column
    private char active;

    //Constructor to create a new User
    public User (BigInteger idFb, String name, String lastName, String email) {
        this.idFb = idFb;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.dailyLimit = 0f;
        this.joinDate = LocalDateTime.now();
        this.updateDate = LocalDateTime.now();
        this.active = 'n';
    }

    public User () {}



}
