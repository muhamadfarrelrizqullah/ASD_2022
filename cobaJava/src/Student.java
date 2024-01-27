/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Student extends Person{
    public void talk(){
        System.out.println("S");
    }
    
    public void info(){
        talk();
        this.talk();
    }
}
