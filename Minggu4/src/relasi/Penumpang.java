/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relasi;

/**
 *
 * @author ASUS
 */
public class Penumpang {
    private String ktp;
    private String nama;
    
    Penumpang(String ktp, String nama){
        this.ktp = ktp;
        this.nama = nama;
    }
    
    public void setKtp(String newKtp){
        ktp = newKtp;
    }
    
    public String getKtp(){
        return ktp;
    }
    
    public void setNama(String newNama){
        nama = newNama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String info(){
        String info = "";
        info += "Ktp : "+ this.ktp +"\n";
        info += "Nama : "+ this.nama +"\n";
        return info;
    }
}
