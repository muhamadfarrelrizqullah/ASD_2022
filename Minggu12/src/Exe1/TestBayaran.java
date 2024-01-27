/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe1;

/**
 *
 * @author ASUS
 */
public class TestBayaran {
    public static void main(String[] args) {
        Manajer mn = new Manajer("Agus", 800, 50);
        Programmer pg = new Programmer("Budi", 600, 30);
        Bayaran by = new Bayaran();
        
        System.out.println("Bayaran Manajer\t\t : "+ by.hitungBayar(mn));
        System.out.println("Bayaran Programmer\t : "+ by.hitungBayar(pg));
    }
}
