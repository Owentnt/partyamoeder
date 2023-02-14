package com.example.party.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Homecontroller {

    @GetMapping({"/","/home"})
    public String home(){

        return "home";
    }
}
