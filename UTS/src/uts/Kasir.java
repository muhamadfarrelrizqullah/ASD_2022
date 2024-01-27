/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author ASUS
 */
public class Kasir extends Pegawai{
    private int jamLembur;
    private int gaji;
    
    Kasir(int nip, String nama, String alamat, String noHp, String jk, int jamLembur, int gaji){
        super(nip, nama, alamat, noHp, jk);
        this.jamLembur = jamLembur;
        this.gaji = gaji;
    }
    
    public int getJamLembur(){
        return jamLembur;
    }
    
    public int getGaji(){
        return gaji;
    }
    
    public void setJamLembur(int newJamLembur){
        jamLembur = newJamLembur;
    }
    
    public void setGaji(int newGaji){
        gaji = newGaji;
    }
    
    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("");
        System.out.println("Jam Lembur      = "+ jamLembur);
        System.out.println("Gaji            = "+ gaji);
    }
}
