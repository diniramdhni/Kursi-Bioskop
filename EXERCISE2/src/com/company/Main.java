package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //JAWABAN 1
        int X = 1, Y=1;
        double Z=1, formula=0;
        boolean cek = false;

        System.out.println("""
                pilih option dari nomor 1-3
                1. Formula : (XxY)+(ZxY)
                2. Formula: (X-Y+Z)/X
                3. Formula: (X-Z)xY
                pilih nomor: """);
        while (cek == false) {
            try {
                Scanner input = new Scanner(System.in);
                formula = input.nextInt();
                if (formula == 1 || formula == 2 || formula == 3) {
                    cek = true;
                } else {
                    System.out.println("maaf, anda harus input antara 1 atau 2 atau 3");
                    cek = false;
                }
            }
            catch (Exception ex) {
                System.out.println("harus angka 1-3");
                cek = false;
            }
        }

        cek = false;
        System.out.println("input X value dalam bilangan bulat: ");
        while (cek == false) {
            try {
                Scanner input = new Scanner(System.in);
                X = input.nextInt();
                cek = true;
            } catch (Exception ex) {
                System.out.println("X harus bilangan bulat");
                cek = false;
            }
        }
        cek = false;
        System.out.println("input Y value dalam bilangan bulat: ");
        while (cek == false) {
            try {
                Scanner input = new Scanner(System.in);
                Y = input.nextInt();
                cek = true;
            } catch (Exception ex) {
                System.out.println("Y harus bilangan bulat");
                cek = false;
            }
        }
        cek = false;
        System.out.println("input Z value dalam bilangan desimal: ");
        while (cek == false) {
            try {
                Scanner input = new Scanner(System.in);
                Z = input.nextDouble();
                cek = true;
            } catch (Exception ex) {
                System.out.println("Z harus bilangan desimal");
                cek = false;
            }
        }
        cek = false;

        if (formula == 1){
            formula = (X*Y)+(Z*Y);
        }
        if(formula == 2){
            formula = (X-Y+Z)/X;
        }
        if(formula == 3){
            formula = (X-Z)*Y;
        }
        System.out.println("hasilnya adalah: " + formula);


        //JAWABAN 2

        int bulan =0, tahun = 0, tanggal =1, maxday, plusday = 0, plusbulan = 0, plustahun = 0, penambahan=0;
        boolean cek = false;
        LocalDate formattanggal, tanggalkini = LocalDate.now();



        System.out.println("masukkan bulan: ");
        while (cek == false) {
            try {
                Scanner input = new Scanner(System.in);
                bulan = input.nextInt();
                if (bulan >= 1 && bulan <= 12) {
                    cek = true;
                } else {
                    System.out.println("maaf, anda harus input antara 1 sampai 12");
                    cek = false;
                }
            }
            catch(Exception ex){
                System.out.println("harus input berupa integer!");
                cek = false;
            }
        }
        cek = false;
        System.out.println("masukkan tahun: ");
        while (cek == false) {
            try {
                Scanner input = new Scanner(System.in);
                tahun = input.nextInt();
                if (tahun >= 1000 && tahun <= 2022) {
                    cek = true;
                }
                else {
                    System.out.println("maaf input masih salah, anda harus input tahun berupa 4 digit angka sampai 2022. silakan coba lagi");
                    cek = false;
                }
            }
            catch(Exception ex){
                    System.out.println("harus input angka!");
                    cek = false;
                }
       }
        cek = false;
        formattanggal = LocalDate.of(tahun, bulan, tanggal);
        maxday = formattanggal.lengthOfMonth();
        System.out.println("tanggal tertinggi pada bulan " + bulan + " dan tahun " + tahun + " adalah " + maxday );
        while (cek == false) {
            try {
                Scanner input = new Scanner(System.in);
                tanggal = input.nextInt();
                if (tanggal >= 1 && tanggal <= maxday) {
                    cek = true;
                }
                else {
                    System.out.println("maaf input masih salah, maksimal tanggal itu cuma sampai " + maxday);
                    cek = false;
                }
            }
            catch(Exception ex){
                System.out.println("harus input angka!");
                cek = false;
            }
        }
        cek = false;

        System.out.println("""
                pilih nomor 1-3
                1. penambahan hari
                2. penambahan bulan
                3. penambahan tahun
                pilih: """);

        while (cek == false) {
            try {
                Scanner input = new Scanner(System.in);
                penambahan = input.nextInt();
                if (penambahan == 1 || penambahan == 2 || penambahan == 3) {
                    cek = true;
                } else {
                    System.out.println("maaf, anda harus input antara 1 atau 2 atau 3");
                    cek = false;
                }
            }
            catch (Exception ex) {
                System.out.println("harus pilih 1-3!");
                cek = false;
            }
        }
        cek = false;

        while (cek == false) {
            try {
                if (penambahan == 1) {
                    System.out.println("masukkan berapa hari: ");
                    Scanner input = new Scanner(System.in);
                    plusday = input.nextInt();
                    System.out.println(plusday + " hari kemudian dari tanggal ini menjadi tanggal : ");
                    tanggalkini = formattanggal.plusDays(plusday);
                    System.out.println(tanggalkini);
                    cek =   true;
                } else if (penambahan == 2) {
                    System.out.println("masukkan berapa bulan: ");
                    Scanner input = new Scanner(System.in);
                    plusbulan = input.nextInt();
                    System.out.println(plusbulan + " bulan kemudian dari tanggal ini menjadi tanggal : ");
                    tanggalkini = formattanggal.plusMonths(plusbulan);
                    System.out.println(tanggalkini);
                    cek =   true;
                } else {
                    System.out.println("masukkan berapa tahun: ");
                    Scanner input = new Scanner(System.in);
                    plustahun = input.nextInt();
                    System.out.println(plustahun + " tahun kemudian dari tanggal ini menjadi tanggal : ");
                    tanggalkini = formattanggal.plusYears(plustahun);
                    System.out.println(tanggalkini);
                    cek =  true;
                }
            }
            catch (Exception ex) {
                System.out.println("harus angka!");
                cek = false;
            }
        }
//
//        //JAWABAN 3
        double kencangangin = 0, jarak= 0, ketinggian = 0;
        int detik = 0;
        for (jarak = 0; jarak<13; jarak+=2){
            for(ketinggian = 0; ketinggian<=6; ketinggian+=3.5){
                System.out.println("bola di jarak " + jarak + "m, di ketinggian " + ketinggian +"m");
            }
        }

    }
}
