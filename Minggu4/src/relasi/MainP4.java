/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relasi;

/**
 *
 * @author ASUS
 */
public class MainP4 {
    public static void main(String[] args) {
        Penumpang p = new Penumpang("731234984", "Bagus Raharjo");
        Gerbong gerbong = new Gerbong("C", 20);
        gerbong.setPenumpang(p, 5);
        System.out.println(gerbong.info());
        
        Penumpang andi = new Penumpang("731234985", "Budi Tri Herlambang");
        gerbong.setPenumpang(andi, 5);
        System.out.println(gerbong.info());
    }
}
