/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Transaksi implements IFeature {
    private int idTransaksi;
    private Baju baju;
    private Pelanggan pelanggan;
    private String tanggalTransaksi;
    private int jumlahBeli;
    private int hargaBeli;
    private int totalHarga;
    
    public Transaksi(){
        
    }
    
    public Transaksi(Baju baju, Pelanggan pelanggan, String tanggalTransaksi, int jumlahBeli, int hargaBeli){
        this.baju = baju;
        this.pelanggan =  pelanggan;
        this.tanggalTransaksi = tanggalTransaksi;
        this.jumlahBeli = jumlahBeli;
        this.hargaBeli = hargaBeli;
    }
    
    @Override
    public void save(){
        
    }
    
    @Override
    public void delete(){
        
    }
    
    public ArrayList<Transaksi> getAll() {
        ArrayList<Transaksi> ListTransaksi = new ArrayList();

        ResultSet rs = DBHelper.selectQuery("Select * From transaksi");

        try {
            while (rs.next()) {
                Transaksi trs = new Transaksi();
                trs.setIdTransaksi(rs.getInt("id_transaksi"));
//                trs.setBaju(rs.get("id_baju"));

                ListTransaksi.add(trs);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListTransaksi;
    }
    
    public ArrayList<Transaksi> search(String keyword) {
        ArrayList<Transaksi> ListTransaksi = new ArrayList();

        String sql = "Select * FROM pelanggan WHERE "
                + " id_baju LIKE '%" + keyword + "%'"
                + " OR id_pelanggan LIKE '%" + keyword + "%'"
                + " OR tanggal_transaksi LIKE '%" + keyword + "%'"
                + " OR jumlah_beli LIKE '%" + keyword + "%'"
                + " OR harga_beli LIKE '%" + keyword + "%'"
                + " OR total_harga LIKE '%" + keyword + "%' ";

        ResultSet rs = DBHelper.selectQuery(sql);

        try {
            while (rs.next()) {
                Transaksi trs = new Transaksi();
                trs.setIdTransaksi(rs.getInt("id_transaksi"));
//                trs.setBaju(rs.get("id_baju"));

                ListTransaksi.add(trs);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListTransaksi;
    }
    
    public Transaksi getById(int id) {
        Transaksi transaksi = new Transaksi();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM transaksi " + "WHERE id_transaksi = '" + idTransaksi + "'");

        try {
            while (rs.next()) {
                Jenis jen = new Jenis().getById(rs.getInt("id_jenis"));  
                transaksi.setIdTransaksi(rs.getInt("id_transaksi"));
//                transaksi.setJenis(jen);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return transaksi;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public Baju getBaju() {
        return baju;
    }

    public void setBaju(Baju baju) {
        this.baju = baju;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public String getTanggalTransaksi() {
        return tanggalTransaksi;
    }

    public void setTanggalTransaksi(String tanggalTransaksi) {
        this.tanggalTransaksi = tanggalTransaksi;
    }

    public int getJumlahBeli() {
        return jumlahBeli;
    }

    public void setJumlahBeli(int jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }

    public int getHargaBeli() {
        return hargaBeli;
    }

    public void setHargaBeli(int hargaBeli) {
        this.hargaBeli = hargaBeli;
    }

    public int getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(int totalHarga) {
        this.totalHarga = totalHarga;
    }
    
    
}
