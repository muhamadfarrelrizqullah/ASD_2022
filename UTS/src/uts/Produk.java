/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author ASUS
 */
public class Produk {
    private String idBuku;
    private String namaProduk;
    private int jumlahBarang;
    private int hargaProduk;
    
    Produk(String idBuku, String namaProduk, int jumlahBarang, int hargaProduk){
        this.idBuku = idBuku;
        this.namaProduk = namaProduk;
        this.jumlahBarang = jumlahBarang;
        this.hargaProduk = hargaProduk;
        
    }
    
    public void setIdBuku(String newIdBuku){
        idBuku = newIdBuku;
    }
    
    public void setNamaProduk(String newNamaProduk){
        namaProduk = newNamaProduk;
    }
    
    public void setJumlahBarang(int newJumlahBarang){
        jumlahBarang = newJumlahBarang;
    }
    
    public void setHargaProduk(int newHargaProduk){
        hargaProduk = newHargaProduk;
    }
    
    public String getIdBuku(){
        return idBuku;
    }
    
    public String getNamaProduk(){
        return namaProduk;
    }
    
    public int getJumlahBarang(){
        return jumlahBarang;
    }
    
    public int getHargaProduk(){
        return hargaProduk;
    }
    
    public void cetakInfo(){
        System.out.println("Id              = "+ idBuku);
        System.out.println("Nama Produk     = "+ namaProduk);
        System.out.println("Jumlah          = "+ jumlahBarang);
        System.out.println("Harga           = "+ hargaProduk);
    }
}
