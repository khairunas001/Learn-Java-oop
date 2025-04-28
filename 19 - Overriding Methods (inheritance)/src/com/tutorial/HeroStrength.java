package com.tutorial;

// subclass, child class, derived class
class HeroStrength extends Hero {
    double defencePower;

    void display() {
        System.out.println("\nHERO STREGHTH : ");
        System.out.println("HERO NAME : " + this.name);
        System.out.println("HERO DEFENCE POWER : " + this.defencePower);
    }
}
