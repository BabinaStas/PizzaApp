package com.mvcapp.pizzaforyou.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PizzaController {

    @GetMapping("/Pizza")
    public String getPizzaPage(){
        return "Pizza";
    }
}
