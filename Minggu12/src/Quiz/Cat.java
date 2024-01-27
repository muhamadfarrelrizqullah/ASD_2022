/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quiz;

/**
 *
 * @author ASUS
 */
public class Cat extends Animal implements IPet {
    private String name;
    
    Cat(String name){
        this.name = name;
    }
    
    Cat(){
        
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
        System.out.println("Kucing sedang bermain bola");
    }
    
    @Override
    public void eat(){
        System.out.println("Kucing sedang makan wishkas");
    }

    
}
