package com.tutorial;

import java.util.ArrayList;

public class Player {
    private String name;
    private static int jumlahPlayer;
    private static ArrayList<String> nameList = new ArrayList<String>();

    // Overloading constructor
    // opsi 1:
    Player(String name) {
        jumlahPlayer++;
        Player.nameList.add(name);
        this.name = name;

    }

    // opsi 2:
    Player() {
        jumlahPlayer++;
        Player.nameList.add(name);
        this.name = "Player " + Player.jumlahPlayer;

    }

    void show() {
        System.out.println("Name : " + this.name);

    }

    static ArrayList<String> getNames() {
        return Player.nameList;
    }

    static void showAllNames() {
        int uidPlayer = 1;
        for (String names : getNames()) {

            if (names == null) {
                System.out.println("Player " + uidPlayer + " : " + uidPlayer);
            } else {
                System.out.println("Player " + uidPlayer + " : " + names);
            }
            uidPlayer++;
        }
    }
}
