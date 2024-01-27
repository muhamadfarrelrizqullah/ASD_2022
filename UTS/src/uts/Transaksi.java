/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author ASUS
 */
public class Transaksi {
    private String noTransaksi;
    private String tanggalTransaksi;
    private Pelanggan pelanggan;
    private Produk produk;
    private Kasir kasir;
    
    Transaksi(String noTransaksi, String tanggalTransaksi, Pelanggan pelanggan, Produk produk, Kasir kasir){
        this.noTransaksi = noTransaksi;
        this.tanggalTransaksi = tanggalTransaksi;
        this.pelanggan = pelanggan;
        this.produk = produk;
        this.kasir = kasir;
    }
    
    public void setPelanggan(Pelanggan newPelanggan){
        pelanggan = newPelanggan;
    }
    
    public void setProduk(Produk newProduk){
        produk = newProduk;
    }
    
    public void setKasir(Kasir newKasir){
        kasir = newKasir;
    }
    
    public Pelanggan getPelanggan(){
        return pelanggan;
    }
    
    public Produk getProduk(){
        return produk;
    }
    
    public Kasir getKasir(){
        return kasir;
    }
    
    public void cetakInfo(){
        System.out.println("No              = "+ noTransaksi);
        System.out.println("Tanggal         = "+ tanggalTransaksi);
        pelanggan.cetakInfo();
        produk.cetakInfo();
        kasir.cetakInfo();
    }
    
    
}
