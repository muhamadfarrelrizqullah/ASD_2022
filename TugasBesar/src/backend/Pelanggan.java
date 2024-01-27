/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author ASUS
 */
public class Pelanggan implements IFeature {
    private int idPelanggan;
    private String namaPelanggan;
    private String noTelp;
    private String alamat;
    private String jk;
    private Pembayaran bayar;

    public Pelanggan(String namaPelanggan, String noTelp, String alamat, String jk){
        this.namaPelanggan = namaPelanggan;
        this.noTelp = noTelp;
        this.alamat = alamat;
        this.jk = jk;
    }
    
    public Pelanggan(){
        
    }
    
    @Override
    public void save(){
        if (getById(idPelanggan).getIdPelanggan() == 0) {
            String SQL = "INSERT INTO pelanggan (nama_pelanggan,notelp,alamat,jk) VALUES("
                    + "     '" + this.namaPelanggan + "', "
                    + "     '" + this.noTelp + "', "
                    + "     '" + this.alamat + "', "
                    + "     '" + this.jk + "' "
                    + "     )";
            this.idPelanggan = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE pelanggan SET "
                    + "     nama_pelanggan = '" + this.namaPelanggan + "', "
                    + "     notelp = '" + this.noTelp + "', "
                    + "     alamat = '" + this.alamat + "', "
                    + "     jk = '" + this.jk + "' "
                    + "     WHERE id_pelanggan = '" + this.idPelanggan + "'";
            DBHelper.executeQuery(SQL);
        }
    }
    
    @Override
    public void delete(){
        String SQL = "DELETE FROM pelanggan WHERE id_pelanggan = '" + this.idPelanggan + "'";
        DBHelper.executeQuery(SQL);
    }
    
    public Pelanggan getById(int id) {
        Pelanggan plg = new Pelanggan();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM pelanggan " + "WHERE id_pelanggan = '" + id + "'");

        try {
            while (rs.next()) {
                plg = new Pelanggan();
                plg.setIdPelanggan(rs.getInt("id_pelanggan"));
                plg.setNamaPelanggan(rs.getString("nama_pelanggan"));
                plg.setNoTelp(rs.getString("notelp"));
                plg.setAlamat(rs.getString("alamat"));
                plg.setJk(rs.getString("jk"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return plg;
    }

    public ArrayList<Pelanggan> getAll() {
        ArrayList<Pelanggan> ListPelanggan = new ArrayList();

        ResultSet rs = DBHelper.selectQuery("Select * From pelanggan");

        try {
            while (rs.next()) {
                Pelanggan plg = new Pelanggan();
                plg.setIdPelanggan(rs.getInt("id_pelanggan"));
                plg.setNamaPelanggan(rs.getString("nama_pelanggan"));
                plg.setNoTelp(rs.getString("notelp"));
                plg.setAlamat(rs.getString("alamat"));
                plg.setJk(rs.getString("jk"));

                ListPelanggan.add(plg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListPelanggan;
    }

    public ArrayList<Pelanggan> search(String keyword) {
        ArrayList<Pelanggan> ListPelanggan = new ArrayList();

        String sql = "Select * FROM pelanggan WHERE "
                + " nama_Pelanggan LIKE '%" + keyword + "%'"
                + " OR notelp LIKE '%" + keyword + "%'"
                + " OR alamat LIKE '%" + keyword + "%'"
                + " OR jk LIKE '%" + keyword + "%' ";

        ResultSet rs = DBHelper.selectQuery(sql);

        try {
            while (rs.next()) {
                Pelanggan plg = new Pelanggan();
                plg.setIdPelanggan(rs.getInt("id_pelanggan"));
                plg.setNamaPelanggan(rs.getString("nama_pelanggan"));
                plg.setNoTelp(rs.getString("notelp"));
                plg.setAlamat(rs.getString("alamat"));
                plg.setJk(rs.getString("jk"));

                ListPelanggan.add(plg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListPelanggan;
    }
    
    public void setIdPelanggan(int idPelanggan) {
        this.idPelanggan = idPelanggan;
    }
    
    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }
    
    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public void setJk(String jk) {
        this.jk = jk;
    }
    
    public int getIdPelanggan() {
        return idPelanggan;
    }
    
    public String getNamaPelanggan() {
        return namaPelanggan;
    }
    
    public String getNoTelp() {
        return noTelp;
    }
    
    public String getAlamat() {
        return alamat;
    }
    
    public String getJk() {
        return jk;
    }
    
    
}
