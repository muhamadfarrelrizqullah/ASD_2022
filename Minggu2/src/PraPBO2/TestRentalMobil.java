/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraPBO2;

/**
 *
 * @author ASUS
 */
public class TestRentalMobil {
    public static void main(String[] args) {
        
        System.out.println("Dengan Diskon");
        RentalMobil rm1 = new RentalMobil();
        rm1.kodeInvoice = "Bro";
        rm1.namaMobil = "Brio";
        rm1.namaCostumer = "Farrel";
        rm1.statusSupir = false;
        rm1.hargaDenganSupir = 0; 
        rm1.diskon = 20;
        rm1.hargaSewaMobil = 200000;
        rm1.lamaSewa= 2;
        rm1.tampilData();
        System.out.println("Total Harga Sewa \t: "+rm1.hitungSewa()); 
        System.out.println("================================================");
        
        System.out.println("Tanpa Diskon");
        RentalMobil rm2 = new RentalMobil();
        rm2.kodeInvoice = "Xna";
        rm2.namaMobil = "Xenia";
        rm2.namaCostumer = "Windah";
        rm2.statusSupir = false;
        rm2.hargaDenganSupir = 0; 
        rm2.diskon = 0;
        rm2.hargaSewaMobil = 200000;
        rm2.lamaSewa= 2;
        rm2.tampilData();
        System.out.println("Total Harga Sewa \t: "+rm2.hitungSewa()); 
        System.out.println("================================================");
        
        System.out.println("Dengan Supir");
        RentalMobil rm3 = new RentalMobil();
        rm3.kodeInvoice = "Pjr";
        rm3.namaMobil = "Pajero";
        rm3.namaCostumer = "Basuki";
        rm3.statusSupir = true;
        rm3.hargaDenganSupir = 50000; 
        rm3.diskon = 20;
        rm3.hargaSewaMobil = 300000;
        rm3.lamaSewa= 2;
        rm3.tampilData();
        System.out.println("Total Harga Sewa \t: "+rm3.hitungSewa()); 
        System.out.println("================================================");
        
        System.out.println("Tanpa Supir");
        RentalMobil rm4 = new RentalMobil();
        rm4.kodeInvoice = "Lvn";
        rm4.namaMobil = "Livinna";
        rm4.namaCostumer = "Cahyo";
        rm4.statusSupir = false;
        rm4.hargaDenganSupir = 0; 
        rm4.diskon = 20;
        rm4.hargaSewaMobil = 300000;
        rm4.lamaSewa= 2;
        rm4.tampilData();
        System.out.println("Total Harga Sewa \t: "+rm4.hitungSewa()); 
        System.out.println("================================================");
    }
}
