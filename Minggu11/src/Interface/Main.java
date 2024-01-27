/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Nasabah nsb = new Nasabah();
        nsb.setNamaNasabah("Afdhol");
        nsb.uangDepo = 200000;
        nsb.menabungDeposito();
        nsb.jangkaWaktu(10);
        nsb.menarikDeposito(5, 50000);
        System.out.println("Uang Depo saat ini "+ nsb.getUangDepo());
        nsb.uangNasabah = 100000;
        nsb.menabung(200000);
        System.out.println("Uang Tabungan saat ini "+ nsb.getUangNasabah());
        nsb.menarikTabungan(50000);
        System.out.println("Uang Tabungan saat ini "+ nsb.getUangNasabah());
    }
}
