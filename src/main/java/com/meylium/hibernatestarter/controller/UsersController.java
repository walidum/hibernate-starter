package com.meylium.hibernatestarter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
    @GetMapping(path = "/hi")
    public String hi() {
        return "Hi !";
    }
}
