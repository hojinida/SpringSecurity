package com.example.ssiach2ex1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello") // <1>
    public String hello() {
        return "Hello!";
    }
}
