/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encap;

/**
 *
 * @author ASUS
 */
public class EncapDemo {
    private String name;
    private int age;
    
    public String getName(){
        return name;
    }
    
    public void setName(String newName){
        name = newName;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int newAge){
        if(newAge <= 55 && newAge >= 15){
            age = newAge;
        } else {
            if(newAge >= 55){
                System.out.println("Nilai "+ newAge +" diluar batas maksimum! \n");
                age = 55;
            } else if (newAge <= 15){
                System.out.println("Nilai "+ newAge +" diluar batas minimum! \n");
                age = 15;
            }
      
        }
    }
}
