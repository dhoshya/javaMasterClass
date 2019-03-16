package com.OOP.Inheritence;

public class BMW extends Car {

    private int roadServiceMonth;

    public BMW(int roadServiceMonth) {
        super("AWD", "BMW", 5, 8, false, 3);
        this.roadServiceMonth = roadServiceMonth;
    }

    public void accelerate(int rate){
        int newVelocity = getCurrVelocity() + rate;

        if (newVelocity ==0 ){
            stop();
            changeGear(1);
        }

        else if (newVelocity > 0 && newVelocity <= 20){
            changeGear(1);
        }
        else if (newVelocity > 20 && newVelocity <= 40) {
            changeGear(2);
        }
        else if (newVelocity > 40 && newVelocity <= 60) {
            changeGear(3);
        }
        else if (newVelocity > 60 && newVelocity <= 80) {
            changeGear(4);
        }
        else if (newVelocity > 80 && newVelocity <= 100) {
            changeGear(5);
        }
        else if (newVelocity > 100 && newVelocity <= 140) {
            changeGear(6);
        }
        else if (newVelocity > 140 && newVelocity <= 200) {
            changeGear(7);
        }
        else if (newVelocity > 200 && newVelocity <= 260) {
            changeGear(8);
        }

        if (newVelocity > 0) {
            changeVelocity(newVelocity,getCurrDirection());
        }

    }
}
