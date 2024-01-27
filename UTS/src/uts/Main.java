/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        
        
        Pelanggan pg = new Pelanggan("124", "Heri", "Dinoyo");
        Produk pd  = new Produk("125", "Buku Gambar", 4, 5000);
        Kasir ks = new Kasir(123, "Yanto", "Malang", "08145",  "Laki-laki", 8, 100000);
        Transaksi ts = new Transaksi("12", "12 Juni", pg, pd, ks);
        
        ts.cetakInfo();
       
    }
}
