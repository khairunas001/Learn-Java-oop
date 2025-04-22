package com.tutorial;

class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;

}

public class App {
    public static void main(String[] args) throws Exception {

        // instansiasi / membuat object
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Paidi";
        mahasiswa1.NIM = "87/PA/99007/FA/2200";
        mahasiswa1.jurusan = "Sastra Mesin";
        mahasiswa1.IPK = 2.5;
        mahasiswa1.umur = 29;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);

        // instansiasi / membuat object
        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Suratijo";
        mahasiswa2.NIM = "87/PA/99999/FA/2200";
        mahasiswa2.jurusan = "Sastra Nuklir";
        mahasiswa2.IPK = 3.32;
        mahasiswa2.umur = 99;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur);

    }
}
