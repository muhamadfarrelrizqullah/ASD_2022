/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relasi;

/**
 *
 * @author ASUS
 */
public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;
    
    Gerbong(String kode, int jumlah){
        this.kode = kode;
        arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }
    
    private void initKursi(){
        for(int i=0; i<arrayKursi.length; i++){
            this.arrayKursi[i] = new Kursi(String.valueOf(i+1));
        }
    }
    
    public void setKode(String newKode){
        kode = newKode;
    }
    
    public String getKode(){
        return kode;
    }
    
    public String info(){
        String info = "";
        info += "Kode : "+ this.kode +"\n";
        for(Kursi kursi : arrayKursi){
            info +=  kursi.info();
        }
        return info;
    }
    
    public void setPenumpang(Penumpang penumpang, int nomor){
        if (this.arrayKursi[nomor - 1].getPenumpang() != null) {
            System.out.println("Kursi sudah terisi !!");
            System.exit(0);
        } else {
            this.arrayKursi[nomor - 1].setPenumpang(penumpang);
        }
    }
    
    public Kursi[] getArrayPenumpang(){
        return arrayKursi;
    }
}
