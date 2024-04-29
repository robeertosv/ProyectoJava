/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.rk.javabnb.UI;

import com.rk.javabnb.Usuarios.Anfitrion;
import com.rk.javabnb.db.DataChecker;
import com.rk.javabnb.db.Database;

import javax.swing.*;

/**
 *
 * @author admin
 */
public class PerfilAnfitrion extends javax.swing.JFrame {

    /**
     * Creates new form PerfilAnfitrion
     */
    public PerfilAnfitrion() {
        setVisible(true);
        this.anfitrion = Database.getCurrentAnfitrion();
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(1000, 1000);
        //aqui anfitrion puede ver y modificar sus datos
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombreTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        telefonoTextField = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        dniTextField = new javax.swing.JTextField();
        superAnfitrionLabel = new javax.swing.JLabel();
        valoracionMediaTextField = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cambiarContrasenaButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        fechaLabel = new javax.swing.JLabel();

        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formClosing();
            }
        });
        this.getContentPane().setLayout(new java.awt.GridBagLayout());
        this.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/small_logo.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        getContentPane().add(jLabel1, gridBagConstraints);

        jLabel2.setText("Nombre:");
        jLabel2.setMaximumSize(new java.awt.Dimension(148, 17));
        jLabel2.setMinimumSize(new java.awt.Dimension(148, 17));
        jLabel2.setPreferredSize(new java.awt.Dimension(148, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(jLabel2, gridBagConstraints);

        jLabel3.setText("Email:");
        jLabel3.setMaximumSize(new java.awt.Dimension(148, 17));
        jLabel3.setMinimumSize(new java.awt.Dimension(148, 17));
        jLabel3.setPreferredSize(new java.awt.Dimension(148, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(jLabel3, gridBagConstraints);

        nombreTextField.setText(anfitrion.getNombre());
        nombreTextField.setMinimumSize(new java.awt.Dimension(300, 27));
        nombreTextField.setPreferredSize(new java.awt.Dimension(300, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        getContentPane().add(nombreTextField, gridBagConstraints);

        emailTextField.setText(anfitrion.getEmail());
        emailTextField.setMinimumSize(new java.awt.Dimension(300, 27));
        emailTextField.setPreferredSize(new java.awt.Dimension(300, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        getContentPane().add(emailTextField, gridBagConstraints);

        jLabel4.setText("Teléfono:");
        jLabel4.setMaximumSize(new java.awt.Dimension(148, 17));
        jLabel4.setMinimumSize(new java.awt.Dimension(148, 17));
        jLabel4.setPreferredSize(new java.awt.Dimension(148, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        getContentPane().add(jLabel4, gridBagConstraints);

        telefonoTextField.setText(anfitrion.getTelefono());
        telefonoTextField.setMinimumSize(new java.awt.Dimension(300, 27));
        telefonoTextField.setPreferredSize(new java.awt.Dimension(300, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        getContentPane().add(telefonoTextField, gridBagConstraints);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {anfitrion.getNombre(), "Guardar cambios y volver", "Volver sin guardar" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        getContentPane().add(jComboBox1, gridBagConstraints);

        jLabel5.setText("DNI:");
        jLabel5.setMaximumSize(new java.awt.Dimension(148, 17));
        jLabel5.setMinimumSize(new java.awt.Dimension(148, 17));
        jLabel5.setPreferredSize(new java.awt.Dimension(148, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(jLabel5, gridBagConstraints);

        dniTextField.setText(anfitrion.getDni());
        dniTextField.setMinimumSize(new java.awt.Dimension(300, 27));
        dniTextField.setPreferredSize(new java.awt.Dimension(300, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        getContentPane().add(dniTextField, gridBagConstraints);

        superAnfitrionLabel.setText(anfitrion.getSuperS());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        getContentPane().add(superAnfitrionLabel, gridBagConstraints);

        valoracionMediaTextField.setText(String.valueOf(anfitrion.getValoracion()));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        getContentPane().add(valoracionMediaTextField, gridBagConstraints);

        jLabel7.setText("La media de las reseñas:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(jLabel7, gridBagConstraints);

        cambiarContrasenaButton.setText("Cambiar la contraseña");
        cambiarContrasenaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarContrasenaButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(cambiarContrasenaButton, gridBagConstraints);

        jLabel6.setText("Fecha del registro:");
        jLabel6.setMaximumSize(new java.awt.Dimension(148, 17));
        jLabel6.setMinimumSize(new java.awt.Dimension(148, 17));
        jLabel6.setPreferredSize(new java.awt.Dimension(148, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        getContentPane().add(jLabel6, gridBagConstraints);

        fechaLabel.setText(anfitrion.getRegistroS());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        getContentPane().add(fechaLabel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cambiarContrasenaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarContrasenaButtonActionPerformed
        new NuevaContrasena();
        this.dispose();
        this.setVisible(false);
    }//GEN-LAST:event_cambiarContrasenaButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        switch(jComboBox1.getSelectedIndex()){
            case 1: //Guardar y volver
                if(nombreTextField.getText().length()>0){
                    anfitrion.setNombre(nombreTextField.getText());
                }else{
                    JOptionPane.showMessageDialog(this, "El nombre no puede estar vacio", "Nombre vacío", JOptionPane.ERROR_MESSAGE);
                }
                if(emailTextField.getText().length()>0){
                    anfitrion.setEmail(emailTextField.getText());
                }else{
                    JOptionPane.showMessageDialog(this, "El email no puede estar vacio", "Email vacío", JOptionPane.ERROR_MESSAGE);
                }
                if(DataChecker.checkTfn(telefonoTextField.getText())){
                    this.anfitrion.setTelefono(Integer.parseInt(telefonoTextField.getText()));
                }else{
                    JOptionPane.showMessageDialog(this,"El número de teléfono tiene que tener nueve dígitos","Teléfono incorrecto",JOptionPane.ERROR_MESSAGE);
                }
                if(DataChecker.checkDNI(dniTextField.getText())){
                    anfitrion.setDni(dniTextField.getText());
                }else{
                    JOptionPane.showMessageDialog(this,"Introduzca un DNI válido","DNI incorrecto",JOptionPane.ERROR_MESSAGE);
                }
                Database.save();
                new MenuAnfitrion();
                this.dispose();
                this.setVisible(false);
                break;
                //verifica que el telefono, el dni, el nombre etc son validos, guarda los datos y vuelve al menu
            case 2: //volver sin guardar
                new MenuAnfitrion();
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
            java.util.logging.Logger.getLogger(PerfilAnfitrion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerfilAnfitrion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerfilAnfitrion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerfilAnfitrion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerfilAnfitrion().setVisible(true);
            }
        });
    }
    private void formClosing() {this.dispose(); }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cambiarContrasenaButton;
    private javax.swing.JTextField dniTextField;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel fechaLabel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JLabel superAnfitrionLabel;
    private javax.swing.JTextField telefonoTextField;
    private javax.swing.JLabel valoracionMediaTextField;
    // End of variables declaration//GEN-END:variables
    private Anfitrion anfitrion;
}
