package com.freelanceando.gastalon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Victor Hugo Olvera Cruz
 * Test Controller
 */
@RestController
public class TestController {

    @GetMapping(value = "/test")
    public String test() {
        return "Hello bitches, this is an endpoint from Gastalon ";
    }

    @PostMapping(value = "/test/receiving")
    public String testReceiving(@RequestBody String json) {
        return json;
    }
}
