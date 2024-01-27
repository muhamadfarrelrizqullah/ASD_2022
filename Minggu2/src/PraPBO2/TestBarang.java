/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraPBO2;

/**
 *
 * @author ASUS
 */
public class TestBarang {
    public static void main(String[] args) {
        Barang brg1 = new Barang();
        brg1.namaBrg = "Buku";
        brg1.jenisBrg = "ATK";
        brg1.stok = 15;
        brg1.tampilBarang();
        System.out.println("Stok baru adalah "+ brg1.tambahStok(50));
                
        
    }
}
