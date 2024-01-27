/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import backend.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ASUS
 */
public class FormBaju extends javax.swing.JFrame {

    /**
     * Creates new form FormBaju
     */
    public FormBaju() {
        initComponents();
        emptyBaju();
        showBaju();
        tampilkanCmbJenisBaju();
    }
    
    public void emptyBaju(){
        tfIdBaju.setText("0");
        cbJenisBaju.setSelectedIndex(0);
        tfMerkBaju.setText("");
        tfHargaBaju.setText("");
        cbUkuranBaju.setSelectedIndex(0);
        tfStokBaju.setText("");
    }
    
    public void showBaju(){
        String[] kolom = {"Id", "Jenis", "Merk", "Harga", "Ukuran", "Stok"};
        ArrayList<Baju> list = new Baju().getAll();
        Object rowData[] = new Object[6];
        
        tabBaju.setModel(new DefaultTableModel (new Object[][] {}, kolom));
        
        for(Baju bj : list){
            rowData[0] = bj.getIdBaju();
            rowData[1] = bj.getJenis().getNamaJenis();
            rowData[2] = bj.getMerkBaju();
            rowData[3] = bj.getHarga();
            rowData[4] = bj.getUkuran();
            rowData[5] = bj.getStok();
            
            ((DefaultTableModel)tabBaju.getModel()).addRow(rowData);
        }
    }
    
    public void cariBaju(String keyword){
        String[] kolom = {"Id", "Jenis", "Merk", "Harga", "Ukuran", "Stok"};
        ArrayList<Baju> list = new Baju().search(keyword);
        Object rowData[] = new Object[6];
        
        tabBaju.setModel (new DefaultTableModel(new Object[][] {}, kolom));
        
        for (Baju bj: list){
            rowData[0] = bj.getIdBaju();
            rowData[1] = bj.getJenis().getNamaJenis();
            rowData[2] = bj.getMerkBaju();
            rowData[3] = bj.getHarga();
            rowData[4] = bj.getUkuran();
            rowData[5] = bj.getStok();
            
            ((DefaultTableModel) tabBaju.getModel()).addRow(rowData);
        }
    }
    
