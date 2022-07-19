package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String[][] kursi = new String[5][7];
        ArrayList<String> history = new ArrayList<>();
        int kosong = 35, terisi = 0, row = 0, pilihan = 0, nomorkursi = 0;
        String nama;
        boolean cek = false;

        Scanner book = new Scanner(System.in);
        System.out.println("Summary: Terdapat " + kosong + " kursi yang belum di book dan " + terisi + " kursi yang sudah di book");
        menu();
        do {
            try {
                pilihan = Integer.parseInt(book.nextLine().trim());
                if (pilihan >= 1 && pilihan <= 3) {
                    cek = true;
                }
            } catch (Exception ex) {
                System.out.println("harus angka 1-3");
                cek = false;
            }
        }
        while (cek == false);

        cek = false;
        do {
            switch (pilihan) {
                case 1:
                    System.out.println("pilih row: ");
                    do {
                        row = Integer.parseInt(book.nextLine());
                        if (row >= 1 && row <= 5) {
                            cek = true;
                        } else {
                            System.out.println("row hanya ada 1-5");
                            cek = false;
                        }
                    } while (cek == false);
                    System.out.println("pilih nomor kursi: ");
                    do {
                        nomorkursi = Integer.parseInt(book.nextLine());
                        if (nomorkursi >= 1 && nomorkursi <= 7) {
                            cek = true;
                        } else {
                            System.out.println("nomor kursi hanya dari 1-7!");
                            cek = false;
                        }
                    } while (cek == false);

                    if (kursi[row - 1][nomorkursi - 1] != null) {
                        System.out.println("Maaf kursi sudah di booked");
                    } else {
                        System.out.println("Masukan nama anda");
                        nama = book.nextLine();
                        kursi[row - 1][nomorkursi - 1] = nama;
                        System.out.println("booking berhasil");

                        Locale indonesia = new Locale("id", "ID");
                        DateTimeFormatter indoFormat = DateTimeFormatter.ofPattern("dd/mm/yyyy HH:mm", indonesia);
                        String tanggal = indoFormat.format(LocalDateTime.now());
                        history.add(String.format("Pada tanggal: " + tanggal + " Row " + row + ", Kursi " + nomorkursi + " berhasil di book oleh " + nama));
                        kosong--;
                        terisi++;

                    }
                    break;

                case 2:
                    statuskursi(kursi);
                    break;
                case 3:
                    history(history);
                    break;
                default:
                    System.out.println("");
                    break;
            }
            System.out.println("Summary: Terdapat " + kosong + " kursi yang belum di book dan " + terisi + " kursi yang sudah di book");
            menu();
            do {
                try {
                    pilihan = Integer.parseInt(book.nextLine().trim());
                    if (pilihan >= 1 && pilihan <= 3) {
                        cek = true;
                    }
                } catch (Exception ex) {
                    System.out.println("harus angka 1-3");
                    cek = false;
                }
            }
            while (cek == false);
            cek = false;
        }
        while(cek == false);


    }

    public static void menu() {
        System.out.println("""
                “Menu mana yang akan kalian ambil?”
                “1. Book kursi”
                “2. Lihat semua status kursi”
                “3. Lihat history log booked”
                pilih menu: 
                """);
    }

   public static void statuskursi(String[][] kursi) {
        int row = 0;
        int nomorkursi = 0;
        for (String[] pilihbaris : kursi) {
            row++;
            nomorkursi = 0;
            for (String pilihnomor : pilihbaris) {
                nomorkursi++;
                if (pilihnomor != null) {
                    System.out.println("row " + row + ", kursi " + nomorkursi + ": booked");
                } else {
                    System.out.println("row " + row + ", kursi " + nomorkursi + ": vacant");
                }
            }
        }
    }

    static void history(ArrayList<String> history) {
        if (history.isEmpty()){
            System.out.println("belum ada histori pemesanan");
        }
        else {
            for (String value : history) {

                System.out.println(history);

            }
        }
    }



}




