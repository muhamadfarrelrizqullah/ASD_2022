/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author ASUS
 */
public class Pegawai extends Bank{
    public String namaPegawai;
    public String noTeleponPegawai;
    
    public String getNamaPegawai(){
        return namaPegawai;
    }
    
    public void setNamaPegawai(String newNamaPegawai){
        namaPegawai = newNamaPegawai;
    }
    
    public String getNoTeleponPegawai(){
        return noTeleponPegawai;
    }
    
    public void setNoTeleponPegawai(String newNoTeleponPegawai){
        noTeleponPegawai = newNoTeleponPegawai;
    }
    
}
