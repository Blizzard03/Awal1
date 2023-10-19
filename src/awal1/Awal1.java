/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package awal1;

import awal1.Mahasiswa_Class.Mahasiswa;

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
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNPM("202015130075");
        mhs.setNama("Ariel");
        mhs.setAlamat("Jl.Dipati Ukur 1000");
        mhs.setTelepon("08171234567");
        mhs.setTahunlahir(1994);

        // Mahasiswa 1 Edition 2
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.NPM = "2015130075";
        mhs1.Nama = "Ariel";
        mhs1.Alamat = "Jl. Dipati Ukur 1000";
        mhs1.Telepon = "08171234567";
        mhs1.tahunlahir = 1994;

        // Mahasiswa 2
        Mahasiswa mhs2 = new Mahasiswa(null, null, null, null, 0);

        System.out.println("**************************************");
        System.out.println("Mahasiswa 1 - Edition 1");
        System.out.println("**************************************");
        System.out.printf("NPM : %s\n", mhs.getNPM());
        System.out.printf("Nama : %s\n", mhs.getNama());
        System.out.printf("Alamat : %s\n", mhs.getAlamat());
        System.out.printf("Telepon : %s\n", mhs.getTelepon());
        System.out.printf("Umur : %d\n", mhs.getTahunlahir());
        System.out.println("**************************************");

        System.out.println("**************************************");
        System.out.println("Mahasiswa 1 - Edition 2");
        System.out.println("**************************************");
        System.out.printf("NPM : %s\n", mhs1.getNPM());
        System.out.printf("Nama : %s\n", mhs1.getNama());
        System.out.printf("Alamat : %s\n", mhs1.getAlamat());
        System.out.printf("Telepon : %s\n", mhs1.getTelepon());
        System.out.printf("Umur : %d\n", mhs1.getTahunlahir());
        System.out.println("**************************************");

        System.out.println("This Program Made by WPA TEAM");
        System.out.println("**************************************");

    }

}
