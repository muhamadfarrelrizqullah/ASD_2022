/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encap;

/**
 *
 * @author ASUS
 */
public class Anggota {
    private String noKtp;
    private String nama;
    private int limit;
    private int jumlah;
    
    Anggota(String noKtp, String nama, int limit){
        this.noKtp = noKtp;
        this.nama = nama;
        this.limit = limit;
    }
    
    public String getNama(){
        return nama;
    }
    public int getLimitPinjaman(){
        return limit;
    }
    
    public int getJumlahPinjaman(){
        return jumlah;
    }
    
    public void pinjam(int jumlahPinjam){
        if(jumlahPinjam < limit){
            jumlah = jumlahPinjam;
        } else {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        }
    }
    
    public void angsur(int jumlahAngsur){
        if(jumlahAngsur >= (0.07 * jumlah)){
            jumlah -= jumlahAngsur;
        } else {
            System.out.println("Maaf, angsuran harus 7% dari jumlah pinjaman.");
        }

    }
}
