/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author ASUS
 */
public class Pelanggan {
    private String idPelanggan;
    private String nama;
    private String alamat;
    
    Pelanggan(String idPelanggan, String nama, String alamat){
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.alamat = alamat;
    }
    
    
    public void setNama(String newNama){
        nama = newNama;
    }
    
    public void setAlamat(String newAlamat){
        alamat = newAlamat;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void cetakInfo(){
        System.out.println("Id              = "+ idPelanggan);
        System.out.println("Nama            = "+ nama);
        System.out.println("Alamat          = "+ alamat);  
    }
}