    public void tampilkanCmbJenisBaju() {
        try {
            String SQL = "SELECT * FROM jenis" ;
            ResultSet rs = DBHelper.selectQuery(SQL);
            while (rs.next()) {
                cbJenisBaju.addItem(rs.getString("nama_jenis"));
//                cbJenisBaju.setModel(new DefaultComboBoxModel(new Jenis().getAll().toArray()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabBaju = new javax.swing.JTable();
        tfIdBaju = new javax.swing.JTextField();
        cbJenisBaju = new javax.swing.JComboBox<>();
        tfMerkBaju = new javax.swing.JTextField();
        tfHargaBaju = new javax.swing.JTextField();
        tfStokBaju = new javax.swing.JTextField();
        cbUkuranBaju = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btSaveBaju = new javax.swing.JButton();
        btResetBaju = new javax.swing.JButton();
        btDeleteBaju = new javax.swing.JButton();
        tfFindBaju = new javax.swing.JTextField();
        btFindBaju = new javax.swing.JButton();
        btMoveJenis = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        btMovePelanggan = new javax.swing.JButton();
        btExitBaju1 = new javax.swing.JButton();
        btMoveTransaksi = new javax.swing.JButton();
        btMovePembayaran = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Form Baju");

        tabBaju.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Jenis", "Merk", "Harga", "Ukuran", "Stok"
            }
        ));
        tabBaju.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabBajuMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabBaju);

        tfIdBaju.setEditable(false);
        tfIdBaju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdBajuActionPerformed(evt);
            }
        });

        cbJenisBaju.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih jenis" }));

        tfMerkBaju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMerkBajuActionPerformed(evt);
            }
        });

        tfStokBaju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfStokBajuActionPerformed(evt);
            }
        });

        cbUkuranBaju.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "M", "L", "XL", "XXL", "XXXL" }));

        jLabel15.setText("Id");

        jLabel16.setText("Jenis");

        jLabel17.setText("Merk");

        jLabel18.setText("Harga");

        jLabel19.setText("Ukuran");

        jLabel20.setText("Stok");

        btSaveBaju.setText("Save");
        btSaveBaju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveBajuActionPerformed(evt);
            }
        });

        btResetBaju.setText("Reset");
        btResetBaju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetBajuActionPerformed(evt);
            }
        });

        btDeleteBaju.setText("Delete");
        btDeleteBaju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteBajuActionPerformed(evt);
            }
        });

        tfFindBaju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFindBajuActionPerformed(evt);
            }
        });

        btFindBaju.setText("Find");
        btFindBaju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFindBajuActionPerformed(evt);
            }
        });

        btMoveJenis.setText("Jenis");
        btMoveJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMoveJenisActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Pindah Halaman");

        btMovePelanggan.setText("Pelanggan");
        btMovePelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMovePelangganActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbJenisBaju, 0, 123, Short.MAX_VALUE)
                            .addComponent(cbUkuranBaju, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfStokBaju)
                            .addComponent(tfHargaBaju)
                            .addComponent(tfMerkBaju)
                            .addComponent(tfIdBaju))
                        .addGap(125, 125, 125))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(btMoveJenis)
                                .addGap(18, 18, 18)
                                .addComponent(btMovePelanggan))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btSaveBaju)
                                .addGap(18, 18, 18)
                                .addComponent(btResetBaju)
                                .addGap(18, 18, 18)
                                .addComponent(btDeleteBaju))
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tfFindBaju, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btFindBaju)))
                .addGap(17, 17, 17))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfFindBaju, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btFindBaju))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel14)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfIdBaju, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbJenisBaju, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMerkBaju, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfHargaBaju, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbUkuranBaju, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfStokBaju, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSaveBaju)
                    .addComponent(btResetBaju)
                    .addComponent(btDeleteBaju))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btMoveJenis)
                    .addComponent(btMovePelanggan))
                .addGap(12, 12, 12))
        );

        jTabbedPane1.addTab("Baju", jPanel3);

        btExitBaju1.setText("Exit");

        btMoveTransaksi.setText("Transaksi");
        btMoveTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMoveTransaksiActionPerformed(evt);
            }
        });

        btMovePembayaran.setText("Pembayaran");
        btMovePembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMovePembayaranActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btMoveTransaksi)
                .addGap(18, 18, 18)
                .addComponent(btMovePembayaran)
                .addGap(18, 18, 18)
                .addComponent(btExitBaju1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btMoveTransaksi)
                    .addComponent(btMovePembayaran)
                    .addComponent(btExitBaju1))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabBajuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabBajuMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tabBaju.getModel();
        int row = tabBaju.getSelectedRow();
        Baju baju = new Baju();

        baju = baju.getById(Integer.parseInt(model.getValueAt(row, 0).toString()));

        tfIdBaju.setText(model.getValueAt(row, 0).toString());
        cbJenisBaju.getModel().setSelectedItem(baju.getJenis().getNamaJenis());
        tfMerkBaju.setText(model.getValueAt(row, 2).toString());
        tfHargaBaju.setText(model.getValueAt(row, 3).toString());
        cbUkuranBaju.getModel().setSelectedItem(baju.getUkuran());
        tfStokBaju.setText(model.getValueAt(row, 5).toString());

    }//GEN-LAST:event_tabBajuMouseClicked

    private void tfIdBajuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdBajuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdBajuActionPerformed

    private void tfMerkBajuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMerkBajuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMerkBajuActionPerformed

    private void tfStokBajuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfStokBajuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfStokBajuActionPerformed

    private void btSaveBajuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveBajuActionPerformed
        // TODO add your handling code here:
        Jenis jenis = new Jenis();
        Baju bj = new Baju();
        bj.setIdBaju(Integer.parseInt(tfIdBaju.getText()));
        bj.setJenis((jenis.getByNama(cbJenisBaju.getSelectedItem().toString())));
        bj.setMerkBaju(tfMerkBaju.getText());
        bj.setHarga(Integer.parseInt(tfHargaBaju.getText()));
        bj.setUkuran(cbUkuranBaju.getSelectedItem().toString());
        bj.setStok(Integer.parseInt(tfStokBaju.getText()));
        bj.save();
        tfIdBaju.setText(Integer.toString(bj.getIdBaju()));
        showBaju();
    }//GEN-LAST:event_btSaveBajuActionPerformed

    private void btResetBajuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetBajuActionPerformed
        // TODO add your handling code here:
        emptyBaju();
    }//GEN-LAST:event_btResetBajuActionPerformed

    private void btDeleteBajuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteBajuActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tabBaju.getModel();
        int row = tabBaju.getSelectedRow();

        Baju baju = new Baju().getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
        baju.delete();
        emptyBaju();
        showBaju();
    }//GEN-LAST:event_btDeleteBajuActionPerformed

    private void tfFindBajuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFindBajuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFindBajuActionPerformed

    private void btFindBajuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFindBajuActionPerformed
        // TODO add your handling code here:
        cariBaju(tfFindBaju.getText());
    }//GEN-LAST:event_btFindBajuActionPerformed

    private void btMoveJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMoveJenisActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new FormJenis().setVisible(true);
            dispose();
            }
        });
    }//GEN-LAST:event_btMoveJenisActionPerformed

    private void btMovePelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMovePelangganActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new FormPelanggan().setVisible(true);
            dispose();
            }
        });
    }//GEN-LAST:event_btMovePelangganActionPerformed

    private void btMoveTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMoveTransaksiActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new FormTransaksi().setVisible(true);
            dispose();
            }
        });
    }//GEN-LAST:event_btMoveTransaksiActionPerformed

    private void btMovePembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMovePembayaranActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new FormPembayaran().setVisible(true);
            dispose();
            }
        });
    }//GEN-LAST:event_btMovePembayaranActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormBaju.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBaju.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBaju.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBaju.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBaju().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDeleteBaju;
    private javax.swing.JButton btExitBaju1;
    private javax.swing.JButton btFindBaju;
    private javax.swing.JButton btMoveJenis;
    private javax.swing.JButton btMovePelanggan;
    private javax.swing.JButton btMovePembayaran;
    private javax.swing.JButton btMoveTransaksi;
    private javax.swing.JButton btResetBaju;
    private javax.swing.JButton btSaveBaju;
    private javax.swing.JComboBox<String> cbJenisBaju;
    private javax.swing.JComboBox<String> cbUkuranBaju;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabBaju;
    private javax.swing.JTextField tfFindBaju;
    private javax.swing.JTextField tfHargaBaju;
    private javax.swing.JTextField tfIdBaju;
    private javax.swing.JTextField tfMerkBaju;
    private javax.swing.JTextField tfStokBaju;
    // End of variables declaration//GEN-END:variables
}
