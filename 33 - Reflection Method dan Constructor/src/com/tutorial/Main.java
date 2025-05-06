package com.tutorial;

import com.hero.HeroAgility;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args)
            throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException,
            NoSuchMethodException {
        System.out.println("\n===============MODIFIKASI ATRIBUTE PRIVATE=========================\n");

        HeroAgility hero1 = new HeroAgility("Sumantolo", 89.99);

        // ================================================================MODIFIKASI
        // ATRIBUTE===========================================================================
        // access modifier
        hero1.nickname = "Soekontoel";
        hero1.displayAll(); // bisa dilakukan
        // hero1.heroType = "intel"; tidak bisa lakukan
        // hero1.name = "ucup"; tidak bisa dilakukan

        // Reflection
        Class<?> classHero1 = hero1.getClass();
        Class<?> parentClassHero1 = hero1.getClass().getSuperclass();
        System.out.println("\nclass : " + classHero1.getName());
        System.out.println("parent : " + parentClassHero1.getName());

        // cek attribute dari object hero1
        System.out.println("\nattribute dari object hero1");
        Field[] hero1Fields = classHero1.getFields();
        System.out.println("jumlah attribute adalah : " + hero1Fields.length);
        System.out.println("attribute : " + hero1Fields[0].getName()); // hero1Fields[1].getName() tidak bisa dilakukan
                                                                       // karena atributenya private

        // cek attribute semua object hero1
        System.out.println("\nattribute semua dari object hero1");
        Field[] hero1AllFields = classHero1.getDeclaredFields();
        System.out.println("jumlah attribute adalah: " + hero1AllFields.length);
        System.out.println("attribute: ");
        for (Field field : hero1AllFields) {
            System.out.println(field.getName());
        }

        System.out.println("\nattribute semua dari super class Hero");
        Field[] heroAllFields = parentClassHero1.getDeclaredFields(); // .getDeclaredFields() digunakan untuk dapat
                                                                      // mengambil semua attribute baik yang public atau
                                                                      // private
        System.out.println("jumlah attribute adalah: " + heroAllFields.length);
        System.out.println("attribute: ");
        for (Field field : heroAllFields) {
            System.out.println(field.getName());
        }

        // kita ubah nilainya dengan reflection (digunakan untuk modifikasi private
        // method)
        System.out.println("\n=============Kita ubah===============");
        hero1.displayAll();
        System.out.println("\n==============Menjadi================");

        // merubah public bisa
        hero1AllFields[0].set(hero1, "joko");
        // merubah private
        hero1AllFields[1].setAccessible(true); // .setAccessible(true) digunakan untuk merubah acces dari private ke
                                               // true atau sebaliknya
        hero1AllFields[1].set(hero1, "intel");

        // ubah bagian supreclass
        heroAllFields[0].setAccessible(true);
        heroAllFields[0].set(hero1, "Ucup");
        heroAllFields[1].setAccessible(true);
        heroAllFields[1].set(hero1, 0);
        hero1.displayAll();

        // ============================================================MODIFIKASI
        // METHOD===============================================================================================

        System.out.println("\n===============MODIFIKASI METHOD PRIVATE=========================\n");
        System.out.println("\n===============Kita akan mengambil seluruh method=========================\n");

        Method[] methodHero = hero1.getClass().getDeclaredMethods();

        for (Method method : methodHero) {
            if (method.getName().equals("setHeroType")) {
                System.out.println("\nmenginvoke method setHeroType\n");
                method.setAccessible(true);
                method.invoke(hero1, "Attacker");
            }

            if (method.getName().equals("setNickName")) {
                System.out.println("\nmenginvoke method setNickName\n");
                method.setAccessible(true);
                method.invoke(hero1, "Paijo Mumet Ndase");
            }
        }

        hero1.displayAll();

        // ===============================================================MODIFIKASI
        // CONSTRUCTOR===============================================================================

        System.out.println("\n===============MODIFIKASI CONSTRUCTOR=========================\n");

        // kita ingin mengakses constructor
        Object newHero = new Object();

        Constructor<?>[] constructorHero = hero1.getClass().getConstructors();
        for (Constructor<?> constructor : constructorHero) {
            if (constructor.getName().equals("com.Hero.HeroAgility")) {
                Object[] obj = { "james", 20 };
                newHero = constructor.newInstance(obj);
            }
        }
        HeroAgility hero2 = (HeroAgility) newHero;
        hero2.displayAll();
    }
}
