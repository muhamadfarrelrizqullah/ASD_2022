/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe1;

/**
 *
 * @author ASUS
 */
public class Bayaran {
    public int hitungBayar(Pegawai pg){
        int uang = pg.getGaji();
        
        if(pg instanceof Manajer){
            uang += ((Manajer)pg).getTunjangan();
        } else if(pg instanceof Programmer) {
            uang += ((Programmer)pg).getBonus();
        }
        
        return uang;
    }
}
