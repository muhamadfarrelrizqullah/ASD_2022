/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasPraktikum;

/**
 *
 * @author ASUS
 */
public class sepedaMatic extends sepeda {
    private String tipeTransmisi;
    private int diameterBan;
    
    public void setTipeTransmisi(String val){
        tipeTransmisi = val;
    }
    
    public void setDiameterBan(int val){
        diameterBan = val;
    }
    
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Tipe Transmisi \t: "+ tipeTransmisi);
        System.out.println("Diameter Ban \t: "+ diameterBan +" inch");
    }
}
