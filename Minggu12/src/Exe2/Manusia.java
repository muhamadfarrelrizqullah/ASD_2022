/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe2;

/**
 *
 * @author ASUS
 */
public class Manusia {
    public void nyalakanPerangkat(Elektronik el){
        if(el instanceof TelevisiJadul){
            System.out.println("Nyalakan Televisi Jadul dengan Input : "+ ((TelevisiJadul)el).getModeInput());
            System.out.println("Voltase Televisi : "+ el.getVoltase());
        } else if (el instanceof TelevisiModern){
            System.out.println("Nyalakan Televisi Modern dengan Input : "+ ((TelevisiModern)el).getModeInput());
            System.out.println("Voltase Televisi : "+ el.getVoltase());
        }
    }
    
    public static void main(String[] args) {
        Manusia yurel = new Manusia();
        TelevisiJadul tj = new TelevisiJadul();
        TelevisiModern tm = new TelevisiModern();
        
        yurel.nyalakanPerangkat(tj);
        yurel.nyalakanPerangkat(tm);
    }

}
