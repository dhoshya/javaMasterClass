package com.OOP.PolymorphismChallenge;

class Car {
    private boolean isEngine;
    private int doors;
    private int cylinders;


    public Car(int doors, int cylinders) {
        this.isEngine = false;
        this.doors = doors;
        this.cylinders = cylinders;
    }

    public void startEngine(){
        this.isEngine = true;
        System.out.println("Engine started");
    }

    public void stopEngine(){
        this.isEngine = false;
        System.out.println("Engine stopped");
    }


    public void horsePower(){
        System.out.println("this is from car");
    }

    public String coupeOrSedan(){
        return "This is from car";
    }


    public int getDoors() {
        return doors;
    }

    public int getCylinders() {
        return cylinders;
    }

}


class BMW extends Car{
    public BMW(int doors, int cylinders) {
        super(doors, cylinders);
    }

    @Override
    public void horsePower(){
        System.out.print("In BMW and "); startEngine();
        int hp = getCylinders()*100;
        System.out.println("Horse power for "+getCylinders()+" cylinder car is: "+ hp);
    }

    @Override
    public String coupeOrSedan() {
        if(this.getDoors() == 2){
            return "This is a coupe";
        }else{
            return "This is a sedan";
        }
    }
}

















public class Main {
    public static void main(String[] args) {

        BMW bmw = new BMW(2,4);

        bmw.horsePower();
        bmw.coupeOrSedan();
    }
}
