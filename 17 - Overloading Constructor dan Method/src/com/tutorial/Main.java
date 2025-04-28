package com.tutorial;

public class Main {
    public static void main(String[] args) {

        // overloading pada constructor
        Player player1 = new Player("Jokowul");
        Player player2 = new Player("Mugiman");
        Player player3 = new Player();
        Player player4 = new Player();
        Player player5 = new Player();
        player1.show();
        player3.show();

        // overloading methods
        int a = Matematika.tambah(1, 19);
        System.out.println(a);
        double b = Matematika.tambah(1, 0.98);
        System.out.println(b);
        String c = Matematika.tambah("Jowo", "Koentji");
        System.out.println(c);

        System.out.println("NAMES : " + Player.getNames());
        Player.showAllNames();
    }

}
