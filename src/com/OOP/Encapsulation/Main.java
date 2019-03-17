package com.OOP.Encapsulation;

public class Main {

    public static void main(String[] args) {

        Player player = new Player();

        player.name = "Player1";
        player.health = 100;
        player.weapon = "sword";

        int damage = 100;

        player.looseHealth(damage);

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Rohan", 100, "Sword");

        int damage2 = 40;

        enhancedPlayer.damage(damage2);
    }
}
