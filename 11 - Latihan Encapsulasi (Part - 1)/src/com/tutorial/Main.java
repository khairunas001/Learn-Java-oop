package com.tutorial;

class Player {
    private String name;
    private int baseHealth;
    private int baseAttack;
    private Armor armor;
    private Weapon weapon;
    private int level;
    private int incrementHealth;
    private int incrementAttack;

    public Player(String name) {
        this.name = name;
        this.baseHealth = 100;
        this.baseAttack = 100;
        this.level = 1;
        this.incrementHealth = 20;
        this.incrementAttack = 20;
    }

    public void display() {
        System.out.println("Player\t\t: " + this.name);
        System.out.println("Level\t\t: " + this.level);
        System.out.println("MaxHealth\t: " + this.MaxHealth());
        System.out.println("Attack\t\t: " + this.getAttackPower() + "\n");
    }

    public int levelUp() {
        return this.level++;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int MaxHealth() {
        return this.baseHealth + this.level * this.incrementAttack + this.armor.getAddHealth();
    }

    public int getAttackPower() {
        return this.baseAttack + this.level * incrementAttack + this.weapon.getAttack();

    }
}

class Weapon {
    private String name;
    private int attack;

    public Weapon(String name, int attack) {
        this.name = name;
        this.attack = attack;
    }

    public int getAttack() {
        return this.attack;

    }

}

class Armor {
    private String name;
    private int stregth;
    private int health;

    public Armor(String name, int stregth, int health) {
        this.name = name;
        this.stregth = stregth;
        this.health = health;
    }

    public int getAddHealth() {
        return this.stregth * 10 + this.health;
    }

}

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Jokowul");
        Armor armor1 = new Armor("Baju Romawi", 20, 100);
        Weapon weapon1 = new Weapon("Palu Gad", 34);

        player1.setArmor(armor1);
        player1.setWeapon(weapon1);
        player1.display();

        Player player2 = new Player("Marni");
        Armor armor2 = new Armor("Baju besi", 5, 100);
        Weapon weapon2 = new Weapon("Pedang", 10);
        player2.setArmor(armor2);
        player2.setWeapon(weapon2);
        player2.display();

        player1.levelUp();
        player2.levelUp();

        System.out.println("AFTER UPGRADE SOME LEVEL");
        player1.display();
        player2.display();

    }
}
