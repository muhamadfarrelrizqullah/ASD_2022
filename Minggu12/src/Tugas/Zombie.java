/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author ASUS
 */
public class Zombie implements IDestroyable {
    protected int health;
    protected int level;
    
    public void heal(){
        System.out.println("");
    }
    
    @Override
    public void destroyed(){
        System.out.println("");
    }
    
    public String getZombieInfo(){
        return null;
    }

}
