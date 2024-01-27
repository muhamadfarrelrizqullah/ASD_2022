/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author ASUS
 */
public class Nasabah extends Bank implements IDeposito, INabung{
    public String namaNasabah;
    public String alamatNasabah;
    public String noTeleponNasabah;
    public String emailNasabah;
    public int uangNasabah;
    public int uangDepo;
    public int waktu;
    
    public String getNamaNasabah(){
        return namaNasabah;
    }
    
    public void setNamaNasabah(String newNamaNasabah){
        namaNasabah = newNamaNasabah;
    }
    
    public String getAlamatNasabah(){
        return alamatNasabah;
    }
    
    public void setAlamatNasabah(String newAlamatNasabah){
        alamatNasabah = newAlamatNasabah;
    }
    
    public String getNoTeleponNasabah(){
        return noTeleponNasabah;
    }
    
    public void setNoTeleponNasabah(String newNoTeleponNasabah){
        noTeleponNasabah = newNoTeleponNasabah;
    }
    
    public String getEmailNasabah(){
        return emailNasabah;
    }
    
    public void setEmailNasabah(String newEmailNasabah){
        emailNasabah = newEmailNasabah;
    }
    
    public int getUangNasabah(){
        return uangNasabah;
    }
    
    public void setUangNasabah(int newUangNasabah){
        uangNasabah = newUangNasabah;
    }
    
    public int getUangDepo(){
        return uangDepo;
    }
    
    @Override
    public void menabungDeposito() {
        System.out.println(namaNasabah + " telah menabung Deposito sebanyak " + uangDepo);
    }

    @Override
    public void jangkaWaktu(int waktu) {
        System.out.println(namaNasabah + " telah melakukan Deposit dengan jangka waktu " + waktu + " Bulan");
    }

    @Override
    public void menarikDeposito(int waktuDepo, int uangDeposit) {
        if(waktuDepo > waktu){
            if(uangDeposit <= uangDepo){
                uangDepo -= uangDeposit;
            } else {
                System.out.println(namaNasabah + " telah melakukan penarikan Deposit terlalu banyak...");
            }
        } else {
            System.out.println("Waktu tidak sesuai...");
        }
    }

    @Override
    public void menabung(int tabungan) {
        System.out.println(namaNasabah + " telah menabung sebanyak "+ tabungan);
        uangNasabah += tabungan;
    }

    @Override
    public void menarikTabungan(int tabungank) {
        if(tabungank > uangNasabah){
            System.out.println("Saldo tabungan tidak sesuai...");
        } else {
            uangNasabah -= tabungank;
            System.out.println(namaNasabah + " telah mengambil uang sebanyak "+ tabungank);
        }
    }
    
}
