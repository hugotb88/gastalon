package com.freelanceando.gastalon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Victor Hugo Olvera Cruz
 * Controller for endpoints
 */
@RestController
public class GastalonController {

    @GetMapping(value = "/add/{amount}")
    public String addPayment(@PathVariable("amount") Float amount){
        return "Hello bitches, this is an endpoint from Gastalon " + amount;
    }
}
