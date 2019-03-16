package com.OOP.CompositionChallenge;

public class Bedroom {

    private Doors door1;
    private Doors door2;
    private Bed bed;
    private Fan fan;
    private TV television;
    private Lamp lamp;

    public Bedroom(Doors door1, Doors door2, Bed bed, Fan fan, TV television, Lamp lamp) {
        this.door1 = door1;
        this.door2 = door2;
        this.bed = bed;
        this.fan = fan;
        this.television = television;
        this.lamp = lamp;
    }

    public Lamp lamp(){
        return this.lamp;
    }

    public void makeBed(){
        System.out.println("In Bedroom --> MakingBed");
        bed.make();
    }

    public Doors getDoor1() {
        return door1;
    }

    public Doors getDoor2() {
        return door2;
    }

    public Bed getBed() {
        return bed;
    }

    public Fan getFan() {
        return fan;
    }

    public TV getTelevision() {
        return television;
    }

    public Lamp getLamp() {
        return lamp;
    }
}
