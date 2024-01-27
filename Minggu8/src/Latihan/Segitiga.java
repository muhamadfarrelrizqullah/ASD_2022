/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author ASUS
 */
public class Segitiga {
    private int sudut;
    
    public int totalSudut(int sudutA){
        return sudut = 180 - sudutA;
    }
    
    public int totalSudut(int sudutA, int sudutB){
        return sudut = 180 - (sudutA + sudutB);
    }
    
    public int keliling(int sisiA, int sisiB, int sisiC){
        int keliling = 0;
        return keliling = sisiA + sisiB + sisiC; 
    }
    
    public double keliling(int sisiA, int sisiB){
        double c = 0;
        return c = Math.sqrt(sisiA * sisiA) + Math.sqrt(sisiB * sisiB);
    }
}
