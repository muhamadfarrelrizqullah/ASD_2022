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
public class FormJenis extends javax.swing.JFrame {

    /**
     * Creates new form FormJenis
     */
    public FormJenis() {
        initComponents();
        emptyJenis();
        showJenis();
    }
    
    public void emptyJenis(){
        tfIdJenis.setText("0");
        tfNamaJenis.setText("");
        taKetJenis.setText("");
    }
    
    public void showJenis(){
        String[] kolom = {"Id", "Nama", "Keterangan"};
        ArrayList<Jenis> list = new Jenis().getAll();
        Object rowData[] = new Object[3];
        
        tabJenis.setModel(new DefaultTableModel (new Object[][] {}, kolom));
        
        for(Jenis jen : list){
            rowData[0] = jen.getIdJenis();
            rowData[1] = jen.getNamaJenis();
            rowData[2] = jen.getKeterangan();
            
            ((DefaultTableModel)tabJenis.getModel()).addRow(rowData);
        }
    }
    
    public void cariJenis(String keyword){
        String[] kolom = {"Id","Nama","Keterangan"};
        ArrayList<Jenis> list = new Jenis().search(keyword);
        Object rowData[] = new Object[3];
        
        tabJenis.setModel (new DefaultTableModel(new Object[][] {}, kolom));
        
        for (Jenis jen: list){
            rowData[0] = jen.getIdJenis();
            rowData[1] = jen.getNamaJenis();
            rowData[2] = jen.getKeterangan();
            
            ((DefaultTableModel) tabJenis.getModel()).addRow(rowData);
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
        tabJenis = new javax.swing.JTable();
        tfFindJenis = new javax.swing.JTextField();
        btFindJenis = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        taKetJenis = new javax.swing.JTextArea();
        tfIdJenis = new javax.swing.JTextField();
        tfNamaJenis = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        btSaveJenis = new javax.swing.JButton();
        btResetJenis = new javax.swing.JButton();
        btDeleteJenis = new javax.swing.JButton();
        btMoveBaju = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        btMoveTransaksi = new javax.swing.JButton();
        btMovePelanggan = new javax.swing.JButton();
        btMovePembayaran = new javax.swing.JButton();
        btExitJenis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabJenis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nama", "Keterangan"
            }
        ));
        tabJenis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabJenisMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tabJenis);

        btFindJenis.setText("Find");
        btFindJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFindJenisActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Form Jenis");

        taKetJenis.setColumns(20);
        taKetJenis.setRows(5);
        jScrollPane6.setViewportView(taKetJenis);

        tfIdJenis.setEditable(false);
        tfIdJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdJenisActionPerformed(evt);
            }
        });

        tfNamaJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNamaJenisActionPerformed(evt);
            }
        });

        jLabel22.setText("Id");

        jLabel23.setText("Nama");

        jLabel24.setText("Keterangan");

        btSaveJenis.setText("Save");
        btSaveJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveJenisActionPerformed(evt);
            }
        });

        btResetJenis.setText("Reset");
        btResetJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetJenisActionPerformed(evt);
            }
        });

        btDeleteJenis.setText("Delete");
        btDeleteJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteJenisActionPerformed(evt);
            }
        });

        btMoveBaju.setText("Baju");
        btMoveBaju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMoveBajuActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setText("Pindah Halaman");

        btMoveTransaksi.setText("Transaksi");
        btMoveTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMoveTransaksiActionPerformed(evt);
            }
        });

        btMovePelanggan.setText("Pelanggan");
        btMovePelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMovePelangganActionPerformed(evt);
            }
        });

        btMovePembayaran.setText("Pembayaran");
        btMovePembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMovePembayaranActionPerformed(evt);
            }
        });

        btExitJenis.setText("Exit");
        btExitJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitJenisActionPerformed(evt);
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
                        .addComponent(btMoveTransaksi)
                        .addGap(18, 18, 18)
                        .addComponent(btMovePembayaran)
                        .addGap(18, 18, 18)
                        .addComponent(btExitJenis)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(39, 39, 39)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfNamaJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfIdJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(btSaveJenis)
                                                .addGap(18, 18, 18)
                                                .addComponent(btResetJenis)
                                                .addGap(18, 18, 18)
                                                .addComponent(btDeleteJenis))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addComponent(btMoveBaju)
                                                .addGap(27, 27, 27)
                                                .addComponent(btMovePelanggan))
                                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(tfFindJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btFindJenis)))
                        .addGap(14, 14, 14))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfFindJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btFindJenis)
                    .addComponent(jLabel21))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfIdJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNamaJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btResetJenis)
                            .addComponent(btSaveJenis)
                            .addComponent(btDeleteJenis))
                        .addGap(55, 55, 55)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btMoveBaju)
                            .addComponent(btMovePelanggan))))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btMoveTransaksi)
                    .addComponent(btMovePembayaran)
                    .addComponent(btExitJenis))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Jenis", jPanel4);

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

    private void tabJenisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabJenisMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tabJenis.getModel();
        int row = tabJenis.getSelectedRow();

        tfIdJenis.setText(model.getValueAt(row, 0).toString());
        tfNamaJenis.setText(model.getValueAt(row, 1).toString());
        taKetJenis.setText(model.getValueAt(row, 2).toString());
    }//GEN-LAST:event_tabJenisMouseClicked

    private void btFindJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFindJenisActionPerformed
        // TODO add your handling code here:
        cariJenis(tfFindJenis.getText());
    }//GEN-LAST:event_btFindJenisActionPerformed

    private void tfIdJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdJenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdJenisActionPerformed

    private void btSaveJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveJenisActionPerformed
        // TODO add your handling code here:
        Jenis jns = new Jenis();
        jns.setIdJenis(Integer.parseInt(tfIdJenis.getText()));
        jns.setNamaJenis(tfNamaJenis.getText());
        jns.setKeterangan(taKetJenis.getText());
        jns.save();
        tfIdJenis.setText(Integer.toString(jns.getIdJenis()));
        showJenis();
    }//GEN-LAST:event_btSaveJenisActionPerformed

    private void btResetJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetJenisActionPerformed
        // TODO add your handling code here:
        emptyJenis();
    }//GEN-LAST:event_btResetJenisActionPerformed

    private void btDeleteJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteJenisActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tabJenis.getModel();
        int row = tabJenis.getSelectedRow();

        Jenis jenis = new Jenis().getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
        jenis.delete();
        emptyJenis();
        showJenis();
    }//GEN-LAST:event_btDeleteJenisActionPerformed

    private void btExitJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitJenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btExitJenisActionPerformed

    private void tfNamaJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNamaJenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNamaJenisActionPerformed

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

    private void btMovePembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMovePembayaranActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(FormJenis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormJenis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormJenis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormJenis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormJenis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDeleteJenis;
    private javax.swing.JButton btExitJenis;
    private javax.swing.JButton btFindJenis;
    private javax.swing.JButton btMoveBaju;
    private javax.swing.JButton btMovePelanggan;
    private javax.swing.JButton btMovePembayaran;
    private javax.swing.JButton btMoveTransaksi;
    private javax.swing.JButton btResetJenis;
    private javax.swing.JButton btSaveJenis;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea taKetJenis;
    private javax.swing.JTable tabJenis;
    private javax.swing.JTextField tfFindJenis;
    private javax.swing.JTextField tfIdJenis;
    private javax.swing.JTextField tfNamaJenis;
    // End of variables declaration//GEN-END:variables
}