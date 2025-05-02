package com.tutorial;

public class Hero extends Object {
    String name;

    public Hero(String name) {
        this.name = name;

    }

    public void display() {
        System.out.println("Name : " + this.name);
    }

    @Override
    public boolean equals(Object otherObject) {
        System.out.println("-------------------------------------------------------------------");
        if (this == otherObject) {
            System.out.println("\n" + this + " dan " + otherObject + " dalah Object dengan referensi yang sama");
            return true;
        } else if (this.getClass() == otherObject.getClass()) {
            System.out.println(
                    "\n" + this.getClass() + " dan " + otherObject.getClass()
                            + " adalah Object dengan class yang sama");
            System.out.println("\n" + this + " dan " + otherObject + " dalah Object dengan referensi yang berbeda");

            Hero other = (Hero) otherObject;

            if (this.name == other.name) {
                System.out.println("\n" + this.name + " dan " + other.name + " memiliki nama yang sama");
                return true;
            } else {
                System.out.println("\n" + this.name + " dan " + other.name + " memiliki nama yang berbeda");
                return false;
            }
        } else {
            return false;
        }
    }

}
