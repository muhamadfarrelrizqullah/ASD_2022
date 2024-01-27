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
public class Debit extends Pembayaran {
    private int saldo;
    
    
    public Debit(){
    }
    
    public Debit(Pelanggan pelanggan, String namaBayar, String tipeBayar, int saldo){
        this.pelanggan = pelanggan;
        this.namaBayar = namaBayar;
        this.tipeBayar = tipeBayar;
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public void tambahSaldo(int jml) {
        this.saldo += jml;
    }
    
    public void kurangSaldo(int jml) {
        this.saldo -= jml;
    }
    

    public ArrayList<Debit> getAll() {
        ArrayList<Debit> ListBayar = new ArrayList();
        
        ResultSet rs = DBHelper.selectQuery("Select * From pembayaran");
        
        try{
            while(rs.next()){
                Debit bayar = new Debit();
                Pelanggan plg = new Pelanggan().getById(rs.getInt("id_pelanggan"));
                
                bayar.setIdBayar(rs.getInt("id_pembayaran"));
                bayar.setPelanggan(plg);
                bayar.setNamaBayar(rs.getString("namaBayar"));
                bayar.setTipeBayar(rs.getString("tipebayar"));
                bayar.setNominal(rs.getInt("nominal"));
                
                ListBayar.add(bayar);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ListBayar;
    }
    
    public Debit getById(int id) {
        Debit bayar = new Debit();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM pembayaran " + "WHERE id_pembayaran = '" + id + "'");
        
        try{
                while(rs.next()){
                    bayar = new Debit();
                    Pelanggan plg = new Pelanggan().getById(rs.getInt("id_pelanggan"));

                    bayar.setIdBayar(rs.getInt("id_pembayaran"));
                    bayar.setPelanggan(plg);
                    bayar.setNamaBayar(rs.getString("namaBayar"));
                    bayar.setTipeBayar(rs.getString("tipebayar"));
                    bayar.setNominal(rs.getInt("nominal"));
                }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return bayar;
    }
    
    public ArrayList<Debit> search(String keyword) {
        ArrayList<Debit> ListBayar = new ArrayList();

        String sql = "Select * FROM pembayaran WHERE "
                + " namaBayar LIKE '%" + keyword + "%'"
                + " OR tipebayar LIKE '%" + keyword + "%'";

        ResultSet rs = DBHelper.selectQuery(sql);

        try {
            while (rs.next()) {
                Debit bayar = new Debit();
                Pelanggan plg = new Pelanggan();
                plg.setIdPelanggan(rs.getInt("id_pelanggan"));
                
                bayar.setIdBayar(rs.getInt("id_pembayaran"));
                bayar.setPelanggan(plg);
                bayar.setNamaBayar(rs.getString("namaBayar"));
                bayar.setNominal(rs.getInt("nominal"));
                bayar.setTipeBayar(rs.getString("tipebayar"));

                ListBayar.add(bayar);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListBayar;
    }

    @Override
    public void save() {
        if (getById(idBayar).getIdBayar() == 0) {
            String SQL = "INSERT INTO pembayaran (id_pelanggan,namaBayar,nominal,tipebayar) VALUES("
                    + "     '" + this.pelanggan.getIdPelanggan()+ "', "
                    + "     '" + this.namaBayar + "', "
                    + "     '" + this.saldo + "', "
                    + "     '" + this.nominal + "', "
                    + "     '" + this.tipeBayar + "' "
                    + "     )";
            this.idBayar = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE pembayaran SET "
                    + "     '" + this.pelanggan.getIdPelanggan()+ "', "
                    + "     '" + this.namaBayar + "', "
                    + "     '" + this.saldo + "', "
                    + "     '" + this.nominal + "', "
                    + "     '" + this.tipeBayar + "' "
                    + "     WHERE id_pembayaran = '" + this.idBayar + "'";
            DBHelper.executeQuery(SQL);
        }
    }

    @Override
    public void delete() {
        String SQL = "DELETE FROM pembayaran WHERE id_pembayaran = '" + this.idBayar + "'";
        DBHelper.executeQuery(SQL);
    }
}
