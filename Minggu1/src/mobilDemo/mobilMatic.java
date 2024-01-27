/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobilDemo;

/**
 *
 * @author ASUS
 */
public class mobilMatic extends mobil {
    private String tipeTransmisi;
    
    public void setTipeTransmisi(String val){
        tipeTransmisi = val;
    }
    
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Tipe Transmisi \t: "+ tipeTransmisi);
    }
    
}
