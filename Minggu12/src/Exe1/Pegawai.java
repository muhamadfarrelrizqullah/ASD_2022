/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe1;

/**
 *
 * @author ASUS
 */
public class Pegawai {
    protected String nama;
    protected int gaji;
    
    Pegawai(){
        
    }
    
    Pegawai(String nama, int gaji){
        this.nama = nama;
        this.gaji =  gaji;
    }
    
    public int getGaji(){
        return gaji;
    }
}
