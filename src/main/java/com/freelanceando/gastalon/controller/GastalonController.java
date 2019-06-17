package com.freelanceando.gastalon.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Endpoints for Gastalon
 */
@RestController
public class GastalonController {




    @PostMapping("/add")
    public void addMovement(@RequestBody String movement){
        //TODO Logic to insert a movement in the DB
    }


}
