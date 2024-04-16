package com.rk.javabnb.UI;

import javax.swing.*;

/**
 *
 * @author Roberto
 */
public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        backgroundPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        logoImg = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        formPanel = new javax.swing.JPanel();
        leftFormPanel = new javax.swing.JPanel();
        nameInput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        emailInput = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        passInput = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        dniInput = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        tfn = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrarse");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);
        setMinimumSize(new java.awt.Dimension(800, 800));
        setPreferredSize(new java.awt.Dimension(800, 800));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        backgroundPanel.setMinimumSize(new java.awt.Dimension(800, 800));
        backgroundPanel.setLayout(new java.awt.BorderLayout());

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));
        headerPanel.setMinimumSize(new java.awt.Dimension(100, 100));
        headerPanel.setPreferredSize(new java.awt.Dimension(800, 125));
        headerPanel.setLayout(new java.awt.GridBagLayout());

        logoImg.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\com\\rk\\javabnb\\resources\\small_logo.png"));
        logoImg.setPreferredSize(new java.awt.Dimension(200, 75));
        headerPanel.add(logoImg, new java.awt.GridBagConstraints());

        jLabel2.setFont(new java.awt.Font("Mars", 1, 24)); // NOI18N
        jLabel2.setText("Registro");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        headerPanel.add(jLabel2, gridBagConstraints);

        backgroundPanel.add(headerPanel, java.awt.BorderLayout.PAGE_START);

        formPanel.setBackground(new java.awt.Color(255, 255, 255));
        formPanel.setLayout(new java.awt.GridBagLayout());

        leftFormPanel.setBackground(new java.awt.Color(255, 255, 255));
        leftFormPanel.setPreferredSize(new java.awt.Dimension(300, 600));
        leftFormPanel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.ipadx = 166;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 28, 0, 42);
        leftFormPanel.add(nameInput, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Montserrat", 2, 18)); // NOI18N
        jLabel3.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 28, 0, 0);
        leftFormPanel.add(jLabel3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.ipadx = 166;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 28, 0, 42);
        leftFormPanel.add(emailInput, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Montserrat", 2, 18)); // NOI18N
        jLabel5.setText("Email:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 28, 0, 0);
        leftFormPanel.add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Montserrat", 2, 18)); // NOI18N
        jLabel6.setText("Contraseña:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 28, 0, 0);
        leftFormPanel.add(jLabel6, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.ipadx = 166;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 28, 0, 42);
        leftFormPanel.add(passInput, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Montserrat", 2, 18)); // NOI18N
        jLabel7.setText("DNI:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 28, 0, 0);
        leftFormPanel.add(jLabel7, gridBagConstraints);

        try {
            dniInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.ipadx = 166;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 28, 0, 42);
        leftFormPanel.add(dniInput, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Montserrat", 2, 18)); // NOI18N
        jLabel8.setText("Teléfono:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 28, 0, 0);
        leftFormPanel.add(jLabel8, gridBagConstraints);

        try {
            tfn.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.ipadx = 166;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 28, 0, 42);
        leftFormPanel.add(tfn, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Montserrat", 2, 18)); // NOI18N
        jLabel9.setText("Tipo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 28, 0, 0);
        leftFormPanel.add(jLabel9, gridBagConstraints);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente Particular", "Anfitrión" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.ipadx = 106;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 28, 0, 42);
        leftFormPanel.add(jComboBox1, gridBagConstraints);

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jCheckBox1.setText("He leído y acepto los Términos y Condiciones");
        jCheckBox1.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 28, 0, 42);
        leftFormPanel.add(jCheckBox1, gridBagConstraints);

        jButton1.setFont(new java.awt.Font("Montserrat", 3, 18)); // NOI18N
        jButton1.setText("Registrarse");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(25, 10, 0, 10);
        leftFormPanel.add(jButton1, gridBagConstraints);

        formPanel.add(leftFormPanel, new java.awt.GridBagConstraints());

        backgroundPanel.add(formPanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(backgroundPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        new Login().setVisible(true);
    }//GEN-LAST:event_formWindowClosed


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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JFormattedTextField dniInput;
    private javax.swing.JFormattedTextField tfn;
    private javax.swing.JTextField emailInput;
    private javax.swing.JPanel formPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel leftFormPanel;
    private javax.swing.JLabel logoImg;
    private javax.swing.JTextField nameInput;
    private javax.swing.JPasswordField passInput;
    // End of variables declaration//GEN-END:variables
}
