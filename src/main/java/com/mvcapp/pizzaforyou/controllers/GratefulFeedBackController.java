package com.mvcapp.pizzaforyou.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GratefulFeedBackController {

    @GetMapping("/GratefulFeedBack")
    public String getGratefulFeedBack(){
        return "GratefulFeedBack";
    }
}