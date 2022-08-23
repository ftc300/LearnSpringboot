package com.rw.eric.learnspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Hello {

    @RequestMapping("/")
    public String hello() {
        return "Hello Spring Boot";
    }
}