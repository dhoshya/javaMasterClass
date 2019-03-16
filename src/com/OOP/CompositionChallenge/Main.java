package com.OOP.CompositionChallenge;

public class Main {

    public static void main(String[] args) {

        Doors d1 = new Doors(30,10,"Manual");
        Doors d2 = new Doors(30,10,"Automatic");

        Bed bed = new Bed("King", 5,2,1);

        TV tv = new TV("UltraHD","Z4115","Samsung",true);

        Fan fan = new Fan("Celing","Fast200","Bajaj", false);

        Lamp lamp = new Lamp("Standing", true);

        Bedroom b = new Bedroom(d1,d2,bed,fan,tv,lamp);

        b.makeBed();
        b.getLamp().turnLampOn();
    }
}
