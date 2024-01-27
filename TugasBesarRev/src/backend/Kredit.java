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
public class Kredit extends Pembayaran {

    private int totalKredit;

    public int getTotalKredit() {
        return totalKredit;
    }

    public void setTotalKredit(int totalKredit) {
        this.totalKredit = totalKredit;
    }

    public Kredit() {
    }

    public Kredit(Pelanggan pelanggan, String namaBayar, String tipeBayar, int totalKredit) {
//        super(idpelanggan,namaBayar, tipeBayar, totalKredit);
        this.pelanggan = pelanggan;
        this.namaBayar = namaBayar;
        this.tipeBayar = tipeBayar;
        this.totalKredit = totalKredit;
    }

    public ArrayList<Kredit> getAll() {
        ArrayList<Kredit> ListBayar = new ArrayList();

        ResultSet rs = DBHelper.selectQuery("Select * From pembayaran");

        try {
            while (rs.next()) {
                Kredit bayar = new Kredit();
                Pelanggan plg = new Pelanggan().getById(rs.getInt("id_pelanggan"));

                bayar.setIdBayar(rs.getInt("id_pembayaran"));
                bayar.setPelanggan(plg);
                bayar.setNamaBayar(rs.getString("namaBayar"));
                bayar.setTipeBayar(rs.getString("tipebayar"));
                bayar.setNominal(rs.getInt("nominal"));

                ListBayar.add(bayar);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBayar;
    }

    public Kredit getById(int id) {
        Kredit bayar = new Kredit();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM pembayaran " + "WHERE id_pembayaran = '" + id + "'");

        try {
            while (rs.next()) {
                bayar = new Kredit();
                Pelanggan plg = new Pelanggan().getById(rs.getInt("id_pelanggan"));

                bayar.setIdBayar(rs.getInt("id_pembayaran"));
                bayar.setPelanggan(plg);
                bayar.setNamaBayar(rs.getString("namaBayar"));
                bayar.setTipeBayar(rs.getString("tipebayar"));
                bayar.setNominal(rs.getInt("nominal"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bayar;
    }

    @Override
    public void save() {
        if (getById(idBayar).getIdBayar() == 0) {
            String SQL = "INSERT INTO pembayaran (id_pelanggan,namaBayar,nominal,tipebayar) VALUES("
                    + "     '" + this.pelanggan.getIdPelanggan() + "', "
                    + "     '" + this.namaBayar + "', "
                    + "     '" + this.totalKredit + "', "
                    + "     '" + this.nominal + "', "
                    + "     '" + this.tipeBayar + "' "
                    + "     )";
            this.idBayar = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE pembayaran SET "
                    + "     '" + this.pelanggan.getIdPelanggan() + "', "
                    + "     '" + this.namaBayar + "', "
                    + "     '" + this.totalKredit + "', "
                    + "     '" + this.nominal + "', "
                    + "     '" + this.tipeBayar + "' "
                    + "     WHERE id_pembayaran = '" + this.idBayar + "'";
            DBHelper.executeQuery(SQL);
        }
    }

    @Override
    public void delete() {
        String SQL = "DELETE FROM baju WHERE id_pembayaran = '" + this.idBayar + "'";
        DBHelper.executeQuery(SQL);
    }

}
