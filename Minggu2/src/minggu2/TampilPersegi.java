/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu2;

/**
 *
 * @author ASUS
 */
public class TampilPersegi {
    public static void main(String[] args) {
        Persegi psg = new Persegi();
        
        psg.sisi = 10;
        System.out.println("Luas Persegi : "+ psg.luasPersegi(10));
        System.out.println("Keliling Persegi : "+ psg.kelilingPersegi(10));
        psg.dataPersegi();
    }
}
