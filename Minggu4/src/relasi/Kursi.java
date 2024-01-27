/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relasi;

/**
 *
 * @author ASUS
 */
public class Kursi {
    private String nomor;
    private Penumpang penumpang;
    
    Kursi(String nomor){
        this.nomor = nomor;
    }
    
    public void setNomor(String newNomor){
        nomor = newNomor;
    }
    
    public String getNomor(){
        return nomor;
    }
    
    public void setPenumpang(Penumpang newPenumpang){
        penumpang = newPenumpang;
    }
    
    public Penumpang getPenumpang(){
        return penumpang;
    }
    
    public String info(){
        String info = "";
        info += "Nomor : "+ this.nomor +"\n";
        if(this.penumpang != null){
            info += "Penumpang : "+ this.penumpang.info() +"\n";
        }
        return info;
    }
}
