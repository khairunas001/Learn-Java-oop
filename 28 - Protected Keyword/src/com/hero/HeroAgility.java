package com.hero;

public class HeroAgility extends Hero {
    private double speedAttack;

    // subclass cunstructor
    public HeroAgility(String name, double speedAttack) {
        super(name);
        this.speedAttack = speedAttack;

    }

    public void display() {
        System.out.println("\nName : " + this.getName());
        System.out.println("\nSpeed Attack : " + this.speedAttack);
    }

    public void win() {
        this.setName(this.getName() + " is a winner");

    }
}
