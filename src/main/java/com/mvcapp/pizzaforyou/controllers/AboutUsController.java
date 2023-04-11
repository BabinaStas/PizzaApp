package com.mvcapp.pizzaforyou.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutUsController {

    @GetMapping("/AboutUs")
    public String getAboutUs(){
        return "AboutUs";
    }
}
