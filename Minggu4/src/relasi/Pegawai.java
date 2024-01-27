/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relasi;

/**
 *
 * @author ASUS
 */
public class Pegawai {
    private String nip;
    private String nama;
    
    Pegawai(String nip, String nama){
        this.nip = nip;
        this.nama = nama;
    }
    
    public void setNip(String newNip){
        nip = newNip;
    }
    
    public String getNip(){
        return nip;
    }
    
    public void setNama(String newNama){
        nama = newNama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String info(){
        String info = "";
        info += "Nip : "+ this.nip +"\n";
        info += "Nama : "+ this.nama +"\n";
        return info;
    }
}
