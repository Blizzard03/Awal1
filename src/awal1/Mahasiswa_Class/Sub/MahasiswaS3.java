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
public class MahasiswaS3 extends Mahasiswa {

    private int jKonferensi, jJurnal;

    public MahasiswaS3() {
        super();
        jKonferensi = 0;
        jJurnal = 0;
    }

    public MahasiswaS3(String No, String Nm, String Al, String Tlp, int Thn, int j1, int j2) {
        super(No, Nm, Al, Tlp, Thn);
        jKonferensi = j1;
        jJurnal = j2;
    }

    public int getJKonferensi() {
        return (jKonferensi);
    }

    public void setJKonferensi(int jk) {
        jKonferensi = jk;
    }

    public int getJJurnal() {
        return (jJurnal);
    }

    public void setJJurnal(int jj) {
        jJurnal = jj;
    }

    @Override
    public void tampilkan() {
        System.out.printf(
                "Data kelas S3: \n");
        System.out.printf("%s %s %s %s %d %d %d \n",
                 getNPM(),
                 getNama(),
                 getAlamat(),
                 getTelepon(),
                 getTahunlahir(), jKonferensi, jJurnal
        );
    }
}


