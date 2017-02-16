package com.devopsbuddy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by praveen on 2/16/2017.
 */
@Controller
public class HelloWorldController {
    @RequestMapping("/")
    public String sayHello(){
        return "index";
    }
}
