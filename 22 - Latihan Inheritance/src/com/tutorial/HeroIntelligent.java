package com.tutorial;

public class HeroIntelligent extends Hero {
    String Type = "Intelligent";

    HeroIntelligent(String name, double attackInput, double health) {
        super(name, attackInput, health);

    }

    @Override
    void display() {
        super.display();
        System.out.println("Type : " + this.Type);

    }

    @Override
    void takeDamage(double damage) {
        System.out.println(this.name + " receive half damage " + damage + " -> " + 2 * damage);
        this.health = this.health - 2 * damage;
        this.display();
    }

}
