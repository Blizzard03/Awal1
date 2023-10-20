/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package awal1.Mahasiswa_Class.Sub;

import awal1.Mahasiswa_Class.Master.Mahasiswa;

/**
 *
 * @author mariq
 */
public class MahasiswaS1 extends Mahasiswa {

    private int Sertifikat;

    public MahasiswaS1() {
        super();
        Sertifikat = 0;
    }

    public MahasiswaS1(String No, String Nm, String Al, String Tlp, int Thn, int jml) {
        super(No, Nm, Al, Tlp, Thn);
        Sertifikat = jml;
    }

    // @Override
    public int getjSertifikat() {
        return (Sertifikat);
    }

    public void setJSertifikat(int js) {
        Sertifikat = js;
    }

    @Override
    public void tampilkan() {
        System.out.printf("Data kelas S1: \n");
        System.out.printf("%s % s % s % s % d % d\n",
                getNPM(),
                getNama(),
                getAlamat(),
                getTelepon(),
                getTahunlahir(), Sertifikat);
    }
}
