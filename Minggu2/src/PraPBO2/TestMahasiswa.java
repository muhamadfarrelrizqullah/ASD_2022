/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraPBO2;

/**
 *
 * @author ASUS
 */
public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = 202231;
        mhs1.nama = "Dimas Putra";
        mhs1.alamat = "Jl. Jakarta no. 1A";
        mhs1.kelas = "TI 1A";
        mhs1.tampilBiodata();
        System.out.println("\n");
        
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = 202219;
        mhs2.nama = "Muhamad Farrel";
        mhs2.alamat = "Jl. Sungai Musi no. 4A";
        mhs2.kelas = "TI 1E";
        mhs2.tampilBiodata();
        
    }
}
