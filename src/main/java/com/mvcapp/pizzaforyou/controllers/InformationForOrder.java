package com.mvcapp.pizzaforyou.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InformationForOrder {

    @GetMapping("/InformationForOrder")
    public String getInformationForOrder(){
        return "InformationForOrder";
    }
}
