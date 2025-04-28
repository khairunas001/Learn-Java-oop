package com.tutorial;

public class Main {
    public static void main(String[] args) {

        Hero hero1 = new Hero();
        hero1.name = "Joko";
        // hero1.defencePower = gak punya;
        hero1.display();

        HeroStrength hero2 = new HeroStrength();
        hero2.name = "Budiyatno";
        hero2.defencePower = 304;
        hero2.display();
    }
}