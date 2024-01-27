/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        WalkingZombie wz = new WalkingZombie(100, 1); 
        JumpingZombie jz = new JumpingZombie(100, 2);
        Barrier b = new Barrier(100);
        Plant p = new Plant();
        
        System.out.println(""+ wz.getZombieInfo());
        System.out.println("\n");
        System.out.println(""+ jz.getZombieInfo());
        System.out.println("\n");
        System.out.println(""+ b.getBarrierInfo());
        System.out.println("\n");
        System.out.println("======================");
        
        for(int i=0; i<4; i++){
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);
        }
        
        System.out.println(""+ wz.getZombieInfo());
        System.out.println("\n");
        System.out.println(""+ jz.getZombieInfo());
        System.out.println("\n");
        System.out.println(""+ b.getBarrierInfo());
    }
}
