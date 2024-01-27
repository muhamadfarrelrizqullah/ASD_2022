/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraPBO2;

/**
 *
 * @author ASUS
 */
public class RentalMobil {
    public String kodeInvoice, namaMobil, namaCostumer;
    public Boolean statusSupir;
    public int hargaDenganSupir, diskon, hargaSewaMobil, lamaSewa;
    
    public int hitungSewa(){
        int totalSewaMobil = 0;
        if(statusSupir){
            int sewaMobil = 0;
            sewaMobil = (lamaSewa * hargaSewaMobil) + (lamaSewa * hargaDenganSupir);
            totalSewaMobil = sewaMobil - ((sewaMobil * diskon)/100);
        } else {
            int sewaMobil = 0;
            sewaMobil = lamaSewa * hargaSewaMobil;
            totalSewaMobil = sewaMobil - ((sewaMobil * diskon)/100);
        }
        return totalSewaMobil;
        
    }
    
    public void tampilData(){
        System.out.println("Kode Invoice \t\t: "+ kodeInvoice);
        System.out.println("Nama Mobil \t\t: "+ namaMobil);
        System.out.println("Nama Costumer \t\t: "+ namaCostumer);
        System.out.println("Status Supir \t\t: "+ statusSupir);
        System.out.println("Harga Supir \t\t: "+ hargaDenganSupir);
        System.out.println("Diskon \t\t\t: "+ diskon);
        System.out.println("Harga Sewa Mobil \t: "+ hargaSewaMobil);
        System.out.println("Lama Sewa \t\t: "+ lamaSewa);
    }
    
}
