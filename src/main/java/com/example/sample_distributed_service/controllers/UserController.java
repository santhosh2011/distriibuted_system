package com.example.sample_distributed_service.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("hello")
    public String getHello() {
        System.out.println("hello received");
        return "Hello";
    }
}