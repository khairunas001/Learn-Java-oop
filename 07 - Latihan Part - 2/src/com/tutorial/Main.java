package com.tutorial;

//player
class Player {
    String name;
    double health;

    // object member
    Weapon weapon;
    Armor armor;

    Player(String name, double health) {
        this.name = name;
        this.health = health;
    }

    void attack(Player opponent) {
        double attackPower = this.weapon.attackPower;

        System.out.println(this.name + " attacking " + opponent.name + " with power " + attackPower);

        opponent.defence(attackPower);
    }

    void defence(double attackPower) {
        double damage;
        if (this.armor.defencePower < attackPower) {
            damage = attackPower - this.armor.defencePower;
        } else {
            damage = 0;
        }

        this.health -= damage;
        System.out.println(this.name + " gets damage " + damage);

    }

    void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    void equipArmor(Armor armor) {
        this.armor = armor;
    }

    void display() {
        System.out.println("\nName : " + this.name);
        System.out.println("Health : " + this.health + " hp");
        this.weapon.display();
        this.armor.display();
    }
}

// senjata
class Weapon {
    String name;
    double attackPower;

    Weapon(String name, double attackPower) {
        this.name = name;
        this.attackPower = attackPower;

    }

    void display() {
        System.out.println("Weapon : " + this.name + " , attack : " + this.attackPower);
    }

}

// armor
class Armor {
    String name;
    double defencePower;

    Armor(String name, double defencePower) {
        this.name = name;
        this.defencePower = defencePower;

    }

    void display() {
        System.out.println("Armor : " + this.name + " , defence : " + this.defencePower);
    }

}

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Wowok", 100);
        Player player2 = new Player("Wiwik", 100);

        Weapon gearMotor = new Weapon("Gear Motor", 50);
        Weapon parang = new Weapon("Parang", 60);

        Armor jaketArmor = new Armor("Jaket Armor", 10);
        Armor kemejaPutih = new Armor("Kemeja Putih", 5);

        // player 1
        player1.equipWeapon(gearMotor);
        player1.equipArmor(jaketArmor);
        player1.display();

        // player 2
        player2.equipWeapon(parang);
        player2.equipArmor(kemejaPutih);
        player2.display();

        System.out.println("\nPERTEMPURAAAN");
        System.out.println("\nEpisode - 1\n");
        player1.attack(player2);
        player1.display();
        player2.display();
        System.out.println("\nEpisode - 2\n");
        player2.attack(player1);
        player1.display();
        player2.display();
    }
}
