package com.mvcapp.pizzaforyou.models;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "order")
@Data
@Table
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    public String InformationOrder;
    public Integer priceOrder;
    public String nameOrder;
    public String surnameOrder;
    public String phoneNumberOrder;
    public String cityDevilry;
    public String streetDevilry;
    public String homeDevilry;
    public String apartmentDevilry;
    public String commentsDevilry;
    public String pickup;
}
