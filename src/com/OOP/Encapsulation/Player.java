package com.OOP.Encapsulation;

public class Player {

    public String name;
    public int health;
    public String weapon;

//    public Player(String name, int health, String weapon) {
//        this.name = name;
//        this.health = health;
//        this.weapon = weapon;
//    }

    public void looseHealth(int damage){
        this.health = this.health - damage;

        if (this.health <=0){
            System.out.println("player KO");
        }
    }

    public int healthRemaining(){
        return this.health;
    }

}
