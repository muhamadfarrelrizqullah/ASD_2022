/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasPraktikum;

/**
 *
 * @author ASUS
 */
public class scooter {
    private String merk, warna, tipeTransmisi;
    private int kecepatan, gigi, berat;
    
    public void setMerk(String val){
        merk = val;
    }
    
    public void pindahGigi(int val){
        gigi = val;
    }
    
    public void setWarna(String val){
        warna = val;
    }
    
    public void setTipeTransmisi(String val){
        tipeTransmisi = val;
    }
    
    public void setBerat(int val){
        berat = val;
    }
    
    public void tambahKecepatan(int increment){
        kecepatan += increment;
    }
    
    public void kurangKecepatan(int decrement){
        kecepatan -= decrement;
    }
    
    public void cetakStatus(){
        System.out.println("Merk \t\t: "+ merk);
        System.out.println("Gigi \t\t: "+ gigi);
        System.out.println("Berat \t\t: "+ berat +" kg");
        System.out.println("Warna \t\t: "+ warna);
        System.out.println("Kecepatan \t: "+ kecepatan +" km/jam");
        System.out.println("Tipe Transmisi \t: "+ tipeTransmisi);
    }
    
}
