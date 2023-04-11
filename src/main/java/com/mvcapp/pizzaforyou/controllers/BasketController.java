package com.mvcapp.pizzaforyou.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasketController {

    @GetMapping("/Basket")
    public String getBasketController(){
        return "Basket";
    }
}
