package com.yildiz;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Hello serviceB";
    }
    @GetMapping("/info")
    public String info() {
        return "info: serviceB";
    }
}
