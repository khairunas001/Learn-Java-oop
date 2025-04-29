package com.hero;

public abstract class Hero {
    String name;
    // protected String name; // jarang dilakukan, karena ini menyalahi encapsulasi

    // superclass cunstructor
    public Hero(String name) {
        this.name = name;
    }

    // getter
    public String getName() {
        return this.name;
    }

    // setter
    protected void setName(String name) {
        this.name = name;
    }

    // abstract method
    public abstract void display();
}
