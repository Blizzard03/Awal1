/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package awal1.Mahasiswa_Class;

/**
 *
 * @author mariq
 */
public class Mahasiswa {

    public String NPM;
    public String Nama;

    public String Alamat;
    public String Telepon;
    public int tahunlahir;

    // Blank Constuctor
    public Mahasiswa() {
        this.NPM = "0";
        this.Nama = "Tidak Tahu";
        this.Alamat = "Tidak Tahu";
        this.Telepon = "-";
        this.tahunlahir = 1980;
    }

    // Full Constructor
    public Mahasiswa(String npm, String Name, String Address, String Phone_Number, int Year_Birth) {
        this.NPM = npm;
        this.Nama = Name;
        this.Alamat = Address;
        this.Telepon = Phone_Number;
        this.tahunlahir = Year_Birth;
    }

    // Constructor NPM Saja
    public Mahasiswa(String Nomor) {
        this.NPM = Nomor;
    }

    // Constructor NPM dan Tahun Lahir
    public Mahasiswa(String Nomor, int Thn) {
        this.NPM = Nomor;
        this.tahunlahir = Thn;
    }

    // Consturctor Tahun Lahir dan NPM
    public Mahasiswa(int Thn, String Nomor) {
        this.tahunlahir = Thn;
        this.NPM = Nomor;
    }

    public String getNPM() {
        return NPM;
    }

    public void setNPM(String NPM) {
        this.NPM = NPM;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getTelepon() {
        return Telepon;
    }

    public void setTelepon(String Telepon) {
        this.Telepon = Telepon;
    }

    public int getTahunlahir() {
        return tahunlahir;
    }

    public void setTahunlahir(int tahunlahir) {
        this.tahunlahir = tahunlahir;
    }

}
