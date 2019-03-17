package com.OOP.MasterChallenge;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("White Bread", "Chicken, Bacon & Gyro", 13, "Deluxe Burger");
        super.addTopping1("chips",1,2.5);
        super.addTopping2("drink", 1, 1.5);
    }
}
