package com.yildiz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AuthController {
    /*
    @GetMapping("/")
    public String hello() {
        return "Hello AuthService";
    }
    @GetMapping("/info")
    public String info() {
        return "info: AuthService";
    }

     */

    @PostMapping("/register")
    public String register(){
        return null;
    }
    @PostMapping("/login")
    public String login(){
        return null;
    }
    @GetMapping("/findAll")
    public String findAll(){
        return null;
    }
    @GetMapping("/getMessage")
    public String getMessage(){
        return null;
    }
}