package com.OOP.CompositionChallenge;

public class Doors {

    private int height;
    private int width;
    private String lockType;

    public Doors(int height, int width, String lockType) {
        this.height = height;
        this.width = width;
        this.lockType = lockType;
    }

    public void openDoors(){
        System.out.println("Doors are now open");
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getLockType() {
        return lockType;
    }
}
