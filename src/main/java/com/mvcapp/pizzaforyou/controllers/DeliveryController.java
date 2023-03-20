package com.mvcapp.pizzaforyou.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeliveryController {

    @GetMapping("/Delivery")
    public String getDeliveryController() {
        return "Delivery";
    }
}
