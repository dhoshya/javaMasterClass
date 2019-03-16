package com.OOP.CompositionChallenge;

public class Lamp {

    private String type;
    private Boolean isTurnedOn;

    public Lamp(String type, Boolean isTurnedOn) {
        this.type = type;
        this.isTurnedOn = isTurnedOn;
    }

    public void turnLampOn(){
        System.out.println("Lamp is switched on");
    }

    public String getType() {
        return type;
    }

    public Boolean getTurnedOn() {
        return isTurnedOn;
    }
}
