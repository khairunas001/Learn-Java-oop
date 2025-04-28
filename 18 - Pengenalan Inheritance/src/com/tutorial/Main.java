package com.tutorial;

public class Main {
    public static void main(String[] args) {

        Hero hero1 = new Hero();
        hero1.name = "Joko";
        hero1.display();

        HeroStreghth hero2 = new HeroStreghth();
        hero2.name = "Budiyatno";
        hero2.display();

        HeroIntelligent hero3 = new HeroIntelligent();
        hero3.name = "Saiful";
        hero3.display();
    }
}