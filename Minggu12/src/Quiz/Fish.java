/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quiz;

/**
 *
 * @author ASUS
 */
public class Fish extends Animal implements IPet{
    private String name;
    
    Fish(){
        
    }
    
    @Override
    public String getName(){
        return name;
    }
    
    @Override
    public void setName(String n){
        name = n;
    }
    
    @Override
    public void play(){
        System.out.println("Ikan sedang bermain air");
    }
    
    @Override
    public void walk(int legs){
        System.out.println("Ikan Berjalan dengan menggunakan "+ legs +" kaki");
    };
    
    @Override
    public void eat(){
        System.out.println("Ikan sedang makan cacing");
    }
}
