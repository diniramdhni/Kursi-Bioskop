package com.company;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //JAWABAN 1
       // ((X +Y + Z) x (Z / 2)) - Z


        int X, Y;
        double Z, Hasil;


        Scanner Perhitungan = new Scanner(System.in);
        System.out.println("input value X dalam bilangan bulat: ");
        X = Perhitungan.nextInt();
        System.out.println("input value Y dalam bilangan bulat: ");
        Y = Perhitungan.nextInt();
        System.out.println("input value Z dalam bilangan desimal: ");
        Z = Perhitungan.nextDouble();
        Hasil = ((X +Y + Z) * (Z / 2)) - Z;
        System.out.println("hasilnya adalah: " + Hasil);

        System.out.println("ubah value X menjadi: ");
        X = Perhitungan.nextInt();
        Hasil = ((X +Y + Z) * (Z / 2)) - Z;
        System.out.println("hasilnya adalah: " + Hasil);

        System.out.println("ubah value Y menjadi: ");
        Y = Perhitungan.nextInt();
        Hasil = ((X +Y + Z) * (Z / 2)) - Z;
        System.out.println("hasilnya adalah: " + Hasil);

        System.out.println("ubah value Z menjadi: ");
        Z = Perhitungan.nextDouble();
        Hasil = ((X +Y + Z) * (Z / 2)) - Z;
        System.out.println("hasilnya adalah: " + Hasil);


        //jAWABAN 2
        LocalDate lahir;
        LocalDate today = LocalDate.now();
        int tanggal, bulan, tahun, tanggalumur, bulanumur, tahunumur;
        String nama;

        Scanner Umur = new Scanner(System.in);
        System.out.println("Masukkan tanggal ulang tahun anda: ");
        tanggal = Umur.nextInt();
        System.out.println("Masukkan bulan ulang tahun anda: ");
        bulan = Umur.nextInt();
        System.out.println("Masukkan tahun ulang tahun anda: ");
        tahun = Umur.nextInt();

        System.out.println("Masukkan Nama anda: ");
        nama = Umur.next();

        lahir = LocalDate.of(tahun, bulan, tanggal);
        Period umur = Period.between(lahir, today);
        tahunumur = umur.getYears();
        bulanumur = umur.getMonths();
        tanggalumur = umur.getDays();
        System.out.println("Menghitung umur " + nama );
        System.out.println("umur " + nama + " adalah " + tahunumur + " tahun ");




        //JAWABAN 3
        int harga, diskon;
        BigDecimal hargadiskon, hargaakhir, bigharga, bigdiskon;
        String RPharga, RPhargaakhir, RPdiskon;

        Scanner hitungdiskon = new Scanner(System.in);
        System.out.println("Masukkan nilai harga barang: ");
        harga= hitungdiskon.nextInt();

        bigharga = new BigDecimal(harga);
        Locale localeIndonesia = new Locale("id", "ID");
        RPharga = NumberFormat.getCurrencyInstance(localeIndonesia).format(bigharga);
        System.out.println("harga barang adalah : " + RPharga);
        System.out.println("Masukkan presentase diskon: ");
        diskon= hitungdiskon.nextInt();
        System.out.println("diskon sebesar: " + diskon +"%");
        bigdiskon = new BigDecimal(diskon);
        hargadiskon = bigharga.multiply(bigdiskon).divide(new BigDecimal(100));
        RPdiskon = NumberFormat.getCurrencyInstance(localeIndonesia).format(hargadiskon);
        System.out.println("total diskon sebesar: " + RPdiskon);
        hargaakhir = bigharga.subtract(hargadiskon);
        RPhargaakhir = NumberFormat.getCurrencyInstance(localeIndonesia).format(hargaakhir);
        System.out.println("harga barang setelah diskon : " + RPhargaakhir);





    }
}
