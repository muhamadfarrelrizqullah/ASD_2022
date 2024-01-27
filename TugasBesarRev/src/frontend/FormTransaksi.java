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
public class FormTransaksi extends javax.swing.JFrame {

    /**
     * Creates new form FormTransaksi
     */
    public FormTransaksi() {
        initComponents();
        emptyTransaksi();
        showTransaksi();
    }
    
    public void emptyTransaksi(){
        tfIdTransaksi.setText("0");
        cbBajuTransaksi.setSelectedIndex(0);
        cbPelangganTransaksi.setSelectedIndex(0);
        tfTanggalTransaksi.setText("");
        tfJumlahTransaksi.setText("0");
        tfHargaTransaksi.setText("0");
    }
    
    public void showTransaksi(){
        String[] kolom = {"Id", "Baju", "Pelanggan", "Tanggal", "Jumlah", "Harga", "Total"};
        ArrayList<Transaksi> list = new Transaksi().getAll();
        Object rowData[] = new Object[7];
        
        tabTransaksi.setModel(new DefaultTableModel (new Object[][] {}, kolom));
        
        for(Transaksi trs : list){
            rowData[0] = trs.getIdTransaksi();
            rowData[1] = trs.getBaju();
            rowData[2] = trs.getPelanggan();
            rowData[3] = trs.getTanggalTransaksi();
            rowData[4] = trs.getJumlahBeli();
            rowData[5] = trs.getHargaBeli();
            rowData[6] = trs.getJumlahBeli() * trs.getHargaBeli();
            
            ((DefaultTableModel)tabTransaksi.getModel()).addRow(rowData);
        }
    }
    
