package com.tutorial;

// Polos / class tanpa constructor
class Polos{
    String dataString;
    int dataInteger;
}

// class dengan constructor
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;

    Mahasiswa(){
    }

    Mahasiswa(String inputNama, String inputNIM, String inputJurusan){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;
    }

}

public class Main {
    public static void main(String[] args)throws Exception {
//        Polos objectPolos = new Polos();
//        objectPolos.dataInteger = 19;
//        objectPolos.dataString = "Oke";
//        System.out.println(objectPolos.dataInteger);
//        System.out.println(objectPolos.dataString);

        Mahasiswa mahasiswa1 = new Mahasiswa("jarliman", "11419046", "Teknik Informatika");
        System.out.println(mahasiswa1.nama + " " + mahasiswa1.NIM + " " + mahasiswa1.jurusan);
    }
}
