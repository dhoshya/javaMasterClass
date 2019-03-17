package com.OOP.MasterChallenge;

public class HealthyBurger extends Hamburger{

    private String healthyTopping1;
    private double healthyTopping1Price;
    private int healthyTopping1Quantity;

    private String healthyTopping2;
    private double healthyTopping2Price;
    private int healthyTopping2Quantity;

    public HealthyBurger(String meatType, double basePrice) {
        super("Brown Rye", meatType, basePrice, "Healthy Burger");
    }

    public void addHealthyTopping1(String name, int quantity, double price){
        this.healthyTopping1 = name;
        this.healthyTopping1Price =price;
        this.healthyTopping1Quantity=quantity;
    }

    public void addHealthyTopping2(String name, int quantity, double price){
        this.healthyTopping2 = name;
        this.healthyTopping2Price = price;
        this.healthyTopping2Quantity = quantity;
    }



}
