package com.mvcapp.pizzaforyou.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GratefulFeedBackController {

    @GetMapping("/GratefulFeedBack")
    public String getGratefulFeedBack(){
        return "GratefulFeedBack";
    }
}
