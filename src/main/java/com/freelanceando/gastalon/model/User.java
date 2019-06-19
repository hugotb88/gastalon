package com.freelanceando.gastalon.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;

/**
 * @Author: Victor Hugo Olvera Cruz
 * Model for users
 */
@Data
@Entity(name = "users")
public class User {

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

    //Constructor
    public User (BigInteger idFb, String name, String lastName, String email, Float dailyLimit) {
        this.idFb = idFb;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.dailyLimit = dailyLimit;
        this.joinDate = LocalDateTime.now();
        this.updateDate = LocalDateTime.now();
    }

    public User () {}



}
