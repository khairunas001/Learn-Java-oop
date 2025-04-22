package com.tutorial;

import java.lang.reflect.Array;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner nilaiAwal = new Scanner(System.in);
        Scanner nilaiAkhir = new Scanner(System.in);
        Scanner tulisPesan = new Scanner(System.in);

        System.out.print("\nMASUKKAN NILAI AWAL PERULANGAN = ");
        int awalPerlulangan = nilaiAwal.nextInt();

        System.out.print("\nMASUKKAN NILAI AKHIR PERULANGAN = ");
        int akhirPerlulangan = nilaiAkhir.nextInt();

        System.out.print("\nMASUKKAN PESAN YANG DIULANG = ");
        String pesan = tulisPesan.next();

        while (awalPerlulangan > akhirPerlulangan) {
            System.err.println("\nNILAI YANG ANDA MASUKKAN SALAH \n SILAHKAN COBA LAGI!!");

            System.out.print("\nMASUKKAN NILAI AWAL PERULANGAN = ");
            awalPerlulangan = nilaiAwal.nextInt();

            System.out.print("\nMASUKKAN NILAI AKHIR PERULANGAN = ");
            akhirPerlulangan = nilaiAkhir.nextInt();

            System.out.print("\nMASUKKAN PESAN YANG DIULANG = ");
            pesan = tulisPesan.next();
        }

        int banyakPerulangan = totalPerlulangan(awalPerlulangan, akhirPerlulangan);
        int jumlahPerulangan = jumlahDariPerulangan(awalPerlulangan, banyakPerulangan);
        String pesanBerulang = tulisBerapaBanyak(awalPerlulangan, banyakPerulangan, pesan);
        String[] pesanBerulangArray = tulisDalamArray(awalPerlulangan, banyakPerulangan, pesan);
        nilaiAwal.close();
        nilaiAkhir.close();
        tulisPesan.close();
        System.out.printf("\nBANYAKNYA PERULANGAN = %1d", banyakPerulangan);
        System.out.printf("\nTOTAL DARI PENJUMLAHAN PERULANGAN = %1d", jumlahPerulangan);
        System.out.printf("\nTOTAL DARI PENJUMLAHAN PERULANGAN = %1s", pesanBerulang);
        System.out.print("\nTOTAL DARI PENJUMLAHAN PERULANGAN = " + Arrays.toString(pesanBerulangArray));
    }

    private static String[] tulisDalamArray(int awalPerlulangan, int akhirPerulangan, String message) {
        int ukuranArray = akhirPerulangan - awalPerlulangan + 1; // hitung berapa banyak elemen
        String[] pesan = new String[ukuranArray]; // buat array sebesar ukuran yang dibutuhkan

        for (int i = 0; i < ukuranArray; i++) {
            pesan[i] = message; // isi setiap elemen array dengan message
        }

        return pesan;
    }

    private static String tulisBerapaBanyak(int awalPerlulangan, int akhirPerulangan, String message) {
        String pesan = " ";
        for (int i = awalPerlulangan; i <= akhirPerulangan; i++) {
            pesan += message + "\n";
        }
        return pesan;
    }

    private static int jumlahDariPerulangan(int awalPerlulangan, int akhirPerulangan) {
        int total = 0;
        for (int i = awalPerlulangan; i <= akhirPerulangan; i++) {
            total += i;
        }
        return total;

    }

    private static int totalPerlulangan(int awalPerlulangan, int akhirPerulangan) {
        int targetPerulangan = 0;
        for (int i = awalPerlulangan; i <= akhirPerulangan; i++) {
            targetPerulangan++;
        }
        return targetPerulangan;
    }
}
