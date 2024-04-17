/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.rk.javabnb.UI;

import com.rk.javabnb.Usuarios.Anfitrion;
import com.rk.javabnb.Usuarios.Cliente;
import com.rk.javabnb.Usuarios.ClienteParticular;
import com.rk.javabnb.db.DataChecker;
import com.rk.javabnb.db.Database;

import javax.swing.*;
import java.util.ArrayList;

/**
 *
 * @author Roberto
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
        this.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        leftPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        formPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        dni = new javax.swing.JTextField();
        tfn = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        terms = new javax.swing.JCheckBox();
        registerBtn = new javax.swing.JButton();
        goLogin = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro");
        setMinimumSize(new java.awt.Dimension(1080, 600));
        setPreferredSize(new java.awt.Dimension(1080, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        leftPanel.setBackground(new java.awt.Color(242, 0, 242));
        leftPanel.setLayout(new java.awt.BorderLayout());

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));
        headerPanel.setLayout(new java.awt.GridBagLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/small_logo.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(-40, 0, -10, 0);
        headerPanel.add(jLabel2, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Montserrat", 2, 24)); // NOI18N
        jLabel1.setText("Registro");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        headerPanel.add(jLabel1, gridBagConstraints);

        leftPanel.add(headerPanel, java.awt.BorderLayout.PAGE_START);

        formPanel.setBackground(java.awt.Color.white);
        formPanel.setLayout(new java.awt.GridBagLayout());

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel4.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        formPanel.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel5.setText("Email:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        formPanel.add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel6.setText("Contraseña:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 5;
        formPanel.add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel7.setText("DNI:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        formPanel.add(jLabel7, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel8.setText("Teléfono:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        formPanel.add(jLabel8, gridBagConstraints);

        name.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        formPanel.add(name, gridBagConstraints);

        email.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        formPanel.add(email, gridBagConstraints);

        dni.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        formPanel.add(dni, gridBagConstraints);

        tfn.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        formPanel.add(tfn, gridBagConstraints);

        password.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        formPanel.add(password, gridBagConstraints);

        terms.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        terms.setText("He leído y acepto los Términos del Servicio");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        formPanel.add(terms, gridBagConstraints);

        registerBtn.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        registerBtn.setText("Registrar");
        registerBtn.setToolTipText("");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        formPanel.add(registerBtn, gridBagConstraints);

        goLogin.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        goLogin.setText("¿Ya tienes cuenta? ¡Inicia sesión!");
        goLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                goLoginMousePressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.ipady = 14;
        formPanel.add(goLogin, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel9.setText("Tipo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        formPanel.add(jLabel9, gridBagConstraints);

        jComboBox1.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente Particular", "Anfitrion" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        formPanel.add(jComboBox1, gridBagConstraints);

        leftPanel.add(formPanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(leftPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {
        //Cuando se cierra la ventana de login
        new Login();
    }

    private void goLoginMousePressed(java.awt.event.MouseEvent evt) {
        new Login();   
        this.dispose();
           
    }

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {
        if(terms.isSelected()) {
            if(Database.getAllEmail().contains(email.getText())) {
                //El email ya está registrado
                JOptionPane.showMessageDialog(this, "Ya existe una cuenta con ese correo", "Error de Registro", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if(jComboBox1.getSelectedIndex() == 0) {
                //Es cliente particular
                try {
                    boolean DNICorrecto = DataChecker.checkDNI(dni.getText());
                    boolean tfnCorrecto = DataChecker.checkTfn(Integer.parseInt(tfn.getText()));
                    boolean passCorrecta = DataChecker.checkPass(password.getPassword());

                    if(DNICorrecto && tfnCorrecto && passCorrecta) {
                        //TODO Diferenciar si es cliente particular o anfitrion
                        new ClienteParticular(String.valueOf(password.getPassword()), dni.getText(), email.getText(), name.getText(), Integer.parseInt(tfn.getText()));
                        JOptionPane.showMessageDialog(this, "Registro exitoso del cliente", "Registro exitoso", JOptionPane.WARNING_MESSAGE);
                        new Login();
                        this.dispose();
                    }else {
                        JOptionPane.showMessageDialog(this, "Comprueba los datos introducidos TF", "Error de Registro", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                } catch(Exception e) {
                    JOptionPane.showMessageDialog(this, "Comprueba los datos introducidos", "Error de Registro", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }else {
                try {
                    boolean DNICorrecto = DataChecker.checkDNI(dni.getText());
                    boolean tfnCorrecto = DataChecker.checkTfn(Integer.parseInt(tfn.getText()));
                    boolean passCorrecta = DataChecker.checkPass(password.getPassword());

                    if(DNICorrecto && tfnCorrecto && passCorrecta) {
                        //TODO Diferenciar si es cliente particular o anfitrion
                        new Anfitrion(String.valueOf(password.getPassword()), dni.getText(), email.getText(), name.getText(), Integer.parseInt(tfn.getText()));
                        JOptionPane.showMessageDialog(this, "Registro exitoso del anfitrión", "Registro exitoso", JOptionPane.WARNING_MESSAGE);
                        new Login();
                        this.dispose();
                    }else {
                        JOptionPane.showMessageDialog(this, "Comprueba los datos introducidos", "Error de Registro", JOptionPane.WARNING_MESSAGE);
                    }
                } catch(Exception e) {
                    JOptionPane.showMessageDialog(this, "Comprueba los datos introducidos", "Error de Registro", JOptionPane.WARNING_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debes aceptar los términos y condiciones", "Error de registro", JOptionPane.WARNING_MESSAGE);
        }
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dni;
    private javax.swing.JTextField email;
    private javax.swing.JPanel formPanel;
    private javax.swing.JLabel goLogin;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton registerBtn;
    private javax.swing.JCheckBox terms;
    private javax.swing.JTextField tfn;
    // End of variables declaration//GEN-END:variables
}
