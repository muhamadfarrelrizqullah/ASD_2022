/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasPraktikum;

/**
 *
 * @author ASUS
 */
public class main {
    public static void main(String[] args) {
       
        sepedaMatic sm = new sepedaMatic();
        sepedaGunung sg = new sepedaGunung();
        scooter sc = new scooter();
        skateBoard sb = new skateBoard();
        
        System.out.println("Sepeda Listrik");
        sm.setMerk("Lankeleisi");
        sm.pindahGigi(0);
        sm.setBerat(45);
        sm.setWarna("Hitam");
        sm.setTipeTransmisi("Matic");
        sm.setDiameterBan(18);
        sm.tambahKecepatan(11);
        sm.kurangKecepatan(1);
        sm.cetakStatus();
        System.out.println("\n");
        
        System.out.println("Sepeda Gunung");
        sg.setMerk("Polygone");
        sg.pindahGigi(5);
        sg.setBerat(32);
        sg.setWarna("Hitam");
        sg.setTipeBan("MTB");
        sg.setDiameterBan(29);
        sg.tambahKecepatan(10);
        sg.kurangKecepatan(2);
        sg.cetakStatus();
        System.out.println("\n");
        
        System.out.println("Scooter");
        sc.setMerk("Xiaomi");
        sc.setBerat(5);
        sc.setWarna("Putih");
        sc.tambahKecepatan(8);
        sc.pindahGigi(0);
        sc.setTipeTransmisi("Matic");
        sc.cetakStatus();
        System.out.println("\n");
        
        System.out.println("Skate Board");
        sb.setMerk("Bruce Deck");
        sb.setBerat(2);
        sb.setWarna("Kuning");
        sb.tambahKecepatan(5);
        sb.pindahGigi(0);
        sb.setDiameterBan(2);
        sb.cetakStatus();
        System.out.println("\n");
    }
}
