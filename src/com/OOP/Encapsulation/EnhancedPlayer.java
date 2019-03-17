package com.OOP.Encapsulation;

public class EnhancedPlayer {

    private String name;
    private int health;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public void damage(int damage){
        System.out.println("Player"+ this.getName() +" has been attacked with "+ this.getWeapon()+" weapon");
        int newHealth = this.getHealth() - damage;
        System.out.println("The health now is "+ newHealth);
    }

    private String getName() {
        return name;
    }

    private int getHealth() {
        return health;
    }

    private String getWeapon() {
        return weapon;
    }
}
