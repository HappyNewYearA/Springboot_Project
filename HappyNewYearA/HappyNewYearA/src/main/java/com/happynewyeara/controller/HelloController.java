package com.happynewyeara.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String sayHello() {
        System.out.println("Hello, World!");
        return "Hello, World!";
    }
}