/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author ASUS
 */
public class Plant {
    public void doDestroy(IDestroyable dt){
        if(dt instanceof WalkingZombie){
            ((WalkingZombie)dt).destroyed();
        } else if (dt instanceof JumpingZombie){
            ((JumpingZombie)dt).destroyed();
        } else if (dt instanceof Barrier){
            ((Barrier)dt).destroyed();
        }
    }
}
