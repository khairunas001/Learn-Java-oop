package com.tutorial;

import com.hero.AttackMelee;
import com.hero.AttackRange;
import com.hero.HeroAgility;

public class Main {
    public static void main(String[] args) {
        HeroAgility hero1 = new HeroAgility("Suroto", 100);
        HeroAgility hero2 = new HeroAgility("Blonde", 20);

        hero1.display();
        hero2.display();

        hero1.setAttackSkill(new AttackMelee(200));
        hero2.setAttackSkill(new AttackRange(200, 90.2));

        hero1.attack(hero2);
        hero2.attack(hero1);

    }
}
