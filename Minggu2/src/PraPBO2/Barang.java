/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraPBO2;

/**
 *
 * @author ASUS
 */
public class Barang {
    public String namaBrg, jenisBrg;
    public int stok;
    
    public void tampilBarang(){
        System.out.println("Nama Barang \t: "+ namaBrg);
        System.out.println("Jenis Barang \t: "+ jenisBrg);
        System.out.println("Stok \t\t: "+ stok);
    }
    
    public int tambahStok(int brgMasuk){
        int stokBaru = brgMasuk + stok;
        return stokBaru;
    }
}
