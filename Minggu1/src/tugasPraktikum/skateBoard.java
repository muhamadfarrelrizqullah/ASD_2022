/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasPraktikum;

/**
 *
 * @author ASUS
 */
public class skateBoard {
    private String merk, warna;
    private int kecepatan, gigi, berat, diameterBan;
    
    public void setMerk(String val){
        merk = val;
    }
    
    public void setWarna(String val){
        warna = val;
    }
    
    public void setDiameterBan(int val){
        diameterBan = val;
    }
    
    public void setBerat(int val){
        berat = val;
    }
    
    public void pindahGigi(int val){
        gigi = val;
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
        System.out.println("Diameter Ban \t: "+ diameterBan +" inch");
    }
}
