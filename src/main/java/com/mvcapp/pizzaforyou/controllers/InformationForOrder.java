package com.mvcapp.pizzaforyou.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InformationForOrder {

    @GetMapping("/InformationForOrder")
    public String getInformationForOrder(){
        return "InformationForOrder";
    }
}
