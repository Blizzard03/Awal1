/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package awal1.Main_Class;

import awal1.Mahasiswa_Class.Master.Mahasiswa;
import awal1.Mahasiswa_Class.Sub.MahasiswaS1;
import awal1.Mahasiswa_Class.Sub.MahasiswaS3;

/**
 *
 * @author mariq
 */
public class Awal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Mahasasiswa 1 Edition 1
        final Mahasiswa mhs = new Mahasiswa();
        mhs.setNPM("202015130075");
        mhs.setNama("Ariel");
        mhs.setAlamat("Jl.Dipati Ukur 1000");
        mhs.setTelepon("08171234567");
        mhs.setTahunlahir(1994);

        // Mahasiswa 1 Edition 2
        final Mahasiswa mhs1 = new Mahasiswa();
        mhs1.NPM = "2015130075";
        mhs1.Nama = "Ariel";
        mhs1.Alamat = "Jl. Dipati Ukur 1000";
        mhs1.Telepon = "08171234567";
        mhs1.tahunlahir = 1994;

        // Mahasiswa 2
        final Mahasiswa mhs2 = new Mahasiswa("2015130077", "Budiman", "Jl.Dago 50", "-", 1997);

        // Mahasiswa 3
        final Mahasiswa mhs3 = new Mahasiswa("2015130079");

        // Mahasiswa 4
        final Mahasiswa mhs4 = new Mahasiswa("2015130079", 1993);

        // Mahasiswa 5
        final Mahasiswa mhs5 = new Mahasiswa(1994, "2015130081");

        // Mahasiswa 6
        MahasiswaS1 mhs6 = new MahasiswaS1("2015130087", "Antonius", "Jl. Merdeka 37", "-", 1997, 5);

        // Mahasiswa 7
        MahasiswaS3 mhs7 = new MahasiswaS3("2015330087", "Budiman", "Jl. Cicendo 51", "-", 1987, 2, 3);
        System.out.println("**************************************");
        System.out.println("AWAL 1 PROGRAM");
        System.out.println("**************************************");
        System.out.println("**************************************");
        System.out.println("Mahasiswa 1 - Edition 1");
        System.out.println("**************************************");
        System.out.printf("NPM : %s\n", mhs.getNPM());
        System.out.printf("Nama : %s\n", mhs.getNama());
        System.out.printf("Alamat : %s\n", mhs.getAlamat());
        System.out.printf("Telepon : %s\n", mhs.getTelepon());
        System.out.printf("Umur : %d\n", Mahasiswa.hitungUmur(mhs.getTahunlahir()));
        System.out.println("**************************************");

        System.out.println("**************************************");
        System.out.println("Mahasiswa 1 - Edition 2");
        System.out.println("**************************************");
        System.out.printf("NPM : %s\n", mhs1.getNPM());
        System.out.printf("Nama : %s\n", mhs1.getNama());
        System.out.printf("Alamat : %s\n", mhs1.getAlamat());
        System.out.printf("Telepon : %s\n", mhs1.getTelepon());
        System.out.printf("Umur : %d\n", Mahasiswa.hitungUmur(mhs.getTahunlahir()));
        System.out.println("**************************************");

        System.out.println("**************************************");
        System.out.println("Mahasiswa 2");
        System.out.println("**************************************");
        System.out.printf("NPM : %s\n", mhs2.getNPM());
        System.out.printf("Nama : %s\n", mhs2.getNama());
        System.out.printf("Alamat : %s\n", mhs2.getAlamat());
        System.out.printf("Telepon : %s\n", mhs2.getTelepon());
        System.out.printf("Umur : %d\n", Mahasiswa.hitungUmur(mhs2.getTahunlahir()));
        System.out.println("**************************************");

        System.out.println("**************************************");
        System.out.println("Mahasiswa 3");
        System.out.println("**************************************");
        System.out.printf("NPM : %s\n", mhs3.getNPM());
        System.out.println("**************************************");

        System.out.println("**************************************");
        System.out.println("Mahasiswa 4");
        System.out.println("**************************************");
        System.out.printf("NPM : %s\n", mhs4.getNPM());
        System.out.printf("Umur : %d\n", Mahasiswa.hitungUmur(mhs4.getTahunlahir()));
        System.out.println("**************************************");

        System.out.println("**************************************");
        System.out.println("Mahasiswa 5");
        System.out.println("**************************************");
        System.out.printf("Umur : %d\n", Mahasiswa.hitungUmur(mhs5.getTahunlahir()));
        System.out.printf("NPM : %s\n", mhs5.getNPM());
        System.out.println("**************************************");
        System.out.printf("NPM  Nama   Alamat    Telepon   Tahunlahir  Sertifikat\n");
        System.out.println("**************************************");
        mhs6.tampilkan();
        System.out.printf("NPM  Nama   Alamat    Telepon   Tahunlahir  Konferensi  Jurnal\n");
        mhs7.tampilkan();
        System.out.printf("Jumlah mahasiswa : %d orang\n", Mahasiswa.getJml());

        System.out.println("This Program Made by WPA TEAM");
        System.out.println("**************************************");

    }

}