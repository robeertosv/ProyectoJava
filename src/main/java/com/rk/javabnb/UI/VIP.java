/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.rk.javabnb.UI;

import com.rk.javabnb.Usuarios.Cliente;
import com.rk.javabnb.Usuarios.ClienteParticular;
import com.rk.javabnb.db.Database;

import javax.swing.*;

/**
 *
 * @author admin
 */
public class VIP extends javax.swing.JFrame {

    /**
     * Creates new form VIP
     */
    public VIP() {
        setVisible(true);
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
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
        volverButton = new javax.swing.JButton();
        vipButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        //jTextArea1 = new javax.swing.JTextArea();
        jTextArea1 = new JLabel();

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
        gridBagConstraints.gridwidth = 2;
        getContentPane().add(jLabel1, gridBagConstraints);

        volverButton.setText("Volver");
        volverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 24, 24, 24);
        getContentPane().add(volverButton, gridBagConstraints);

        vipButton.setText("Ser VIP");
        vipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vipButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(24, 24, 24, 24);
        getContentPane().add(vipButton, gridBagConstraints);

        jTextArea1.setText("Los clientes VIP pagan 50 euros al año y obtienen un descuento de 10% para todas sus reservas.");
        jScrollPane1.setViewportView(jTextArea1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        getContentPane().add(jScrollPane1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverButtonActionPerformed
        new MenuParticular();
        this.dispose();
        this.setVisible(false);
    }//GEN-LAST:event_volverButtonActionPerformed

    private void vipButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vipButtonActionPerformed
        ClienteParticular particular = Database.getCurrentParticular();
        if(particular.getTarjeta() == null) {
            JOptionPane.showMessageDialog(this, "No tienes configurado ningún método de pago", "Error de pago", JOptionPane.WARNING_MESSAGE);
            new DatosBancarios("vip");
            this.dispose();
            this.setVisible(false);
        }else {
            particular.hacerVIP();
            Database.save();
            JOptionPane.showMessageDialog(this, "Ahora puede disfrutar de los descuentos de los clientes VIP", "VIP", JOptionPane.INFORMATION_MESSAGE);
            new MenuParticular();
            this.dispose();
            this.setVisible(false);
        }
        //si el particular tiene configurado algun metodo de pago, le permite hacerse VIP
    }//GEN-LAST:event_vipButtonActionPerformed


    private void formClosing() {
        Cliente c = (Cliente) Database.getCurrentUser().getFirst();
        new Home(c.getClass().getSimpleName());
        this.dispose();
    }
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
            java.util.logging.Logger.getLogger(VIP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VIP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VIP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VIP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VIP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    //private javax.swing.JTextArea jTextArea1;
    private JLabel jTextArea1;
    private javax.swing.JButton vipButton;
    private javax.swing.JButton volverButton;
    // End of variables declaration//GEN-END:variables
}
