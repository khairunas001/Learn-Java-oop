package com.tutorial;

public class HeroIntel extends Hero {
    public String type;

    HeroIntel(String name, double health) {
        super(name, health);
        this.type = "intel";
    }

    public void display() {
        System.out.println("\n" + this.getName() + " is an " + this.type + " Hero");
    }

    public void castMagic() {
        System.out.println("\nMengeluarkan Magic Intelejen");
    }

}
