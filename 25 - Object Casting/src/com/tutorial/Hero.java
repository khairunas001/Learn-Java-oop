package com.tutorial;

public class Hero {
    private String name;
    private double health;

    Hero(String name, double health) {
        this.name = name;
        this.health = health;
    }

    // getter
    public String getName() {
        return this.name;
    }

    // getter
    public double getHealth() {
        return this.health;
    }

    // setter
    public void setName(String newName) {
        this.name = newName;
    }

    // setter
    public void setHealth(double newHealth) {
        this.health = newHealth;
    }

    // method umum
    public void display() {
        System.out.println("\n" + this.getName() + " is a regular hero");
    }
}
