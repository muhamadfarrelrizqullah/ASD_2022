/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quiz;

/**
 *
 * @author ASUS
 */
public abstract class Animal {
    protected int legs;
    
    Animal (int legs){
        this.legs = legs;
    }
    
    Animal(){
        
    }
    
    public void walk(int legs){
        System.out.println("Berjalan dengan menggunakan "+ legs +" kaki");
    };
    
    public abstract void eat();
}
