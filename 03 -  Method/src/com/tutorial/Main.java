package com.tutorial;

class Mahasiswa{
    // Data member
    String nama;
    String NIM;

    Mahasiswa(String inputNama, String inputNIM){
        nama = inputNama;
        NIM = inputNIM;
    }

    // method tanpa return dan tanpa parameter
    void show(){
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + NIM);
    }

    // method tanpa return dan berparameter
    void setNama(String nama){
        this.nama = nama;
    }

    // method dengan return dan tanpa parameter
    String getNama(){
        return nama;
    }

    String getNIM(){
        return NIM;
    }

    // method return dan parameter
    String sayHi(String message){
        return message + " juga, nama saya adalah " + nama;
    }

}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Jerry A Pangaribuan", "11419046");
        mahasiswa1.show();
        mahasiswa1.setNama("Farida");
        mahasiswa1.show();
        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());
        System.out.println(mahasiswa1.sayHi("Hallo"));
    }
}
