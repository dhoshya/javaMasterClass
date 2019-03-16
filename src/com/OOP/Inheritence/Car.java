package com.OOP.Inheritence;

public class Car extends Vehicle {

    private int doors;
    private int gears;
    private boolean isManual;

    private int currGear;

    public Car(String size, String name, int doors, int gears, boolean isManual, int currGear) {
        super(size, name);
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currGear = currGear;
    }

    public void changeGear(int currGear) {
        this.currGear = currGear;
        System.out.println("Changed gear to " + this.currGear);
    }

    public void changeVelocity(int speed, int direction) {
        move(speed,direction);
        System.out.println("Car.changeVelocity() is called with speed" + speed +" and direction " + direction);
    }



}
