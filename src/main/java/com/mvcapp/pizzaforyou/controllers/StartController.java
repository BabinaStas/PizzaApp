package com.mvcapp.pizzaforyou.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartController {

    @GetMapping("/StartPage")
    public String getStartPage() {
        return "StartPage";
    }
}
