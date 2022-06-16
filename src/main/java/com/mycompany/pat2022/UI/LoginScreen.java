/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pat2022.UI;

/**
 *
 * @author Murrayy
 */
public class LoginScreen extends javax.swing.JFrame {

    /**
     * Creates new form LoginScreen
     */
    public LoginScreen() {
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

        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        PasswordField = new javax.swing.JPasswordField();
        PasswordLabel = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        UsernameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Subject1Label = new javax.swing.JLabel();
        Subject2ComboBox = new javax.swing.JComboBox<>();
        Subject2Label = new javax.swing.JLabel();
        Subject1ComboBox = new javax.swing.JComboBox<>();
        Subject3Label = new javax.swing.JLabel();
        Subject7Label = new javax.swing.JLabel();
        Subject6Label = new javax.swing.JLabel();
        Subject4Label = new javax.swing.JLabel();
        Subject5Label = new javax.swing.JLabel();
        Subject3ComboBox = new javax.swing.JComboBox<>();
        Subject5ComboBox = new javax.swing.JComboBox<>();
        Subject4ComboBox = new javax.swing.JComboBox<>();
        Subject6ComboBox = new javax.swing.JComboBox<>();
        Subject7ComboBox = new javax.swing.JComboBox<>();
        LogInButton = new javax.swing.JButton();

        jComboBox4.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox7.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));

        PasswordField.setText("jPasswordField1");

        PasswordLabel.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        PasswordLabel.setText("ENTER PASSWORD:");

        UsernameLabel.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        UsernameLabel.setText("ENTER USERNAME: ");

        jLabel3.setFont(new java.awt.Font("Rockwell Extra Bold", 2, 36)); // NOI18N
        jLabel3.setText("SQUIRE SCHOLAR");

        Subject1Label.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        Subject1Label.setText("SUBJECT 1: ");

        Subject2ComboBox.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        Subject2ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Subject2Label.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        Subject2Label.setText("SUBJECT 2: ");

        Subject1ComboBox.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        Subject1ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Subject3Label.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        Subject3Label.setText("SUBJECT 3: ");

        Subject7Label.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        Subject7Label.setText("SUBJECT 7: ");

        Subject6Label.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        Subject6Label.setText("SUBJECT 6: ");

        Subject4Label.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        Subject4Label.setText("SUBJECT 4: ");

        Subject5Label.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        Subject5Label.setText("SUBJECT 5: ");

        Subject3ComboBox.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        Subject3ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Subject5ComboBox.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        Subject5ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Subject4ComboBox.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        Subject4ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Subject4ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Subject4ComboBoxActionPerformed(evt);
            }
        });

        Subject6ComboBox.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        Subject6ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Subject6ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Subject6ComboBoxActionPerformed(evt);
            }
        });

        Subject7ComboBox.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        Subject7ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Subject7ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Subject7ComboBoxActionPerformed(evt);
            }
        });

        LogInButton.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        LogInButton.setText("LOG IN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(UsernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(PasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Subject1Label)
                                    .addComponent(Subject2Label)
                                    .addComponent(Subject3Label, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Subject4Label, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Subject2ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Subject1ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Subject3ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Subject4ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Subject6Label)
                                        .addGap(18, 18, 18)
                                        .addComponent(Subject6ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Subject5Label)
                                        .addGap(18, 18, 18)
                                        .addComponent(Subject5ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Subject7Label)
                                        .addGap(18, 18, 18)
                                        .addComponent(Subject7ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(PasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                    .addComponent(UsernameField)))))
                    .addComponent(LogInButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(162, 162, 162))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Subject1Label)
                    .addComponent(Subject1ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Subject5Label)
                    .addComponent(Subject5ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Subject2ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Subject2Label)
                    .addComponent(Subject6Label)
                    .addComponent(Subject6ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Subject3ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Subject3Label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Subject4Label)
                            .addComponent(Subject4ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Subject7Label, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Subject7ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(LogInButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Subject4ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Subject4ComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Subject4ComboBoxActionPerformed

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox7ActionPerformed

    private void Subject6ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Subject6ComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Subject6ComboBoxActionPerformed

    private void Subject7ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Subject7ComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Subject7ComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogInButton;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JComboBox<String> Subject1ComboBox;
    private javax.swing.JLabel Subject1Label;
    private javax.swing.JComboBox<String> Subject2ComboBox;
    private javax.swing.JLabel Subject2Label;
    private javax.swing.JComboBox<String> Subject3ComboBox;
    private javax.swing.JLabel Subject3Label;
    private javax.swing.JComboBox<String> Subject4ComboBox;
    private javax.swing.JLabel Subject4Label;
    private javax.swing.JComboBox<String> Subject5ComboBox;
    private javax.swing.JLabel Subject5Label;
    private javax.swing.JComboBox<String> Subject6ComboBox;
    private javax.swing.JLabel Subject6Label;
    private javax.swing.JComboBox<String> Subject7ComboBox;
    private javax.swing.JLabel Subject7Label;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
