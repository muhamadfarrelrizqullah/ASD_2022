/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;


/**
 *
 * @author ASUS
 */
public class TestBackEnd {

    public static void main(String[] args) {
        Pelanggan pg1 = new Pelanggan("Pelanggan 1", "08211", "Alamat 1", "Lk");
        Pelanggan pg2 = new Pelanggan("Pelanggan 2", "08912", "Alamat 2", "PR");
        Pelanggan pg3 = new Pelanggan("Pelanggan 3", "0858", "Alamat 3", "PR");

        // test insert
        pg1.save();
        pg2.save();
        pg3.save();

        // test update
        pg2.setAlamat("Alamat Baru");
        pg2.save();

        // test delete
        pg3.delete();

        // test select all
        for (Pelanggan k : new Pelanggan().getAll()) {
            System.out.println("Nama: " + k.getNamaPelanggan() + ", Telepon: " + k.getNoTelp() + ", Alamat: " + k.getAlamat()+ ", Jenis Kelamin: " + k.getJk());
        }

        // test search
        for (Pelanggan k : new Pelanggan().search("alam")) {
            System.out.println("Nama: " + k.getNamaPelanggan() + ", Telepon: " + k.getNoTelp() + ", Alamat: " + k.getAlamat()+ ", Jenis Kelamin: " + k.getJk());
        }
    }
}
