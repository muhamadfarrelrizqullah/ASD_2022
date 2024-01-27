/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan;

/**
 *
 * @author ASUS
 */
public class Karyawan {
    private String nama;
    private String nip;
    private String golongan;
    private double gaji;
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setNip(String nip){
        this.nip = nip;
    }
    
    public void setGolongan(String golongan){
        this.golongan = golongan;
        
        switch(golongan.charAt(0)){
            case '1':
                this.gaji = 5500000; break;
            case '2':
                this.gaji = 4500000; break;
            case '3':
                this.gaji = 3500000; break;
            case '4':
                this.gaji = 2500000; break;
            case '5':
                this.gaji = 1500000; break;
        }
    }
    
    public void setGaji(double gaji){
        this.gaji = gaji;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getNip(){
        return nip;
    }
    
    public String getGolongan(){
        return golongan;
    }
    
    public double getGaji(){
        return gaji;
    }
    
}
