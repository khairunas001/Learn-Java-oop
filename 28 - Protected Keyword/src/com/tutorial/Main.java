package com.tutorial;

import com.hero.Hero;
import com.hero.HeroAgility;

// kunci dari polimorfisme adalah hubungan is-a atau "adalah"

public class Main {
    public static void main(String[] args) {
        HeroAgility hero1 = new HeroAgility("Bogor", 28);

        hero1.display();

        hero1.getName();// masih bisa dilakukan karena public
        // hero1.setName(); // tidak bisa dilakukan karena tidak satu package
        hero1.win();
        hero1.display();
    }

}
