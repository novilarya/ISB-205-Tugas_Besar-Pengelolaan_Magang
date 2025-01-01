/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.itenas.oop.project.view;

/**
 *
 * @author aryan
 */
public class MainPenyelenggaraForm extends javax.swing.JFrame {

    /**
     * Creates new form MainPenyelenggaraForm
     */
    public MainPenyelenggaraForm() {
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
        textSelamatDatang = new javax.swing.JLabel();
        textPenyelenggaraMagang = new javax.swing.JLabel();
        panelKelolaMagang = new javax.swing.JPanel();
        textPenyelenggaraMagang2 = new javax.swing.JLabel();
        textPenyelenggaraMagang1 = new javax.swing.JLabel();
        panelLihatDaftarMagang = new javax.swing.JPanel();
        textPenyelenggaraMagang3 = new javax.swing.JLabel();
        textPenyelenggaraMagang4 = new javax.swing.JLabel();
        panelSeleksiPendaftarMagang = new javax.swing.JPanel();
        textPenyelenggaraMagang5 = new javax.swing.JLabel();
        textPenyelenggaraMagang6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(246, 244, 240));
        jPanel1.setForeground(new java.awt.Color(246, 244, 240));

        textSelamatDatang.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        textSelamatDatang.setForeground(new java.awt.Color(51, 51, 51));
        textSelamatDatang.setText("Selamat Datang");

        textPenyelenggaraMagang.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        textPenyelenggaraMagang.setForeground(new java.awt.Color(51, 51, 51));
        textPenyelenggaraMagang.setText("Penyelenggara Magang!");

        panelKelolaMagang.setBackground(new java.awt.Color(46, 80, 119));
        panelKelolaMagang.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        panelKelolaMagang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelKelolaMagangMouseClicked(evt);
            }
        });

        textPenyelenggaraMagang2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        textPenyelenggaraMagang2.setForeground(new java.awt.Color(255, 255, 255));
        textPenyelenggaraMagang2.setText("Kelola");

        textPenyelenggaraMagang1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        textPenyelenggaraMagang1.setForeground(new java.awt.Color(255, 255, 255));
        textPenyelenggaraMagang1.setText("Magang");

        javax.swing.GroupLayout panelKelolaMagangLayout = new javax.swing.GroupLayout(panelKelolaMagang);
        panelKelolaMagang.setLayout(panelKelolaMagangLayout);
        panelKelolaMagangLayout.setHorizontalGroup(
            panelKelolaMagangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKelolaMagangLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(panelKelolaMagangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textPenyelenggaraMagang1)
                    .addGroup(panelKelolaMagangLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(textPenyelenggaraMagang2)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        panelKelolaMagangLayout.setVerticalGroup(
            panelKelolaMagangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKelolaMagangLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(textPenyelenggaraMagang2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textPenyelenggaraMagang1)
                .addContainerGap(276, Short.MAX_VALUE))
        );

        panelLihatDaftarMagang.setBackground(new java.awt.Color(46, 80, 119));
        panelLihatDaftarMagang.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        textPenyelenggaraMagang3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        textPenyelenggaraMagang3.setForeground(new java.awt.Color(255, 255, 255));
        textPenyelenggaraMagang3.setText("Lihat");

        textPenyelenggaraMagang4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        textPenyelenggaraMagang4.setForeground(new java.awt.Color(255, 255, 255));
        textPenyelenggaraMagang4.setText("Daftar Magang");

        javax.swing.GroupLayout panelLihatDaftarMagangLayout = new javax.swing.GroupLayout(panelLihatDaftarMagang);
        panelLihatDaftarMagang.setLayout(panelLihatDaftarMagangLayout);
        panelLihatDaftarMagangLayout.setHorizontalGroup(
            panelLihatDaftarMagangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLihatDaftarMagangLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(panelLihatDaftarMagangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLihatDaftarMagangLayout.createSequentialGroup()
                        .addComponent(textPenyelenggaraMagang4)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLihatDaftarMagangLayout.createSequentialGroup()
                        .addComponent(textPenyelenggaraMagang3)
                        .addGap(95, 95, 95))))
        );
        panelLihatDaftarMagangLayout.setVerticalGroup(
            panelLihatDaftarMagangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLihatDaftarMagangLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(textPenyelenggaraMagang3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textPenyelenggaraMagang4)
                .addContainerGap(276, Short.MAX_VALUE))
        );

        panelSeleksiPendaftarMagang.setBackground(new java.awt.Color(46, 80, 119));
        panelSeleksiPendaftarMagang.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        textPenyelenggaraMagang5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        textPenyelenggaraMagang5.setForeground(new java.awt.Color(255, 255, 255));
        textPenyelenggaraMagang5.setText("Seleksi");

        textPenyelenggaraMagang6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        textPenyelenggaraMagang6.setForeground(new java.awt.Color(255, 255, 255));
        textPenyelenggaraMagang6.setText("Pendaftar Magang");

        javax.swing.GroupLayout panelSeleksiPendaftarMagangLayout = new javax.swing.GroupLayout(panelSeleksiPendaftarMagang);
        panelSeleksiPendaftarMagang.setLayout(panelSeleksiPendaftarMagangLayout);
        panelSeleksiPendaftarMagangLayout.setHorizontalGroup(
            panelSeleksiPendaftarMagangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSeleksiPendaftarMagangLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(panelSeleksiPendaftarMagangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSeleksiPendaftarMagangLayout.createSequentialGroup()
                        .addComponent(textPenyelenggaraMagang5)
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSeleksiPendaftarMagangLayout.createSequentialGroup()
                        .addComponent(textPenyelenggaraMagang6)
                        .addGap(21, 21, 21))))
        );
        panelSeleksiPendaftarMagangLayout.setVerticalGroup(
            panelSeleksiPendaftarMagangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSeleksiPendaftarMagangLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(textPenyelenggaraMagang5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textPenyelenggaraMagang6)
                .addContainerGap(276, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(121, 215, 190));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 84, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textSelamatDatang)
                    .addComponent(textPenyelenggaraMagang)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelKelolaMagang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(panelLihatDaftarMagang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(panelSeleksiPendaftarMagang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 41, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textSelamatDatang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textPenyelenggaraMagang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelKelolaMagang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelLihatDaftarMagang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelSeleksiPendaftarMagang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
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

    private void panelKelolaMagangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelKelolaMagangMouseClicked
        new MainPenyelenggaraForm().setVisible(false);
        new MengelolaMagangForm().setVisible(true);
        dispose();  
    }//GEN-LAST:event_panelKelolaMagangMouseClicked

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPenyelenggaraForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel panelKelolaMagang;
    private javax.swing.JPanel panelLihatDaftarMagang;
    private javax.swing.JPanel panelSeleksiPendaftarMagang;
    private javax.swing.JLabel textPenyelenggaraMagang;
    private javax.swing.JLabel textPenyelenggaraMagang1;
    private javax.swing.JLabel textPenyelenggaraMagang2;
    private javax.swing.JLabel textPenyelenggaraMagang3;
    private javax.swing.JLabel textPenyelenggaraMagang4;
    private javax.swing.JLabel textPenyelenggaraMagang5;
    private javax.swing.JLabel textPenyelenggaraMagang6;
    private javax.swing.JLabel textSelamatDatang;
    // End of variables declaration//GEN-END:variables
}
