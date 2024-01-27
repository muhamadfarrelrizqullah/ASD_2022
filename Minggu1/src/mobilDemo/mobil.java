/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobilDemo;

/**
 *
 * @author ASUS
 */
public class mobil {
    private String merk;
    private int kecepatan, gigi;
    
    public void setMerk(String val){
        merk = val;
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
        System.out.println("Kecepatan \t: "+ kecepatan);
        System.out.println("Gigi \t\t: "+ gigi);
    }
    
    public static void main(String[] args) {
        mobil mb1 = new mobil();
        mobil mb2 = new mobil();
        
        mobilMatic mb3 = new mobilMatic();
        
        mb1.setMerk("Nissan");
        mb1.tambahKecepatan(60);
        mb1.pindahGigi(2);
        mb1.cetakStatus();
        System.out.println("\n");
        mb2.setMerk("Mitsubishi");
        mb2.tambahKecepatan(10);
        mb2.pindahGigi(2);
        mb2.tambahKecepatan(10);
        mb2.pindahGigi(3);
        mb2.cetakStatus();
        System.out.println("\n");
        mb3.setMerk("Hyundai");
        mb3.tambahKecepatan(5);
        mb3.pindahGigi(3);
        mb3.setTipeTransmisi("Matic");
        mb3.cetakStatus();
    }
    
}
