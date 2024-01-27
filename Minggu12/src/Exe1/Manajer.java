/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe1;

/**
 *
 * @author ASUS
 */
public class Manajer extends Pegawai {
    private int tunjangan;
    
    Manajer(String nama, int gaji, int tunjangan){
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }
    
    @Override
    public int getGaji(){
        return gaji;
    }
    
    public int getTunjangan(){
        return tunjangan;
    }
}
