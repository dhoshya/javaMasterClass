package com.OOP.Inheritence;

public class Vehicle {

    private String size;
    private String name;

    private int currVelocity;
    private int currDirection;

    public Vehicle(String size, String name) {
        this.size = size;
        this.name = name;

        this.currVelocity = 0;
        this.currDirection = 0;
    }

    public void steer(int direction) {
        this.currDirection += direction;
        System.out.println("Vehicle.steer(): Steering at" + currDirection + " degrees.");
    }

    public void move(int velocity, int direction) {
        this.currDirection = direction;
        this.currVelocity = velocity;

        System.out.println("Vehicle.move(): Moving at "+ currVelocity+ " in direction "+ currDirection);
    }

    public String getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public int getCurrVelocity() {
        return currVelocity;
    }

    public int getCurrDirection() {
        return currDirection;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrVelocity(int currVelocity) {
        this.currVelocity = currVelocity;
    }

    public void setCurrDirection(int currDirection) {
        this.currDirection = currDirection;
    }

    public void stop() {
        this.currVelocity = 0;
    }
}
