package com.OOP.CompositionChallenge;

public class Fan {

    private String type;
    private String model;
    private String manufacturer;
    private Boolean isTurnedOn;

    public Fan(String type, String model, String manufacturer, Boolean isTurnedOn) {
        this.type = type;
        this.model = model;
        this.manufacturer = manufacturer;
        this.isTurnedOn = isTurnedOn;
    }

    public void turnFanOn(){
        System.out.println("Turning fan on");
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
}
