/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cobajava;

/**
 *
 * @author ASUS
 */
public abstract class Animal {
    protected int legs;
    
    Animal (int legs){
        this.legs = legs;
    }
    
    public abstract void walk(int legs);
    
    public abstract void eat();
}
