/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encap;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class TestKoperasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Anggota donny= new Anggota("111333444", "Donny", 5000000);
        
//        System.out.println("Nama Anggota : "+  donny.getNama());
//        System.out.println("Limit Pinjaman : "+  donny.getLimitPinjaman());
//        
//        System.out.println("\nMeminjam uang 10.000.000...");
//        donny.pinjam(10000000);
//        System.out.println("Jumlah pinjaman saat ini : "+ donny.getJumlahPinjaman());
//        
//        System.out.println("\nMeminjam uang 4.000.000...");
//        donny.pinjam(4000000);
//        System.out.println("Jumlah pinjaman saat ini : "+ donny.getJumlahPinjaman());
//        
//        System.out.println("\nMembayar angsuran uang 1.000.000...");
//        donny.angsur(1000000);
//        System.out.println("Jumlah pinjaman saat ini : "+ donny.getJumlahPinjaman());
//        
//        System.out.println("\nMembayar angsuran uang 30.000...");
//        donny.angsur(30000);
//        System.out.println("Jumlah pinjaman saat ini : "+ donny.getJumlahPinjaman());


        
        System.out.print("Jumlah uang yang akan dipinjam : ");
        int uang = sc.nextInt();
        
        System.out.println("\nMeminjam uang "+ uang +"...");
        donny.pinjam(uang);
        System.out.println("Jumlah pinjaman saat ini : "+ donny.getJumlahPinjaman());
        System.out.println("\t");
        System.out.println("========================================================");
        System.out.println("\t");
        System.out.print("Jumlah uang yang akan angsur : ");
        int uangA = sc.nextInt();
        
        System.out.println("\nMembayar angsur uang "+ uangA +"...");
        donny.angsur(uangA);
        System.out.println("Jumlah pinjaman saat ini : "+ donny.getJumlahPinjaman());
    }
}
