/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.itenas.oop.project.view;

import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author aryan
 */
public class MenyeleksiPendaftarMagangForm extends javax.swing.JFrame {

    /**
     * Creates new form MenyeleksiPendaftarMagangForm
     */
    public MenyeleksiPendaftarMagangForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        textSeleksiPendaftarMagang = new javax.swing.JLabel();
        txtSearchJudulMagang = new javax.swing.JTextField();
        textUsername6 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelMagang = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelMagang1 = new javax.swing.JTable();
        txtSearchJudulMagang1 = new javax.swing.JTextField();
        textUsername7 = new javax.swing.JLabel();
        btnSearch1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(246, 244, 240));

        jPanel5.setBackground(new java.awt.Color(121, 215, 190));

        textSeleksiPendaftarMagang.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        textSeleksiPendaftarMagang.setForeground(new java.awt.Color(51, 51, 51));
        textSeleksiPendaftarMagang.setText("Seleksi Pendaftar Magang");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(textSeleksiPendaftarMagang)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(textSeleksiPendaftarMagang)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        txtSearchJudulMagang.setBackground(new java.awt.Color(239, 239, 239));
        txtSearchJudulMagang.setForeground(new java.awt.Color(51, 51, 51));
        txtSearchJudulMagang.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(191, 191, 191), 1, true));
        txtSearchJudulMagang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchJudulMagangActionPerformed(evt);
            }
        });

        textUsername6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textUsername6.setForeground(new java.awt.Color(51, 51, 51));
        textUsername6.setText("Pencarian magang berdasarkan judul");

        btnSearch.setBackground(new java.awt.Color(153, 153, 255));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(51, 51, 51));
        btnSearch.setText("Search");
        btnSearch.setBorder(null);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tabelMagang.setBackground(new java.awt.Color(239, 239, 239));
        tabelMagang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Judul", "Penyelenggara", "Lokasi", "Tipe", "Posisi", "Deskripsi", "Kualifikasi"
            }
        ));
        tabelMagang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMagangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelMagang);

        tabelMagang1.setBackground(new java.awt.Color(239, 239, 239));
        tabelMagang1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Nama"
            }
        ));
        tabelMagang1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMagang1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelMagang1);

        txtSearchJudulMagang1.setBackground(new java.awt.Color(239, 239, 239));
        txtSearchJudulMagang1.setForeground(new java.awt.Color(51, 51, 51));
        txtSearchJudulMagang1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(191, 191, 191), 1, true));
        txtSearchJudulMagang1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchJudulMagang1ActionPerformed(evt);
            }
        });

        textUsername7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textUsername7.setForeground(new java.awt.Color(51, 51, 51));
        textUsername7.setText("Pencarian magang berdasarkan nama");

        btnSearch1.setBackground(new java.awt.Color(153, 153, 255));
        btnSearch1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSearch1.setForeground(new java.awt.Color(51, 51, 51));
        btnSearch1.setText("Search");
        btnSearch1.setBorder(null);
        btnSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSearchJudulMagang, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textUsername6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textUsername7)
                            .addComponent(txtSearchJudulMagang1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 232, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textUsername6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSearchJudulMagang, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textUsername7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSearch1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSearchJudulMagang1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchJudulMagangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchJudulMagangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchJudulMagangActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        try {
            String judulMagang = txtSearchJudulMagang.getText();
//            tampilkanDataMagang(judulMagang);

        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Anda Salah Memasukkan Judul!");
        }

//        try {
//            String judulMagang = txtSearchJudulMagang.getText();
//            tampilkanDataMagang(judulMagang);
//
//        }catch(NumberFormatException ex){
//            JOptionPane.showMessageDialog(null, "Anda Salah Memasukkan Judul!");
//        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void tabelMagangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMagangMouseClicked
        int i = tabelMagang.getSelectedRow();

        TableModel model = tabelMagang.getModel();

//        TableModel model = tabelMagang.getModel();
//

//        txtJudulPenyelenggara.setText(model.getValueAt(i, 0).toString());
//        txtLokasiPenyelenggara.setText(model.getValueAt(i, 2).toString());
//        txtTipeMagang.setSelectedItem(model.getValueAt(i, 3).toString());
//        txtPosisiPenyelenggara.setText(model.getValueAt(i, 4).toString());
//        txtDeskripsiPenyelenggara.setText(model.getValueAt(i, 5).toString());
//        txtKualifikasiPenyelenggara.setText(model.getValueAt(i, 6).toString());
    }//GEN-LAST:event_tabelMagangMouseClicked

    private void tabelMagang1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMagang1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelMagang1MouseClicked

    private void txtSearchJudulMagang1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchJudulMagang1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchJudulMagang1ActionPerformed

    private void btnSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearch1ActionPerformed

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
            java.util.logging.Logger.getLogger(MenyeleksiPendaftarMagangForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenyeleksiPendaftarMagangForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenyeleksiPendaftarMagangForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenyeleksiPendaftarMagangForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenyeleksiPendaftarMagangForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearch1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelMagang;
    private javax.swing.JTable tabelMagang1;
    private javax.swing.JLabel textSeleksiPendaftarMagang;
    private javax.swing.JLabel textUsername6;
    private javax.swing.JLabel textUsername7;
    private javax.swing.JTextField txtSearchJudulMagang;
    private javax.swing.JTextField txtSearchJudulMagang1;
    // End of variables declaration//GEN-END:variables
}
