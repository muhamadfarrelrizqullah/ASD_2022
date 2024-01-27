/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import backend.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ASUS
 */
public class FormPembayaran extends javax.swing.JFrame {

    /**
     * Creates new form FormPembayaran
     */
    public FormPembayaran() {
        initComponents();
        emptyPembayaran();
        showPembayaran();
    }
    
    public void emptyPembayaran(){
        tfIdPembayaran.setText("0");
        cbPelangganPembayaran.setSelectedIndex(0);
        tfNamaPembayaran.setText("");
        tfNominalPembayaran.setText("");
        cbTipeBayarPembayaran.setSelectedIndex(0);
    }
    
    public void showPembayaran(){
        String[] kolom = {"Id", "Pelanggan", "Nama", "Nominal", "Tipe Bayar"};
        ArrayList<Pembayaran> list = new Pembayaran().getAll();
        Object rowData[] = new Object[5];
        
        tabPembayaran.setModel(new DefaultTableModel (new Object[][] {}, kolom));
        
        for(Pembayaran byr : list){
            rowData[0] = byr.getIdPembayaran();
            rowData[1] = byr.getPelanggan();
            rowData[2] = byr.getNamaBayar();
            rowData[3] = byr.getNominal();
            rowData[4] = byr.getTipeBayar();
            
            ((DefaultTableModel)tabPembayaran.getModel()).addRow(rowData);
        }
    }
    
