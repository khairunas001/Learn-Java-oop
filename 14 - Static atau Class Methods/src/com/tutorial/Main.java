package com.tutorial;

import java.util.ArrayList;

class Player {
    private static int numberOfPlayer;
    private static ArrayList<String> nameList = new ArrayList<String>();

    private String name;

    Player(String name) {
        this.name = name;
        Player.numberOfPlayer++;
        Player.nameList.add(this.name);
    }

    void show() {
        System.out.println("Number of Player = " + Player.numberOfPlayer);
    }

    // static method
    static void showNumberOfPlayer() {
        System.out.println("Number of Player = " + Player.numberOfPlayer);
    }

    static ArrayList<String> getNames() {
        return Player.nameList;
    }

    static void showAllNames() {
        int uidPlayer = 1;
        for (String names : getNames()) {
            System.out.println("Player " + uidPlayer + " : " + names);
            uidPlayer++;
        }
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Player player1 = new Player("G4UL");
        Player player2 = new Player("Mia");
        Player player3 = new Player("Tokito");
        Player player4 = new Player("Joko Kenthir");
        Player player5 = new Player("Becak");
        Player player6 = new Player("Zheprythomolus");
        Player player7 = new Player("Guna Makan");
        Player player8 = new Player("Baku Hantam");

        player1.show(); // hanya bisa digunakan tanpa static

        Player.showNumberOfPlayer(); // disarankan untuk digunakan dengan static class, bisa menggunakan objeck
                                     // player 1 tapi jadi tidak static

        ArrayList allPlayerNames = Player.getNames();
        System.out.println("Names = " + allPlayerNames);

        Player.showAllNames();
    }
}
