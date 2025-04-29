package com.tutorial;

public class IntelHero extends Hero {
    IntelHero(String name, double health) {
        super(name, health);
        // System.out.println(this.health); tidak bisa diakses karena private
    }

    // visibility harus sama dengan superclass
    public void display() {
        System.out.println("\n" + this.name + " adalah Intel Hero mempunyai banyak : " + this.getHealth());
    }

    // kita coba override final setter, tidak bisa dilakukan
    // void setHealth(double newHealth){
    // System.out.println("mencoba memasukan health = " + newHealth);
    // }

    // ini bisa dilakukan
    // void setHealth(String newHealth) {
    // System.out.println("mencoba memasukan health = " + newHealth);
    // }
}
