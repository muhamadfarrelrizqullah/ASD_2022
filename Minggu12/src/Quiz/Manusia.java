/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quiz;

/**
 *
 * @author ASUS
 */
public class Manusia {
    public void beriMakan(Animal a){
        if(a instanceof Spider){
            ((Spider)a).eat();
        } else if(a instanceof Fish){
            ((Fish)a).eat();
        } else if(a instanceof Cat){
            ((Cat)a).eat();
        }
    }
    
    public void jalan(Animal a){
         if(a instanceof Spider){
            ((Spider)a).walk(8);
        }else if(a instanceof Fish){
            ((Fish)a).walk(0);
        } else if(a instanceof Cat){
            ((Cat)a).walk(4);
        }
    }
    
    public void bermain(IPet p){
        if(p instanceof Fish){
            ((Fish)p).play();
        } else if(p instanceof Cat){
            ((Cat)p).play();
        }
    }
    
    public static void main(String[] args) {
        Manusia farrel = new Manusia();
        Fish d = new Fish();
        Cat c = new Cat("Timmy");
        Animal a = new Fish();
        Animal e = new Spider();
        IPet p = new Cat();
        
        farrel.beriMakan(d);
        System.out.println("Nama kucing saya "+ c.getName());
        farrel.beriMakan(c);
        farrel.beriMakan(e);
        farrel.bermain(d);
        farrel.bermain(c);
        farrel.jalan(d);
        farrel.jalan(c);
        farrel.jalan(e);
    }
}
