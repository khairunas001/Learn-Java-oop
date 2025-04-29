package com.tutorial;

import com.hero.Hero;
import com.hero.HeroIntel;
import com.hero.HeroStrength;
import com.hero.HeroAgility;

public class Main {
    public static void main(String[] args) {

        // membuat object dari kelas non-abstract
        HeroIntel hero1 = new HeroIntel("Balabu");
        hero1.display();

        HeroAgility hero2 = new HeroAgility("Joko Wu Xie Tang");
        hero2.display();

        // membuat object dari kelas abstract tidak bisa dilakukan,
        // karena Class abstrak Hero tidak boleh memiliki Objek dan hanya sebagai
        // blueprint untuk subclass
        // Hero hero3 = new Hero("Mario");
        // hero3.display();

        // 🔹 Kapan Menggunakan Abstract Class?
        // 1. Jika ingin membuat kerangka umum bagi beberapa kelas turunan.

        // 2. Jika ada method yang wajib diimplementasikan oleh semua subclass.

        // 3. Saat ada fungsi default, tapi sebagian behavior harus didefinisikan
        // oleh subclass.

        HeroStrength hero3 = new HeroStrength("Paidjo Baxie Petjuel");
        hero3.display();

        hero1.levelUp();
        hero2.levelUp();
        hero3.levelUp();

        hero1.display();
        hero2.display();
        hero3.display();

    }

}
