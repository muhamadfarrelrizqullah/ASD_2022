/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu2;

/**
 *
 * @author ASUS
 */
public class Persegi {
    public int sisi;
    
    
    
    public void dataPersegi(){
        System.out.println("Data Persegi");
        System.out.println("Sisi : "+ sisi);
    }
    
    public int luasPersegi(int sisi){
        int luas = sisi * sisi;
        return luas;
    }
    
    public int kelilingPersegi(int sisi){
        int keliling = sisi * 4;
        return keliling;
    }
}
