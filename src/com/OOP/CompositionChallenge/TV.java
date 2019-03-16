package com.OOP.CompositionChallenge;

public class TV {

    private String type;
    private String model;
    private String manufacturer;
    private Boolean isTurnedOn;

    public TV(String type, String model, String manufacturer, Boolean isTurnedOn) {
        this.type = type;
        this.model = model;
        this.manufacturer = manufacturer;
        this.isTurnedOn = isTurnedOn;
    }

    public void turnTVOn(){
        System.out.println("Turning TV on");
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Boolean getTurnedOn() {
        return isTurnedOn;
    }
}
