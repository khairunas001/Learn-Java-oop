package com.tutorial;

public class HeroStrength extends Hero {
    String Type = "Strength";

    HeroStrength(String nameInput, double attackInput, double health) {
        super(nameInput, attackInput, health);

    }

    @Override
    void display() {
        super.display();
        System.out.println("Type : " + this.Type);

    }

    @Override
    void takeDamage(double damage) {
        System.out.println(this.name + " receive half damage " + damage + " -> " + 0.5 * damage);
        this.health = this.health - 0.5 * damage;
        this.display();
    }

}
