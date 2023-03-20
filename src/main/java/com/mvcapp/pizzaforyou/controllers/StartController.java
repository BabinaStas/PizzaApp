package com.mvcapp.pizzaforyou.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StartController {

    @GetMapping("/StartPage")
    public String getStartPage() {
        return "StartPage";
    }
}
