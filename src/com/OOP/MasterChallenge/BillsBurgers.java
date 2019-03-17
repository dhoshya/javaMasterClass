package com.OOP.MasterChallenge;

public class BillsBurgers {
    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("White Bread","Chicken", 5,
                                            "Chicken Burger");

        hamburger.addTopping1("Lettuce", 2,2);
        hamburger.addTopping2("Onion", 3,2);
        hamburger.addTopping3("Tomato", 4,2.5);
        hamburger.addTopping4("Bacon", 5,0.5);

        hamburger.createHamburger();

        HealthyBurger healthyBurger = new HealthyBurger("Chicken", 8);

        healthyBurger.addHealthyTopping1("greens", 4,2);
        healthyBurger.addHealthyTopping2("beans", 10, 0.1);
        healthyBurger.addTopping1("Lettuce", 2,2);
        healthyBurger.addTopping2("Onion", 3,2);
        healthyBurger.addTopping3("Tomato", 4,2.5);
        healthyBurger.addTopping4("Bacon", 5,0.5);

        healthyBurger.createHamburger();


        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.createHamburger();
    }
}
