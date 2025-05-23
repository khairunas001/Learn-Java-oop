package com.tutorial;

class Player {
    String name; // default, dia akan bisa dibaca dan ditulis dari luar class
    public int exp; // public, dia akan bisa dibaca dan ditulis dari luar class
    private int health; // private, hanya akan bisa dibaca dan ditulis di dalam class saja

    Player(String name, int exp, int health) {
        this.name = name;
        this.exp = exp;
        this.health = health;
    }

    // default modifier access
    void display() {
        tambahExp(); // contoh mengakses private methods
        System.out.println("\nName\t: " + this.name);
        System.out.println("exp\t: " + this.exp);
        System.out.println("health\t: " + this.health); // membaca, tapi didalam class
    }

    // public
    public void ubahName(String newName) {
        this.name = newName;

    }

    // private
    private void tambahExp() {
        int addExp = 100;
        if (this.exp == 1000) {
            this.exp = 1000;
            System.out.print("\nEXP AND SUDAH PENUH");
        } else {
            this.exp += addExp;
            System.out.printf("\nEXP BERHASIL DITINGKATKAN %1d EXP", addExp);
        }

    }
}

public class Main {
    public static void main(String[] args) {

        Player player1 = new Player("Marni", 0, 100);

        // default
        System.out.println(player1.name); // membaca data
        player1.name = "Ishikawa"; // Menulis data
        System.out.println(player1.name); // membaca data

        // public
        System.out.println(player1.exp); // membaca data
        player1.exp = 100; // Menulis data
        System.out.println(player1.exp); // membaca data

        // private (tidak bisa diakses)
        // System.out.println(player1.health); // membaca data
        // player1.health = 200; // Menulis data
        // System.out.println(player1.health); // membaca data

        // methods

        // default
        player1.display();

        // public
        player1.ubahName("Soekatmi");
        player1.display();
        player1.display();
        player1.display();
        player1.display();
        player1.display();
        player1.display();
        player1.display();
        player1.display();
        player1.display();

        // private (tidak bisa diakses)
        // player1.tambahExp();
    }
}