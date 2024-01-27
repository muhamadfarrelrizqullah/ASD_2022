/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author ASUS
 */
public class Pegawai {
    private int nip;
    private String nama;
    private String alamat;
    private String noHp;
    private String jk;
    
    Pegawai(int nip, String nama, String alamat, String noHp, String jk){
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
        this.noHp = noHp;
        this.jk = jk;
    } 
    
    public void cetakInfo(){
        System.out.println("Nip             = "+ nip);
        System.out.println("Nama            = "+ nama);
        System.out.println("Alamat          = "+ alamat);
        System.out.println("NoHp            = "+ noHp);
        System.out.println("Jenis Kelamin   = "+ jk);    
    }
    
}
