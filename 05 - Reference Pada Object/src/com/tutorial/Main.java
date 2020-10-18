package com.tutorial;

class Buku{
    String judul;
    String penulis;

    Buku(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }

    void display(){
        System.out.println("\nJudul\t: " + this.judul);
        System.out.println("Penulis\t: " + this.penulis);
    }
}

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Killing commandan", "Jerry Andrianto");
        buku1.display();

        // menampilkan address
        String addressBuku1 = Integer.toHexString(System.identityHashCode(buku1));
        System.out.println(addressBuku1);

        Buku buku2 = buku1;
        buku2.display();
        String addressBuku2 = Integer.toHexString(System.identityHashCode(buku2));
        System.out.println(addressBuku2);

        // karena buku1 dan buku2 berada pada adrress atau referensi yang sama
        buku1.judul = "Membunuh tanpa sadar";
        buku1.display();
        buku2.display();

        // kita akan memasukkan object kedalam method
        fungsi(buku2);
        buku1.display();
        buku2.display();
    }

    public static void fungsi(Buku databuku){
        String addressBuku = Integer.toHexString(System.identityHashCode(databuku));
        System.out.println("address dalam fungsi " + addressBuku);
        databuku.penulis = "Haruki murakami";
    }
}
