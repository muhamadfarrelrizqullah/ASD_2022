/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author ASUS
 */
public class Barrier implements IDestroyable{
    private int strength;
    
    Barrier(int strength){
        this.strength = strength;
    }
    
    public int getStrength(){
        return strength;
    }
    
    public void setStrength(int newStrength){
        strength = newStrength;
    }
    
    @Override
    public void destroyed(){
        strength -= strength * 0.1; 
    }
    
    public String getBarrierInfo(){
        return "Barrier Strength : "+ strength;
    }
}
