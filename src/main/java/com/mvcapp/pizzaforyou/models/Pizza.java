package com.mvcapp.pizzaforyou.models;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "pizza")
@Data
@Table
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    public String namePizza;
    public String sizePizza;
    public String doughPizza;
    public Integer countBasket;



}
