package com.mvcapp.pizzaforyou.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PizzaController {

    @GetMapping("/Pizza")
    public String getPizzaPage(){
        return "Pizza";
    }
}
