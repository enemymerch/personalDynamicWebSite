package com.can.me.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping
    public String helloWorldGetTest(){
        return "Hello World!";
    }

    @PostMapping
    public String helloWorldPostTest(){
        return "Hello World!";
    }
}
