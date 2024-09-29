package com.example.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class loginController {

    // convert to login page
    @GetMapping("/login")
    public String Hello(){
        System.out.println("I am coming login");
        return "login.html";
    }
}
