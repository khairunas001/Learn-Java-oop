package com.tutorial;

public class HeroAgility extends Hero {

    public String type;

    HeroAgility(String name, double health) {
        super(name, health);
        this.type = "Agility";
    }

    public void display() {
        System.out.println("\n" +this.getName() + " is an " + this.type + "Hero");
    }
}
