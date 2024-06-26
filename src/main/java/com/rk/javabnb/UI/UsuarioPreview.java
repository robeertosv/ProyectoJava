/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.rk.javabnb.UI;

import com.rk.javabnb.Usuarios.Anfitrion;
import com.rk.javabnb.Usuarios.ClienteParticular;
import com.rk.javabnb.db.Database;

/**
 *
 * @author admin
 */
public class UsuarioPreview extends javax.swing.JPanel {

    /**
     * Creates new form UsuarioPreview
     */
    public UsuarioPreview(ClienteParticular p) {
        this.p = p;
        initComponents();
        this.boolTextLabel.setText(p.getVIPS());
        this.dniTextLabel.setText(p.getDni());
        this.emailTextLabel.setText(p.getEmail());
        this.nombreLabel.setText(p.getNombre());
        this.telefonoTextLabel.setText(p.getTelefono());
        this.fechaOtarjetaLabel.setText("Tarjeta de crédito:");
        this.fechaTarjetaTextLabel.setText(p.getTarjetaS());
        this.tipoLabel.setText("Cliente particular");
        this.verMasButton.setText("Ver sus reservas");
        //constructor si el usuario es particular
    }

    public UsuarioPreview(Anfitrion a) {
        this.a = a;
        initComponents();
        this.dniTextLabel.setText(a.getDni());
        this.emailTextLabel.setText(a.getEmail());
        this.nombreLabel.setText(a.getNombre());
        this.telefonoTextLabel.setText(a.getTelefono());
        this.boolTextLabel.setText(a.getSuperS());
        this.fechaOtarjetaLabel.setText("Fecha de registro:");
        this.fechaTarjetaTextLabel.setText(a.getRegistroS());
        this.tipoLabel.setText("Anfitrión");
        this.verMasButton.setText("Ver sus inmuebles");
        //constructor si el usuario es anfitrion
    }

    public String getNombre(){
        String nombre = (this.tipoLabel.getText().equals("Cliente particular"))?p.getNombre():a.getNombre();
        return nombre;
    }
    public boolean isVIP(){
        boolean respuesta = false;
        if(this.tipoLabel.getText().equals("Cliente particular")&&p.isVIP()){
            respuesta = true;
        }
        return respuesta;
    }
    public boolean isSuper(){
        boolean respuesta = false;
        if(this.tipoLabel.getText().equals("Anfitrión")&&a.isSuper()){
            respuesta = true;
        }
        return respuesta;
    }
    public boolean isParticular(){
        boolean respuesta = false;
        if(this.tipoLabel.getText().equals("Cliente particular")){
            respuesta = true;
        }
        return respuesta;
    }
    public boolean isAnfitrion(){
        boolean respuesta = false;
        if(this.tipoLabel.getText().equals("Anfitrión")){
            respuesta = true;
        }
        return respuesta;
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

        nombreLabel = new javax.swing.JLabel();
        tipoLabel = new javax.swing.JLabel();
        telefonoTextLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        emailTextLabel = new javax.swing.JLabel();
        verMasButton = new javax.swing.JButton();
        telefonoLabel = new javax.swing.JLabel();
        dniLabel = new javax.swing.JLabel();
        dniTextLabel = new javax.swing.JLabel();
        boolTextLabel = new javax.swing.JLabel();
        fechaOtarjetaLabel = new javax.swing.JLabel();
        fechaTarjetaTextLabel = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setLayout(new java.awt.GridBagLayout());

        nombreLabel.setFont(new java.awt.Font("Montserrat", 3, 24)); // NOI18N
        add(nombreLabel, new java.awt.GridBagConstraints());

        tipoLabel.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        add(tipoLabel, gridBagConstraints);

        telefonoTextLabel.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        add(telefonoTextLabel, gridBagConstraints);

        emailLabel.setText("Email:");
        emailLabel.setMaximumSize(new java.awt.Dimension(110, 17));
        emailLabel.setMinimumSize(new java.awt.Dimension(110, 17));
        emailLabel.setPreferredSize(new java.awt.Dimension(110, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        add(emailLabel, gridBagConstraints);

        emailTextLabel.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        add(emailTextLabel, gridBagConstraints);

        verMasButton.setText(" Ver más");
        verMasButton.setMaximumSize(new java.awt.Dimension(140, 27));
        verMasButton.setMinimumSize(new java.awt.Dimension(140, 27));
        verMasButton.setPreferredSize(new java.awt.Dimension(140, 27));
        verMasButton.setRequestFocusEnabled(false);
        verMasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verMasButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        add(verMasButton, gridBagConstraints);

        telefonoLabel.setText("Teléfono:");
        telefonoLabel.setMaximumSize(new java.awt.Dimension(110, 17));
        telefonoLabel.setMinimumSize(new java.awt.Dimension(110, 17));
        telefonoLabel.setPreferredSize(new java.awt.Dimension(110, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        add(telefonoLabel, gridBagConstraints);

        dniLabel.setText("DNI:");
        dniLabel.setMaximumSize(new java.awt.Dimension(110, 17));
        dniLabel.setMinimumSize(new java.awt.Dimension(110, 17));
        dniLabel.setPreferredSize(new java.awt.Dimension(110, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        add(dniLabel, gridBagConstraints);

        dniTextLabel.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        add(dniTextLabel, gridBagConstraints);

        boolTextLabel.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        add(boolTextLabel, gridBagConstraints);

        fechaOtarjetaLabel.setText(" ");
        fechaOtarjetaLabel.setMaximumSize(new java.awt.Dimension(110, 17));
        fechaOtarjetaLabel.setMinimumSize(new java.awt.Dimension(110, 17));
        fechaOtarjetaLabel.setPreferredSize(new java.awt.Dimension(110, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        add(fechaOtarjetaLabel, gridBagConstraints);

        fechaTarjetaTextLabel.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        add(fechaTarjetaTextLabel, gridBagConstraints);

        jLabel13.setText("                     ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        add(jLabel13, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void verMasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verMasButtonActionPerformed
        if(this.tipoLabel.getText().equals("Cliente particular")){
            new HomeReservas("particular");
            Database.setClienteVerMas(p);
        }else{
            new Home("anfitrion");
            Database.setAnfitrionVerMas(a);
        }
    }//GEN-LAST:event_verMasButtonActionPerformed

    private Anfitrion a;
    private ClienteParticular p;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel boolTextLabel;
    private javax.swing.JLabel dniLabel;
    private javax.swing.JLabel dniTextLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel emailTextLabel;
    private javax.swing.JLabel fechaOtarjetaLabel;
    private javax.swing.JLabel fechaTarjetaTextLabel;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JLabel telefonoLabel;
    private javax.swing.JLabel telefonoTextLabel;
    private javax.swing.JLabel tipoLabel;
    private javax.swing.JButton verMasButton;
    // End of variables declaration//GEN-END:variables
}
