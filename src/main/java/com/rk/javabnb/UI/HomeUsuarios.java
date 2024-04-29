/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.rk.javabnb.UI;

import com.rk.javabnb.db.Database;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class HomeUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form HomeUsuarios
     */
    public HomeUsuarios() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setSize(1000, 1000);
        //le muestra todos los usuarios de la app y sus datos al Admin
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buscarButton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        filtrosComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        containerPanel = new JPanel(new GridLayout(0, 1));

        for(UsuarioPreview panel : Database.getUsuarioPreviews()) {
            containerPanel.add(panel);
        }

        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("               ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(jLabel1, gridBagConstraints);

        buscarButton.setText("Buscar");
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        jPanel1.add(buscarButton, gridBagConstraints);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Admin", "Volver al menú", "Cerrar sesión" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 20);
        jPanel1.add(jComboBox1, gridBagConstraints);

        filtrosComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "VIP Clientes", "Superanfitriones", "Clientes particulares", "Anfitriones" }));
        /*filtrosComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrosComboBoxActionPerformed(evt);
            }
        });*/
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        jPanel1.add(filtrosComboBox, gridBagConstraints);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/small_logo.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 20);
        jPanel1.add(jLabel2, gridBagConstraints);

        searchTextField.setMinimumSize(new java.awt.Dimension(158, 27));
        searchTextField.setPreferredSize(new java.awt.Dimension(158, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        jPanel1.add(searchTextField, gridBagConstraints);

        jScrollPane1.setViewportView(containerPanel);
        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);
        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*private void filtrosComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrosComboBoxActionPerformed
    }//GEN-LAST:event_filtrosComboBoxActionPerformed*/

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
        ArrayList<UsuarioPreview> resultadoUsuarios = new ArrayList<>(); //muestra los usuarios según filtros
        boolean huboResultados = false;
        switch (this.filtrosComboBox.getSelectedIndex()){
            //buscar por nombre
            case 0:
                for (UsuarioPreview u:Database.getUsuarioPreviews()){
                    if (u.getNombre().contains(this.searchTextField.getText())) {
                        resultadoUsuarios.add(u);
                        huboResultados = true;
                    }
                }
                break;
            //buscar por VIP
            case 1:
                for (UsuarioPreview u:Database.getUsuarioPreviews()){
                    if(u.isVIP()){
                        resultadoUsuarios.add(u);
                        huboResultados = true;
                    }
                }
                break;
            case 2:
                //buscar por superanfitrion
                for (UsuarioPreview u:Database.getUsuarioPreviews()){
                    if(u.isSuper()){
                        resultadoUsuarios.add(u);
                        huboResultados = true;
                    }
                }
                break;
            case 3:
                //solo clientes particulares
                for(UsuarioPreview u:Database.getUsuarioPreviews()){
                    if(u.isParticular()){
                        resultadoUsuarios.add(u);
                        huboResultados = true;
                    }
                }
                break;
            case 4:
                //solo anfitriones
                for(UsuarioPreview u:Database.getUsuarioPreviews()){
                    if(u.isAnfitrion()){
                        resultadoUsuarios.add(u);
                        huboResultados = true;
                    }
                }
                break;
        }
        if(huboResultados) {
            this.containerPanel.removeAll();
            for(UsuarioPreview i : resultadoUsuarios) {
                this.containerPanel.add(i);
            }
            this.jScrollPane1.setViewportView(containerPanel);
        } else {
            JOptionPane.showMessageDialog(this, "No se encontraron resultados para: " + this.searchTextField.getText(), "No se encontraron resultados", JOptionPane.WARNING_MESSAGE);
            this.containerPanel.removeAll();
            for (UsuarioPreview panel : Database.getUsuarioPreviews()) {
                containerPanel.add(panel);
            }
            this.jScrollPane1.setViewportView(containerPanel);
        }
    }//GEN-LAST:event_buscarButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        switch(jComboBox1.getSelectedIndex()) {
            case 1: //vuelve al menú de admin
                new MenuAdmin();
                this.dispose();
                this.setVisible(false);
                break;
            case 2: //cierra la sesión
                Database.cerrarSesion();
                new Login();
                this.dispose();
                this.setVisible(false);
                break;
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(HomeUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarButton;
    private javax.swing.JComboBox<String> filtrosComboBox;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField searchTextField;
    private JPanel containerPanel;
    // End of variables declaration//GEN-END:variables
}