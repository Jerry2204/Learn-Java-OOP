package com.tutorial;

class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "ucup surucup";
        mahasiswa1.NIM = "11419046";
        mahasiswa1.IPK = 4.00;
        mahasiswa1.jurusan = "Teknik Industri";
        mahasiswa1.umur = 20;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.umur);
        System.out.println(mahasiswa1.IPK);

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Poliman";
        mahasiswa2.NIM = "11419045";
        mahasiswa2.IPK = 3.95;
        mahasiswa2.jurusan = "Teknik Industri";
        mahasiswa2.umur = 19;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.umur);
        System.out.println(mahasiswa2.IPK);
    }
}
