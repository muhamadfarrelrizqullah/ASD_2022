/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author ASUS
 */
public class WalkingZombie extends Zombie {
    WalkingZombie(int health, int level){
        this.health = health;
        this.level = level;
    }
    
    @Override
    public void heal(){
        if (level == 1){
            health += health * 20/100;
        } else if (level == 2){
            health += health * 30/100;
        } else if (level == 3){
            health += health * 40/100;
        }
    }
    
    @Override
    public void destroyed(){
        health -= health * 20/100; 
    }
    
    @Override
    public String getZombieInfo(){
        return "Walking Zombie Data :\nHealth : "+ health +"\nLevel : "+ level;
    }
}
