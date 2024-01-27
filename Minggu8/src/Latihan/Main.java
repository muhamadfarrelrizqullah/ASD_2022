/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Segitiga st = new Segitiga();
        
        System.out.println("Total Sudut : "+ st.totalSudut(90));
        System.out.println("Total Sudut : "+ st.totalSudut(30, 30));
        System.out.println("Keliling    : "+ st.keliling(30, 30, 40));
        System.out.println("Keliling    : "+ st.keliling(30, 40));
    }
}
