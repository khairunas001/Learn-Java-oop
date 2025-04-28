package com.tutorial;

public class HeroStrength extends Hero {
    String attribute = "Strength";

    HeroStrength(String name, double defence, double attack) {
        super(name, defence, attack);
    }

    void display() {
        System.out.print("\nHero " + this.attribute + "\n");
        super.display();
    }
}