package com.example.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/Hello")
    public String Hello(@RequestParam String str){
        System.out.println(str);
        return "He";
    }
}