    public void cariPembayaran(String keyword){
        String[] kolom = {"Id", "Pelanggan", "Nama", "Nominal", "Tipe Bayar"};
        ArrayList<Pembayaran> list = new Pembayaran().search(keyword);
        Object rowData[] = new Object[5];
        
        tabPembayaran.setModel (new DefaultTableModel(new Object[][] {}, kolom));
        
        for (Pembayaran byr: list){
            rowData[0] = byr.getIdPembayaran();
            rowData[1] = byr.getPelanggan();
            rowData[2] = byr.getNamaBayar();
            rowData[3] = byr.getNominal();
            rowData[4] = byr.getTipeBayar();
            
            ((DefaultTableModel) tabPembayaran.getModel()).addRow(rowData);
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
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabPembayaran = new javax.swing.JTable();
        tfFindPembayaran = new javax.swing.JTextField();
        btFindPembayaran = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        tfIdPembayaran = new javax.swing.JTextField();
        tfNamaPembayaran = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btSavePembayaran = new javax.swing.JButton();
        btResetPembayaran = new javax.swing.JButton();
        btDeletePembayaran = new javax.swing.JButton();
        cbPelangganPembayaran = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        tfNominalPembayaran = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbTipeBayarPembayaran = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        btMoveBaju = new javax.swing.JButton();
        btMoveJenis = new javax.swing.JButton();
        btMovePelanggan = new javax.swing.JButton();
        btMoveTransaksi = new javax.swing.JButton();
        btExitPembayaran = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabPembayaran.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Pelanggan", "Nama", "Nominal", "Tipe Bayar"
            }
        ));
        tabPembayaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabPembayaranMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tabPembayaran);

        btFindPembayaran.setText("Find");
        btFindPembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFindPembayaranActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Form Pembayaran");

        tfIdPembayaran.setEditable(false);
        tfIdPembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdPembayaranActionPerformed(evt);
            }
        });

        tfNamaPembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNamaPembayaranActionPerformed(evt);
            }
        });

        jLabel22.setText("Id");

        jLabel23.setText("Nama");

        btSavePembayaran.setText("Save");
        btSavePembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSavePembayaranActionPerformed(evt);
            }
        });

        btResetPembayaran.setText("Reset");
        btResetPembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetPembayaranActionPerformed(evt);
            }
        });

        btDeletePembayaran.setText("Delete");
        btDeletePembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletePembayaranActionPerformed(evt);
            }
        });

        cbPelangganPembayaran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Pelanggan");

        jLabel2.setText("Nominal");

        cbTipeBayarPembayaran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Debit", "Kredit" }));

        jLabel3.setText("Tipe Bayar");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setText("Pindah Halaman");

        btMoveBaju.setText("Baju");
        btMoveBaju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMoveBajuActionPerformed(evt);
            }
        });

        btMoveJenis.setText("Jenis");
        btMoveJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMoveJenisActionPerformed(evt);
            }
        });

        btMovePelanggan.setText("Pelanggan");
        btMovePelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMovePelangganActionPerformed(evt);
            }
        });

        btMoveTransaksi.setText("Transaksi");
        btMoveTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMoveTransaksiActionPerformed(evt);
            }
        });

        btExitPembayaran.setText("Exit");
        btExitPembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitPembayaranActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btMovePelanggan)
                        .addGap(18, 18, 18)
                        .addComponent(btMoveTransaksi)
                        .addGap(18, 18, 18)
                        .addComponent(btExitPembayaran)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfNamaPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tfIdPembayaran, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                            .addComponent(cbPelangganPembayaran, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cbTipeBayarPembayaran, 0, 123, Short.MAX_VALUE)
                                        .addComponent(tfNominalPembayaran))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btSavePembayaran)
                                .addGap(18, 18, 18)
                                .addComponent(btResetPembayaran)
                                .addGap(18, 18, 18)
                                .addComponent(btDeletePembayaran))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(btMoveBaju)
                                .addGap(18, 18, 18)
                                .addComponent(btMoveJenis))
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(tfFindPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btFindPembayaran)))
                        .addGap(14, 14, 14))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfFindPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btFindPembayaran)
                    .addComponent(jLabel21))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfIdPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbPelangganPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNamaPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNominalPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbTipeBayarPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btResetPembayaran)
                            .addComponent(btSavePembayaran)
                            .addComponent(btDeletePembayaran))
                        .addGap(49, 49, 49)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btMoveBaju)
                            .addComponent(btMoveJenis))))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btMovePelanggan)
                    .addComponent(btMoveTransaksi)
                    .addComponent(btExitPembayaran))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Pembayaran", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabPembayaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPembayaranMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tabPembayaran.getModel();
        int row = tabPembayaran.getSelectedRow();
        Pembayaran pembayaran = new Pembayaran();

        pembayaran = pembayaran.getById(Integer.parseInt(model.getValueAt(row, 0).toString()));

        tfIdPembayaran.setText(model.getValueAt(row, 0).toString());
        cbPelangganPembayaran.getModel().setSelectedItem(pembayaran.getPelanggan().getNamaPelanggan());
        tfNamaPembayaran.setText(model.getValueAt(row, 2).toString());
        tfNominalPembayaran.setText(model.getValueAt(row, 3).toString());
        //        cbTipeBayarPembayaran1.getModel().setSelectedItem();
    }//GEN-LAST:event_tabPembayaranMouseClicked

    private void btFindPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFindPembayaranActionPerformed
        // TODO add your handling code here:
        cariPembayaran(tfFindPembayaran.getText());
    }//GEN-LAST:event_btFindPembayaranActionPerformed

    private void tfIdPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdPembayaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdPembayaranActionPerformed

    private void btSavePembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSavePembayaranActionPerformed
        // TODO add your handling code here:
        Pembayaran byr = new Pembayaran();
        byr.setIdPembayaran(Integer.parseInt(tfIdPembayaran.getText()));
        byr.setPelanggan((Pelanggan)cbPelangganPembayaran.getSelectedItem());
        byr.setNamaBayar(tfNamaPembayaran.getText());
        byr.setNominal(Integer.parseInt(tfNominalPembayaran.getText()));
        //        cbTipeBayar.getSelectedItem();
        byr.save();
        tfIdPembayaran.setText(Integer.toString(byr.getIdPembayaran()));
        showPembayaran();
    }//GEN-LAST:event_btSavePembayaranActionPerformed

    private void btResetPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetPembayaranActionPerformed
        // TODO add your handling code here:
        emptyPembayaran();
    }//GEN-LAST:event_btResetPembayaranActionPerformed

    private void btDeletePembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletePembayaranActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tabPembayaran.getModel();
        int row = tabPembayaran.getSelectedRow();

        Pembayaran pembayaran = new Pembayaran().getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
        pembayaran.delete();
        emptyPembayaran();
        showPembayaran();
    }//GEN-LAST:event_btDeletePembayaranActionPerformed

    private void btExitPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitPembayaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btExitPembayaranActionPerformed

    private void tfNamaPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNamaPembayaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNamaPembayaranActionPerformed

    private void btMoveJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMoveJenisActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new FormJenis().setVisible(true);
            dispose();
            }
        });
    }//GEN-LAST:event_btMoveJenisActionPerformed

    private void btMoveBajuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMoveBajuActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new FormBaju().setVisible(true);
            dispose();
            }
        });
    }//GEN-LAST:event_btMoveBajuActionPerformed

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
            java.util.logging.Logger.getLogger(FormPembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPembayaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDeletePembayaran;
    private javax.swing.JButton btExitPembayaran;
    private javax.swing.JButton btFindPembayaran;
    private javax.swing.JButton btMoveBaju;
    private javax.swing.JButton btMoveJenis;
    private javax.swing.JButton btMovePelanggan;
    private javax.swing.JButton btMoveTransaksi;
    private javax.swing.JButton btResetPembayaran;
    private javax.swing.JButton btSavePembayaran;
    private javax.swing.JComboBox<String> cbPelangganPembayaran;
    private javax.swing.JComboBox<String> cbTipeBayarPembayaran;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabPembayaran;
    private javax.swing.JTextField tfFindPembayaran;
    private javax.swing.JTextField tfIdPembayaran;
    private javax.swing.JTextField tfNamaPembayaran;
    private javax.swing.JTextField tfNominalPembayaran;
    // End of variables declaration//GEN-END:variables
}