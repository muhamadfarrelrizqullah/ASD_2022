/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe1;

/**
 *
 * @author ASUS
 */
public class Programmer extends Pegawai{
    private int bonus;
    
    Programmer(String nama, int gaji, int bonus){
        super(nama, gaji);
        this.bonus = bonus;
    }
    
    @Override
    public int getGaji(){
        return gaji;
    }
    
    public int getBonus(){
        return bonus;
    }
}
