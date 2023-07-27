package com.workintech;

public class Player {

    public enum Weapon {
        SWORD,
        AXE,
        BOW,
        STAFF
    }

    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.healthPercentage = healthPercentage;
        this.weapon = weapon;
    }

    private void setHealthPercentage(int healthPercentage) {
        if(healthPercentage < 0) {
            this.healthPercentage = 0;
        } else if (healthPercentage > 100) {
            this.healthPercentage = 100;
        } else {
            this.healthPercentage = healthPercentage;
        }
    }

    public int gethealthRemaining() {
        return  healthPercentage;
    }

    public void loseHealth(int damage) {
        healthPercentage -= damage;
        if(healthPercentage <= 0) {
            System.out.println(name + " player has been knocked out of game");
            healthPercentage = 0;
        }
    }

    public void restoreHealth(int healthPotion) {
        healthPercentage += healthPotion;
        if(healthPercentage > 100) {
            healthPercentage = 100;
        }
    }

    public static void main(String[] args) {
        Player player = new Player("oguz", 10, Player.Weapon.SWORD);
        Player player1 = new Player("dogancan", 110, Player.Weapon.STAFF);

        System.out.println(player.name + "'s remaining health: " + player.gethealthRemaining());
        System.out.println(player1.name + "'s remaining health: " + player1.gethealthRemaining());

        player.loseHealth(20);
        player1.loseHealth(50);

        System.out.println(player.name + "'s remaining health after damage: " + player.gethealthRemaining());
        System.out.println(player1.name + "'s remaining health after damage: " + player1.gethealthRemaining());

        player.restoreHealth(15);
        player1.restoreHealth(30);

        System.out.println(player.name + "'s remaining health after restoring: " + player.gethealthRemaining());
        System.out.println(player1.name + "'s remaining health after restoring: " + player1.gethealthRemaining());
    }
}
