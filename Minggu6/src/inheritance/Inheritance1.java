/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author ASUS
 */
public class Inheritance1 {
    public static void main(String[] args) {
        Manager M = new Manager();
        M.nama = "Bagus Hadi";
        M.alamat = "Jl. Bendungan Sutami no.10";
        M.umur = 25;
        M.jk = "Laki-laki";
        M.gaji = 4000000;
        M.tunjangan = 1500000;
        M.tampilDataManager();
        
        Staff S = new Staff();
        S.nama = "Nur Laily";
        S.alamat = "Jl. Bogor no.20";
        S.umur = 27;
        S.jk = "Perempuan";
        S.gaji = 2000000;
        S.lembur = 500000;
        S.potongan = 200000;
        S.tampilDataStaff();
    }
}
