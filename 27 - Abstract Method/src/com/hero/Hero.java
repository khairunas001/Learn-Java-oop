package com.hero;

public abstract class Hero {
    private String name;
    private int level;

    public Hero(String name) {
        this.name = name;
        this.level = 1;
    }

    public void display() {
        System.out.println("\nAku adalah " + this.name);
        System.out.println("Level : " + this.level);
    }

    public abstract void levelUp();

    public void setlevel(int deltaLevel) {
        this.level = this.level + deltaLevel;
    }
}
