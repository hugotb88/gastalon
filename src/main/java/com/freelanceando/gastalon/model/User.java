package com.freelanceando.gastalon.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigInteger;
import java.time.LocalDateTime;

/**
 * @Author: Victor Hugo Olvera Cruz
 * Model for users
 */
@Data
@AllArgsConstructor
public class User {

    //Attributes
    private BigInteger id;
    private BigInteger idFb;
    private String name;
    private String lastName;
    private String email;
    private Float dailyLimit;
    private LocalDateTime joinDate;
    private LocalDateTime updateDate;


}
