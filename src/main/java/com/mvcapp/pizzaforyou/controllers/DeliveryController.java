package com.mvcapp.pizzaforyou.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeliveryController {

    @GetMapping("/Delivery")
    public String getDeliveryController() {
        return "Delivery";
    }
}
