/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.itenas.oop.project.view;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import org.itenas.oop.project.component.DataDiriPenyelenggara;
import org.itenas.oop.project.event.EventMenuSelected;
import org.itenas.oop.project.component.KelolaMagangForm;
import org.itenas.oop.project.component.MelihatDaftarMagang;
import org.itenas.oop.project.component.SeleksiPendaftarForm;
import org.itenas.oop.project.connection.ConnectionManager;

/**
 *
 * @author aryan
 */
public class MainPenyelenggaraForm extends javax.swing.JFrame {
    private ConnectionManager conMan;
    private Connection conn;
    
    public MainPenyelenggaraForm() {
        initComponents();
        menuPenyelenggara1.initMoving(MainPenyelenggaraForm.this);
        menuPenyelenggara1.addEventMenuSelected(new EventMenuSelected(){
            @Override
            public void selected (int index){
                if (index == 0){
                    setForm(new KelolaMagangForm());
                }else if(index == 1){
                    setForm(new MelihatDaftarMagang());
                }else if(index == 2){
                    setForm(new SeleksiPendaftarForm());
                }else if(index == 3){
                    int konfirmasi = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin logout?", "Konfirmasi Logout", JOptionPane.YES_NO_OPTION);
                    if (konfirmasi == JOptionPane.YES_NO_OPTION) {  
                        try {
                            conMan = new ConnectionManager();
                            conn = conMan.connectDb();
                            Statement stm = conn.createStatement();
                            stm.executeUpdate("TRUNCATE TABLE temp_daftar_akun;");                            
                        } catch (SQLException ex) {
                            System.out.println("error: " + ex.getMessage());                            
                        }
                        dispose();
                        new LoginUtama().setVisible(true);
                        
                    }
                }
            }   
        });
        
        headerMenu1.initMoving(MainPenyelenggaraForm.this);
        headerMenu1.addEventMenuSelected(new EventMenuSelected(){
            @Override
            public void selected (int index){
                if (index == 0){
                    setForm(new DataDiriPenyelenggara());
                }
            }   
        });
    }
    
    private void setForm(JComponent com){
        MainPanel.removeAll();
        MainPanel.add(com);
        MainPanel.repaint();
        MainPanel.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new org.itenas.oop.project.panel.PanelBorder();
        MainPanel = new javax.swing.JPanel();
        menuPenyelenggara1 = new org.itenas.oop.project.component.MenuPenyelenggara();
        headerMenu1 = new org.itenas.oop.project.component.HeaderMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelBorder1.setBackground(new java.awt.Color(231, 227, 217));

        MainPanel.setBackground(new java.awt.Color(246, 244, 240));
        MainPanel.setOpaque(false);
        MainPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(menuPenyelenggara1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(headerMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBorder1Layout.createSequentialGroup()
                        .addComponent(headerMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(menuPenyelenggara1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainPenyelenggaraForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPenyelenggaraForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPenyelenggaraForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPenyelenggaraForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPenyelenggaraForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private org.itenas.oop.project.component.HeaderMenu headerMenu1;
    private org.itenas.oop.project.component.MenuPenyelenggara menuPenyelenggara1;
    private org.itenas.oop.project.panel.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}
