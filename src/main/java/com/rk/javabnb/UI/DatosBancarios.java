/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.rk.javabnb.UI;

import com.rk.javabnb.Usuarios.ClienteParticular;
import com.rk.javabnb.Usuarios.TarjetaCredito;
import com.rk.javabnb.db.Database;

import javax.swing.*;
import java.time.LocalDate;

/**
 *
 * @author Roberto
 */
public class DatosBancarios extends javax.swing.JFrame {

    /**
     * Creates new form DatosBancarios
     */
    public DatosBancarios() {
        initComponents();
        this.setVisible(true);
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        num = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        fechaCaducidad = new javax.swing.JFormattedTextField();
        addBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Añadir una tarjeta");
        setMaximumSize(new java.awt.Dimension(560, 380));
        setMinimumSize(new java.awt.Dimension(560, 380));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/small_logo.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(-40, 0, 0, 0);
        jPanel2.add(jLabel1, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Montserrat Medium", 2, 24)); // NOI18N
        jLabel6.setText("Añadir Método de Pago");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel2.add(jLabel6, gridBagConstraints);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel2.setText("Número de la tarjeta");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel3.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel3.setText("Nombre del titular");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel3.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel4.setText("Fecha de caducidad (dd/mm/yyyy)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel3.add(jLabel4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanel3.add(num, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanel3.add(name, gridBagConstraints);

        try {
            fechaCaducidad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanel3.add(fechaCaducidad, gridBagConstraints);

        addBtn.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        addBtn.setText("Añadir método de pago");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 15;
        jPanel3.add(addBtn, gridBagConstraints);

        jLabel5.setText("                                                                                         ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        jPanel3.add(jLabel5, gridBagConstraints);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        //AÑADIR TARJETA

        boolean numCorrecto = false;
        long numero = Long.parseLong(num.getText());

        if( String.valueOf(num.getText()).length() == 16) { numCorrecto= true; }

        String[] fecha = fechaCaducidad.getText().split("/"); // dd/mm/yyyy
        LocalDate fechaCaducidad = LocalDate.of(Integer.parseInt(fecha[2]), Integer.parseInt(fecha[1]), Integer.parseInt(fecha[0])); //yy month day
        LocalDate now = LocalDate.now();

        if(fechaCaducidad.isBefore(now)) {
            JOptionPane.showMessageDialog(this, "La tarjeta está caducada", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }



        if(numCorrecto) {


            TarjetaCredito tarjeta = new TarjetaCredito(fechaCaducidad, numero, name.getText());
            boolean exiseTarjeta = false;

            for(TarjetaCredito t : Database.getTarjetas()) {
                if(t.getNumero() == Long.parseLong(num.getText())) {
                    exiseTarjeta = true;
                    break;
                }
            }

            if(!exiseTarjeta) {
                Database.addCard(tarjeta);
                ClienteParticular cliente = (ClienteParticular) Database.getCurrentUser().get(0);
                cliente.setTarjeta(tarjeta);

                JOptionPane.showMessageDialog(this, "Tarjeta añadida", "OK", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "La tarjeta está en uso", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }

        }else {
            JOptionPane.showMessageDialog(this, "Comprueba el numero de la tajeta", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_addBtnActionPerformed

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
            java.util.logging.Logger.getLogger(DatosBancarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosBancarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosBancarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosBancarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatosBancarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JFormattedTextField fechaCaducidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField name;
    private javax.swing.JTextField num;
    // End of variables declaration//GEN-END:variables
}
