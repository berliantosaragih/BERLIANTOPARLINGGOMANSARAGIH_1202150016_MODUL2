package com.example.linggom.berliantoparlinggomansaragih_1202150016_modul2;

/**
 * Created by Linggom on 18/02/2018.
 */
//Class untuk menyimpan data makanan yang ada
public class Food {

    private int id;
    private String nama;
    private String harga;
    private int gambar;
    private String bahan;

    //Method/Constructor untuk menentukan parameter apa saja yang dibutuhkan oleh class makanan ini
    public Food(int id, String nama, String harga, int gambar, String bahan){
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.gambar = gambar;
        this.bahan = bahan;
    }

    //Untuk mengambil data makanan
    public int getId(){
        return id;
    }

    public String getHarga() {
        return harga;
    }

    public String getNama() {
        return nama;
    }

    public int getGambar() {
        return gambar;
    }

    public String getBahan(){
        return bahan;
    }
}

