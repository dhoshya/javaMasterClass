package com.OOP.MasterChallenge;

public class Hamburger {

    private String breadRollType;
    private String meatType;
    private double basePrice;
    private String name;

    private String topping1;
    private double topping1Price;
    private int topping1Quantity=0;

    private String topping2;
    private double topping2Price;
    private int topping2Quantity=0;

    private String topping3;
    private double topping3Price;
    private int topping3Quantity=0;

    private String topping4;
    private double topping4Price;
    private int topping4Quantity=0;

    public Hamburger(String breadRollType, String meatType, double basePrice, String name) {
        this.breadRollType = breadRollType;
        this.meatType = meatType;
        this.basePrice = basePrice;
        this.name = name;
    }

    public void addTopping1(String name, int quantity, double price){
        this.topping1 = name;
        this.topping1Price = price;
        this.topping1Quantity += quantity;
    }

    public void addTopping2(String name, int quantity, double price){
        this.topping2 = name;
        this.topping2Price = price;
        this.topping2Quantity += quantity;
    }

    public void addTopping3(String name, int quantity, double price){
        this.topping3 = name;
        this.topping3Price = price;
        this.topping3Quantity += quantity;
    }

    public void addTopping4(String name, int quantity, double price){
        this.topping4 = name;
        this.topping4Price = price;
        this.topping4Quantity += quantity;
    }

    public double createHamburger(){
        double hamburgerPrice = this.basePrice;
        System.out.println("Base Price for "+getName()+" on "+ getBreadRollType()
                            + " with "+getMeatType()+ " is: "+ hamburgerPrice);

        if(this.topping1 != null){
            hamburgerPrice += this.topping1Price;
            //System.out.println("Total "+ this.topping1+ " added = "+this.topping1Quantity);
            System.out.println(this.topping1+ " added for an extra cost of "+this.topping1Price+
                                ". \n Total hamburger price: "+hamburgerPrice);
        }
        if(this.topping2 != null){
            hamburgerPrice += this.topping2Price;
           // System.out.println("Total "+ this.topping2+ " added = "+this.topping2Quantity);
            System.out.println(this.topping2+ " added for an extra cost of "+this.topping2Price+
                    ". \n Total hamburger price: "+hamburgerPrice);
        }
        if(this.topping3 != null){
            hamburgerPrice += this.topping3Price;
            //System.out.println("Total "+ this.topping3+ " added = "+this.topping3Quantity);
            System.out.println(this.topping3+ " added for an extra cost of "+this.topping3Price+
                    ".\n Total hamburger price: "+hamburgerPrice);
        }
        if(this.topping4 != null){
           // System.out.println("Total "+ this.topping4+ " added = "+this.topping4Quantity);
            hamburgerPrice += this.topping4Price;
            System.out.println(this.topping4+ " added for an extra cost of "+this.topping4Price+
                    ".\n Total hamburger price: "+hamburgerPrice);
        }

        return hamburgerPrice;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeatType() {
        return meatType;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public String getName() {
        return name;
    }
}