    public void cariTransaksi(String keyword){
        String[] kolom = {"Id", "Baju", "Pelanggan", "Tanggal", "Jumlah", "Harga", "Total"};
        ArrayList<Transaksi> list = new Transaksi().search(keyword);
        Object rowData[] = new Object[7];
        
        tabTransaksi.setModel (new DefaultTableModel(new Object[][] {}, kolom));
        
        for (Transaksi trs: list){
            rowData[0] = trs.getIdTransaksi();
            rowData[1] = trs.getBaju();
            rowData[2] = trs.getPelanggan();
            rowData[3] = trs.getTanggalTransaksi();
            rowData[4] = trs.getJumlahBeli();
            rowData[5] = trs.getHargaBeli();
            rowData[6] = trs.getJumlahBeli() * trs.getHargaBeli();
            
            ((DefaultTableModel) tabTransaksi.getModel()).addRow(rowData);
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
        jScrollPane4 = new javax.swing.JScrollPane();
        tabTransaksi = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        tfIdTransaksi = new javax.swing.JTextField();
        cbBajuTransaksi = new javax.swing.JComboBox<>();
        cbPelangganTransaksi = new javax.swing.JComboBox<>();
        tfTanggalTransaksi = new javax.swing.JTextField();
        tfJumlahTransaksi = new javax.swing.JTextField();
        tfHargaTransaksi = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btSaveTransaksi = new javax.swing.JButton();
        btResetTransaksi = new javax.swing.JButton();
        btDeleteTransaksi = new javax.swing.JButton();
        tfFindTransaksi = new javax.swing.JTextField();
        btFindTransaksi = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        btMoveBaju = new javax.swing.JButton();
        btMoveJenis = new javax.swing.JButton();
        btMovePelanggan = new javax.swing.JButton();
        btMovePembayaran = new javax.swing.JButton();
        btExitTransaksi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Baju", "Pelanggan", "Tanggal", "Jumlah", "Harga", "Total"
            }
        ));
        tabTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabTransaksiMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabTransaksi);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Form Transaksi");

        tfIdTransaksi.setEditable(false);

        cbBajuTransaksi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbPelangganTransaksi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel15.setText("Id");

        jLabel16.setText("Baju");

        jLabel17.setText("Pelanggan");

        jLabel18.setText("Tanggal");

        jLabel19.setText("Jumlah");

        jLabel20.setText("Harga");

        btSaveTransaksi.setText("Save");
        btSaveTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveTransaksiActionPerformed(evt);
            }
        });

        btResetTransaksi.setText("Reset");
        btResetTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetTransaksiActionPerformed(evt);
            }
        });

        btDeleteTransaksi.setText("Delete");
        btDeleteTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteTransaksiActionPerformed(evt);
            }
        });

        btFindTransaksi.setText("Find");
        btFindTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFindTransaksiActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setText("Pindah Halaman");

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

        btMovePembayaran.setText("Pembayaran");

        btExitTransaksi.setText("Exit");
        btExitTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitTransaksiActionPerformed(evt);
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
                        .addComponent(btMovePelanggan)
                        .addGap(18, 18, 18)
                        .addComponent(btMovePembayaran)
                        .addGap(18, 18, 18)
                        .addComponent(btExitTransaksi)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfIdTransaksi)
                                    .addComponent(cbBajuTransaksi, 0, 123, Short.MAX_VALUE)
                                    .addComponent(cbPelangganTransaksi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfTanggalTransaksi)
                                    .addComponent(tfJumlahTransaksi)
                                    .addComponent(tfHargaTransaksi))
                                .addGap(119, 119, 119))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(btSaveTransaksi)
                                        .addGap(18, 18, 18)
                                        .addComponent(btResetTransaksi)
                                        .addGap(18, 18, 18)
                                        .addComponent(btDeleteTransaksi))
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(btMoveBaju)
                                        .addGap(18, 18, 18)
                                        .addComponent(btMoveJenis)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(tfFindTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btFindTransaksi)))
                        .addGap(15, 15, 15))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfFindTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btFindTransaksi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel14)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfIdTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbBajuTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbPelangganTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfTanggalTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfJumlahTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfHargaTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btSaveTransaksi)
                            .addComponent(btResetTransaksi)
                            .addComponent(btDeleteTransaksi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btMoveBaju)
                            .addComponent(btMoveJenis))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btMovePelanggan)
                    .addComponent(btMovePembayaran)
                    .addComponent(btExitTransaksi)))
        );

        jTabbedPane1.addTab("Transaksi", jPanel3);

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
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabTransaksiMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tabTransaksi.getModel();
        int row = tabTransaksi.getSelectedRow();
        Transaksi transaksi = new Transaksi();

        transaksi = transaksi.getById(Integer.parseInt(model.getValueAt(row, 0).toString()));

        tfIdTransaksi.setText(model.getValueAt(row, 0).toString());
        cbBajuTransaksi.getModel().setSelectedItem(transaksi.getBaju().getMerkBaju());
        cbPelangganTransaksi.getModel().setSelectedItem(transaksi.getPelanggan().getNamaPelanggan());
        tfTanggalTransaksi.setText(model.getValueAt(row, 3).toString());
        tfJumlahTransaksi.setText(model.getValueAt(row, 4).toString());
        tfHargaTransaksi.setText(model.getValueAt(row, 5).toString());
    }//GEN-LAST:event_tabTransaksiMouseClicked

    private void btSaveTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveTransaksiActionPerformed
        // TODO add your handling code here:
        Transaksi trs = new Transaksi();
        trs.setIdTransaksi(Integer.parseInt(tfIdTransaksi.getText()));
        trs.setBaju((Baju)cbBajuTransaksi.getSelectedItem());
        trs.setPelanggan((Pelanggan)cbPelangganTransaksi.getSelectedItem());
        trs.setTanggalTransaksi(tfTanggalTransaksi.getText());
        trs.setJumlahBeli(Integer.parseInt(tfJumlahTransaksi.getText()));
        trs.setHargaBeli(Integer.parseInt(tfHargaTransaksi.getText()));
        trs.save();
        tfIdTransaksi.setText(Integer.toString(trs.getIdTransaksi()));
        showTransaksi();
    }//GEN-LAST:event_btSaveTransaksiActionPerformed

    private void btResetTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetTransaksiActionPerformed
        // TODO add your handling code here:
        emptyTransaksi();
    }//GEN-LAST:event_btResetTransaksiActionPerformed

    private void btDeleteTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteTransaksiActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tabTransaksi.getModel();
        int row = tabTransaksi.getSelectedRow();

        Transaksi transaksi = new Transaksi().getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
        transaksi.delete();
        emptyTransaksi();
        showTransaksi();
    }//GEN-LAST:event_btDeleteTransaksiActionPerformed

    private void btExitTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitTransaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btExitTransaksiActionPerformed

    private void btFindTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFindTransaksiActionPerformed
        // TODO add your handling code here:
        cariTransaksi(tfFindTransaksi.getText());
    }//GEN-LAST:event_btFindTransaksiActionPerformed

    private void btMoveBajuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMoveBajuActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new FormBaju().setVisible(true);
            dispose();
            }
        });
    }//GEN-LAST:event_btMoveBajuActionPerformed

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
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTransaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDeleteTransaksi;
    private javax.swing.JButton btExitTransaksi;
    private javax.swing.JButton btFindTransaksi;
    private javax.swing.JButton btMoveBaju;
    private javax.swing.JButton btMoveJenis;
    private javax.swing.JButton btMovePelanggan;
    private javax.swing.JButton btMovePembayaran;
    private javax.swing.JButton btResetTransaksi;
    private javax.swing.JButton btSaveTransaksi;
    private javax.swing.JComboBox<String> cbBajuTransaksi;
    private javax.swing.JComboBox<String> cbPelangganTransaksi;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabTransaksi;
    private javax.swing.JTextField tfFindTransaksi;
    private javax.swing.JTextField tfHargaTransaksi;
    private javax.swing.JTextField tfIdTransaksi;
    private javax.swing.JTextField tfJumlahTransaksi;
    private javax.swing.JTextField tfTanggalTransaksi;
    // End of variables declaration//GEN-END:variables
}