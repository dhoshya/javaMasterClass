package com.OOP.Composition;

public class Main {
    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(28,28,10);
        Resolution resolution = new Resolution(1200,768);

        Case theCase = new Case("2213B","HP","240",dimensions);

        Monitor monitor = new Monitor("27inch Beast","Acer", "27inch", resolution);

        Motherboard motherboard = new Motherboard("RJ-1", "Asus", "v2.5", 4,10);

        PC pc = new PC(theCase, monitor, motherboard);

        pc.powerUp();
    }
}
