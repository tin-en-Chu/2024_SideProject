package com.example.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// @RestController
// public class mainController {
//     @GetMapping("/Main")
//     public String Hello(@RequestParam String str){
//         System.out.println(str);
//         return "He";
//     }
// }


@Controller
public class mainController {
    @GetMapping("/main")
    public String Hello(){
        System.out.println("I am coming main");
        return "mainPage.html";
    }
}
