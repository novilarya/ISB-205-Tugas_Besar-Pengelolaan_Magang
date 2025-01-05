/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.itenas.oop.project.view;

import javax.swing.JOptionPane;
import org.itenas.oop.project.repository.ControllerLogin;

/**
 *
 * @author aryan
 */
public class RegisterUtama extends javax.swing.JFrame {
    Boolean hasil;
    ControllerLogin conLog = new ControllerLogin();
    
    public RegisterUtama() {
        initComponents();
        setLocationRelativeTo(null);
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
    public void keyPressed(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            RegistAction();
        }
    }
});

        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
    public void keyPressed(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            txtPassword.requestFocus(); 
        }
    }
});
        txtNama.addKeyListener(new java.awt.event.KeyAdapter() {
    public void keyPressed(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            txtUsername.requestFocus(); 
        }
    }
});
    }

    public void RegistAction(){
        conLog.registerUtama((String)txtTipeAkun.getSelectedItem(), txtNama.getText(), txtUsername.getText(), String.valueOf(txtPassword.getPassword()));
        JOptionPane.showMessageDialog(null, "Regist berhasil", "Pesan", JOptionPane.INFORMATION_MESSAGE);
        new LoginUtama().setVisible(true);
        new RegisterUtama().setVisible(false);
    }
    
    public void showPassword(){
        if (cbShowPassword.isSelected()){
            txtPassword.setEchoChar((char)0);
            cbShowPassword.setText("Hide Password");
        }else{
            txtPassword.setEchoChar('*');
            cbShowPassword.setText("Show Password");
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        textSelamatDatang = new javax.swing.JLabel();
        textUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        textPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        cbShowPassword = new javax.swing.JCheckBox();
        btnRegister = new javax.swing.JButton();
        textLoginPenyelenggara = new javax.swing.JLabel();
        textSudahPunyaAkun = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        textNama = new javax.swing.JLabel();
        textInstansiPenyelenggara = new javax.swing.JLabel();
        txtTipeAkun = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(121, 215, 190));

        jPanel2.setBackground(new java.awt.Color(246, 244, 240));

        textSelamatDatang.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        textSelamatDatang.setForeground(new java.awt.Color(51, 51, 51));
        textSelamatDatang.setText("Selamat Datang!");

        textUsername.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textUsername.setForeground(new java.awt.Color(51, 51, 51));
        textUsername.setText("Username");

        txtUsername.setBackground(new java.awt.Color(239, 239, 239));
        txtUsername.setForeground(new java.awt.Color(51, 51, 51));
        txtUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(191, 191, 191), 1, true));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        textPassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textPassword.setForeground(new java.awt.Color(51, 51, 51));
        textPassword.setText("Password");

        txtPassword.setBackground(new java.awt.Color(239, 239, 239));
        txtPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(191, 191, 191), 1, true));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        cbShowPassword.setForeground(new java.awt.Color(51, 51, 51));
        cbShowPassword.setText("Show Password");
        cbShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbShowPasswordActionPerformed(evt);
            }
        });

        btnRegister.setBackground(new java.awt.Color(46, 80, 119));
        btnRegister.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Register");
        btnRegister.setBorder(null);
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        textLoginPenyelenggara.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textLoginPenyelenggara.setForeground(new java.awt.Color(51, 51, 51));
        textLoginPenyelenggara.setText("Login");
        textLoginPenyelenggara.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textLoginPenyelenggaraMouseClicked(evt);
            }
        });

        textSudahPunyaAkun.setForeground(new java.awt.Color(51, 51, 51));
        textSudahPunyaAkun.setText("Sudah punya akun?");

        txtNama.setBackground(new java.awt.Color(239, 239, 239));
        txtNama.setForeground(new java.awt.Color(51, 51, 51));
        txtNama.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(191, 191, 191), 1, true));
        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        textNama.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textNama.setForeground(new java.awt.Color(51, 51, 51));
        textNama.setText("Nama");

        textInstansiPenyelenggara.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textInstansiPenyelenggara.setForeground(new java.awt.Color(51, 51, 51));
        textInstansiPenyelenggara.setText("Peran");

        txtTipeAkun.setBackground(new java.awt.Color(239, 239, 239));
        txtTipeAkun.setForeground(new java.awt.Color(51, 51, 51));
        txtTipeAkun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Penyelenggara", "Pendaftar" }));
        txtTipeAkun.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(191, 191, 191), 1, true));
        txtTipeAkun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipeAkunActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtUsername)
                                .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(textSudahPunyaAkun)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textLoginPenyelenggara))
                            .addComponent(cbShowPassword)
                            .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textInstansiPenyelenggara, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTipeAkun, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(textSelamatDatang)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(textSelamatDatang)
                .addGap(34, 34, 34)
                .addComponent(textInstansiPenyelenggara)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTipeAkun, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(textNama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbShowPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textLoginPenyelenggara)
                    .addComponent(textSudahPunyaAkun))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(421, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void cbShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbShowPasswordActionPerformed
        showPassword();
    }//GEN-LAST:event_cbShowPasswordActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        RegistAction();
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void textLoginPenyelenggaraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textLoginPenyelenggaraMouseClicked
        new LoginUtama().setVisible(true);
        new RegisterUtama().setVisible(false);
        dispose();
    }//GEN-LAST:event_textLoginPenyelenggaraMouseClicked

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void txtTipeAkunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipeAkunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipeAkunActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JCheckBox cbShowPassword;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel textInstansiPenyelenggara;
    private javax.swing.JLabel textLoginPenyelenggara;
    private javax.swing.JLabel textNama;
    private javax.swing.JLabel textPassword;
    private javax.swing.JLabel textSelamatDatang;
    private javax.swing.JLabel textSudahPunyaAkun;
    private javax.swing.JLabel textUsername;
    private javax.swing.JTextField txtNama;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JComboBox<String> txtTipeAkun;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
