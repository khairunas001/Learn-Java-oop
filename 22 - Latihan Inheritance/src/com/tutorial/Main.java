package com.tutorial;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Gendut", 23, 100);
        HeroStrength hero2 = new HeroStrength("Paidjo", 28.9, 100);
        HeroIntelligent hero3 = new HeroIntelligent("Paidjo", 28.9, 100);
        hero1.display();
        hero2.display();
        hero3.display();

        hero1.attack(hero2);
        hero2.attack(hero1);
        hero1.attack(hero3);
    }
}
