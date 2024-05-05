/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.rk.javabnb.UI;

import com.rk.javabnb.Inmuebles.Inmueble;
import com.rk.javabnb.Inmuebles.Reserva;
import com.rk.javabnb.Usuarios.Anfitrion;
import com.rk.javabnb.Usuarios.Cliente;
import com.rk.javabnb.Usuarios.ClienteParticular;
import com.rk.javabnb.db.Database;

import javax.swing.*;
import java.time.LocalDate;

/**
 *
 * @author admin
 */
public class ReservaPreview extends javax.swing.JPanel implements Comparable<ReservaPreview>{

    /**
     * Creates new form ReservaPanel
     */
    public ReservaPreview(Reserva reserva, String nombreA) {
        this.reserva = reserva;
        initComponents();
        this.inmueble = reserva.getInmueble();
        this.anfitrionLabel.setText(nombreA);
        this.entradaLabel.setText(reserva.fechaToString(reserva.getEntrada()));
        this.fechaCreacionLabel.setText(reserva.fechaToString(reserva.getCreacion()));
        this.huespedesLabel.setText(reserva.getHuespedesString());
        this.inmuebleLabel.setText(inmueble.getTitulo());
        this.particularLabel.setText(reserva.getParticular().getNombre());
        this.salidaLabel.setText(reserva.fechaToString(reserva.getSalida()));
        Database.save();
        //crea un panel con toda la informacion sobre la reserva para mostrarla al cliente, anfitrion o admin en HomeReservas
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
        inmuebleLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        anfitrionLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        particularLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        entradaLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        salidaLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        huespedesLabel = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        precioLabel = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        fechaCreacionLabel = new javax.swing.JLabel();
        verInmuebleButton = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        dejarResenaButton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        cancelBtn = new javax.swing.JButton();

        setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Inmueble:");
        jLabel1.setMaximumSize(new java.awt.Dimension(126, 17));
        jLabel1.setMinimumSize(new java.awt.Dimension(126, 17));
        jLabel1.setPreferredSize(new java.awt.Dimension(126, 17));
        add(jLabel1, new java.awt.GridBagConstraints());

        inmuebleLabel.setText(" ");
        add(inmuebleLabel, new java.awt.GridBagConstraints());

        jLabel3.setText("Anfitrión:");
        jLabel3.setMaximumSize(new java.awt.Dimension(126, 17));
        jLabel3.setMinimumSize(new java.awt.Dimension(126, 17));
        jLabel3.setPreferredSize(new java.awt.Dimension(126, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        add(jLabel3, gridBagConstraints);

        anfitrionLabel.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        add(anfitrionLabel, gridBagConstraints);

        jLabel5.setText("Cliente particular:");
        jLabel5.setMaximumSize(new java.awt.Dimension(126, 17));
        jLabel5.setMinimumSize(new java.awt.Dimension(126, 17));
        jLabel5.setPreferredSize(new java.awt.Dimension(126, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        add(jLabel5, gridBagConstraints);

        particularLabel.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        add(particularLabel, gridBagConstraints);

        jLabel7.setText("Fecha de entrada:");
        jLabel7.setMaximumSize(new java.awt.Dimension(126, 17));
        jLabel7.setMinimumSize(new java.awt.Dimension(126, 17));
        jLabel7.setPreferredSize(new java.awt.Dimension(126, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        add(jLabel7, gridBagConstraints);

        entradaLabel.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        add(entradaLabel, gridBagConstraints);

        jLabel9.setText("Fecha de salida:");
        jLabel9.setMaximumSize(new java.awt.Dimension(126, 17));
        jLabel9.setMinimumSize(new java.awt.Dimension(126, 17));
        jLabel9.setPreferredSize(new java.awt.Dimension(126, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        add(jLabel9, gridBagConstraints);

        salidaLabel.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        add(salidaLabel, gridBagConstraints);

        jLabel11.setText("Huéspedes:");
        jLabel11.setMaximumSize(new java.awt.Dimension(126, 17));
        jLabel11.setMinimumSize(new java.awt.Dimension(126, 17));
        jLabel11.setPreferredSize(new java.awt.Dimension(126, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        add(jLabel11, gridBagConstraints);

        huespedesLabel.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        add(huespedesLabel, gridBagConstraints);

        jLabel13.setText("Precio:");
        jLabel13.setMaximumSize(new java.awt.Dimension(126, 17));
        jLabel13.setMinimumSize(new java.awt.Dimension(126, 17));
        jLabel13.setPreferredSize(new java.awt.Dimension(126, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        add(jLabel13, gridBagConstraints);

        precioLabel.setText(String.valueOf(inmueble.getPrecio()));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        add(precioLabel, gridBagConstraints);

        jLabel15.setText("La reserva fue hecha:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        add(jLabel15, gridBagConstraints);

        fechaCreacionLabel.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        add(fechaCreacionLabel, gridBagConstraints);

        verInmuebleButton.setText("Ver el inmueble");
        verInmuebleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verInmuebleButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(verInmuebleButton, gridBagConstraints);

        jLabel17.setText("                      ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        add(jLabel17, gridBagConstraints);

        if(Database.getCurrentUser().getFirst() instanceof ClienteParticular) {
            dejarResenaButton.setText("Dejar reseña");
            dejarResenaButton.setMaximumSize(new java.awt.Dimension(124, 27));
            dejarResenaButton.setMinimumSize(new java.awt.Dimension(124, 27));
            dejarResenaButton.setPreferredSize(new java.awt.Dimension(124, 27));
            dejarResenaButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    dejarResenaButtonActionPerformed(evt);
                }
            });
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 3;
            gridBagConstraints.gridy = 6;
            gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
            add(dejarResenaButton, gridBagConstraints);

            jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "4", "3", "2", "1", "0" }));
            jComboBox1.setMaximumSize(new java.awt.Dimension(124, 27));
            jComboBox1.setMinimumSize(new java.awt.Dimension(124, 27));
            jComboBox1.setPreferredSize(new java.awt.Dimension(124, 27));
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 3;
            gridBagConstraints.gridy = 5;
            add(jComboBox1, gridBagConstraints);
        }

        cancelBtn.setText("CANCELAR RESERVA");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(cancelBtn, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void verInmuebleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verInmuebleButtonActionPerformed
        new PreReserva2(inmueble);
    }//GEN-LAST:event_verInmuebleButtonActionPerformed

    private void dejarResenaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dejarResenaButtonActionPerformed
        try {
            ClienteParticular cliente = (ClienteParticular) Database.getCurrentUser().getFirst();
            for(Inmueble i : cliente.getInmueblesValorados()) {
                if(cliente.getInmueblesValorados().contains(i)) {
                    JOptionPane.showMessageDialog(this, "Ya has valorado este inmueble", "ERROR", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
            String elegido = jComboBox1.getSelectedItem().toString();
            int valoracion = Integer.parseInt(elegido);
            this.inmueble.addResena(valoracion);
            JOptionPane.showMessageDialog(this,"Ha valorado el inmueble "+inmueble.getNombre()+" con un "+valoracion,"Reseña",JOptionPane.INFORMATION_MESSAGE);

        }catch(Exception e) {
            JOptionPane.showMessageDialog(this,"Sólo los clientes particulares pueden dejar reseñas","Error",JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_dejarResenaButtonActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        int result = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cancelar la reserva?", "CANCELACIÓN DE RESERVA", JOptionPane.OK_CANCEL_OPTION);
        if(result == JOptionPane.OK_OPTION) {
            Database.popReserva(this.reserva);
        }
    }//GEN-LAST:event_cancelBtnActionPerformed

    public Anfitrion getAnfitrion(){return this.inmueble.getAnfitrion();}
    public ClienteParticular getParticular(){return this.reserva.getParticular();}
    public String toString(){return this.reserva.toString();}
    public LocalDate getCreacion(){return this.reserva.getCreacion();}
    public int compareTo(ReservaPreview r) {
        // compara localdates y los ordena desde la mas nueva a la mas antigua
        return r.getCreacion().compareTo(this.getCreacion());
    }

    private Reserva reserva;
    private Inmueble inmueble;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anfitrionLabel;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel precioLabel;
    private javax.swing.JButton dejarResenaButton;
    private javax.swing.JLabel entradaLabel;
    private javax.swing.JLabel fechaCreacionLabel;
    private javax.swing.JLabel huespedesLabel;
    private javax.swing.JLabel inmuebleLabel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel particularLabel;
    private javax.swing.JLabel salidaLabel;
    private javax.swing.JButton verInmuebleButton;
    // End of variables declaration//GEN-END:variables
}
