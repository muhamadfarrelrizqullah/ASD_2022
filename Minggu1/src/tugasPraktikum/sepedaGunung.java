/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasPraktikum;

/**
 *
 * @author ASUS
 */
public class sepedaGunung extends sepeda{
    private String tipeBan;
    private int diameterBan;
    
    public void setTipeBan(String val){
        tipeBan = val;
    }
    
    public void setDiameterBan(int val){
        diameterBan = val;
    }
    
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Tipe Ban \t: "+ tipeBan);
        System.out.println("Diameter Ban \t: "+ diameterBan +" inch");
    }
    
}
