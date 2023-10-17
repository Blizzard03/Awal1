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
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNPM("202015130075");
        mhs.setNama("Ariel");
        mhs.setAlamat("Jl.Dipati Ukur 1000");
        mhs.setTelepon("08171234567");
        mhs.setTahunlahir(1994);
        
        System.out.printf("NPM : %s\n", mhs.getNPM());
        System.out.printf("Nama : %s\n", mhs.getNama());
        System.out.printf("Alamat : %s\n", mhs.getAlamat());
        System.out.printf("Telepon : %s\n", mhs.getTelepon());
        System.out.printf("Umur : %d\n", mhs.getTahunlahir());
        System.out.println("**************************************");
        System.out.println("This Program Made by WPA TEAM");
        System.out.println("**************************************");
        
        
    }
    
}
