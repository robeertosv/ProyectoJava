/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.rk.javabnb.UI;

import com.rk.javabnb.Inmuebles.Inmueble;
import com.rk.javabnb.Inmuebles.Reserva;
import com.rk.javabnb.Usuarios.Admin;
import com.rk.javabnb.Usuarios.Anfitrion;
import com.rk.javabnb.db.DataChecker;
import com.rk.javabnb.db.Database;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.*;
import java.nio.file.Files;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author admin
 */
public class EditarInmueble extends javax.swing.JFrame {

    /**
     * Creates new form EditarInmueble
     */
    public EditarInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
        initComponents();
        this.setVisible(true);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        tituloTextField.setText(inmueble.getTitulo());
        tipoTextField.setText(inmueble.getTipo());
        calificacionLabel.setText(inmueble.getCalificacion()+"/5");
        vecesValoradoLabel.setText("Ha sido valorado "+inmueble.getVecesValorado()+" veces");
        precioTextField.setText(String.valueOf(inmueble.getPrecio()));
        ciudadField.setText(inmueble.getCiudad());
        numeroField.setText(String.valueOf(inmueble.getDireccion2().getNumero()));
        calleTextField.setText(inmueble.getDireccion2().getCalle());
        cpField.setText(String.valueOf(inmueble.getDireccion2().getCp()));
        descripcionField.setText(inmueble.getDatos().getDescripcion());
        serviciosField.setText(inmueble.getServicios());
        mHuespedesField.setText(String.valueOf(inmueble.getDatos().getMaxHuespedes()));
        habitacionesField.setText(String.valueOf(inmueble.getDatos().getHabitaciones()));
        banosField.setText(String.valueOf(inmueble.getDatos().getBanos()));
        camasField.setText(String.valueOf(inmueble.getDatos().getCamas()));
        try {
            ImageIcon imageIcon = new ImageIcon(inmueble.getFotoURL());
            Image scaledImage = imageIcon.getImage().getScaledInstance(fotoLabel.getWidth(), fotoLabel.getHeight(), Image.SCALE_SMOOTH);
            this.fotoLabel.setIcon(new javax.swing.ImageIcon(scaledImage));
        }catch(NullPointerException e){
            System.out.println(e);
            this.fotoLabel.setText("todavía no hay foto");
        }
        jLabel3.setText("Tipo (Casa/Apartamento):");
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
        jLabel3 = new javax.swing.JLabel();
        calificacionLabel = new javax.swing.JLabel();
        vecesValoradoLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        borrarButton = new javax.swing.JButton();
        label23 = new javax.swing.JLabel();
        label25 = new javax.swing.JLabel();
        guardarComboBox = new javax.swing.JComboBox<>();
        fotoLabel = new javax.swing.JLabel();
        tituloTextField = new javax.swing.JTextField();
        tipoTextField = new javax.swing.JTextField();
        precioTextField = new javax.swing.JTextField();
        calleTextField = new javax.swing.JTextField();
        numeroField = new javax.swing.JTextField();
        cpField = new javax.swing.JTextField();
        ciudadField = new javax.swing.JTextField();
        serviciosField = new javax.swing.JTextField();
        descripcionField = new javax.swing.JTextField();
        camasField = new javax.swing.JTextField();
        banosField = new javax.swing.JTextField();
        habitacionesField = new javax.swing.JTextField();
        mHuespedesField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/small_logo.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 41, 2, 2);
        getContentPane().add(jLabel1, gridBagConstraints);

        jLabel3.setText("Tipo (casa/apartamento):");
        jLabel3.setMaximumSize(new java.awt.Dimension(156, 17));
        jLabel3.setMinimumSize(new java.awt.Dimension(156, 17));
        jLabel3.setPreferredSize(new java.awt.Dimension(156, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(10, 42, 10, 0);
        getContentPane().add(jLabel3, gridBagConstraints);

        calificacionLabel.setText("x/5");
        calificacionLabel.setMaximumSize(new java.awt.Dimension(156, 17));
        calificacionLabel.setMinimumSize(new java.awt.Dimension(156, 17));
        calificacionLabel.setPreferredSize(new java.awt.Dimension(156, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 42, 10, 0);
        getContentPane().add(calificacionLabel, gridBagConstraints);

        vecesValoradoLabel.setText("Ha sido valorado xx veces");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 42, 10, 0);
        getContentPane().add(vecesValoradoLabel, gridBagConstraints);

        jLabel7.setText("Precio:");
        jLabel7.setMaximumSize(new java.awt.Dimension(156, 17));
        jLabel7.setMinimumSize(new java.awt.Dimension(156, 17));
        jLabel7.setPreferredSize(new java.awt.Dimension(156, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(10, 42, 10, 0);
        getContentPane().add(jLabel7, gridBagConstraints);

        jLabel11.setText("Máximo de huéspedes:");
        jLabel11.setMaximumSize(new java.awt.Dimension(156, 17));
        jLabel11.setMinimumSize(new java.awt.Dimension(156, 17));
        jLabel11.setPreferredSize(new java.awt.Dimension(156, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.insets = new java.awt.Insets(10, 42, 10, 0);
        getContentPane().add(jLabel11, gridBagConstraints);

        jLabel12.setText("Habitaciones:");
        jLabel12.setMaximumSize(new java.awt.Dimension(156, 17));
        jLabel12.setMinimumSize(new java.awt.Dimension(156, 17));
        jLabel12.setPreferredSize(new java.awt.Dimension(156, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.insets = new java.awt.Insets(10, 42, 10, 0);
        getContentPane().add(jLabel12, gridBagConstraints);

        jLabel13.setText("Baños:");
        jLabel13.setMaximumSize(new java.awt.Dimension(156, 17));
        jLabel13.setMinimumSize(new java.awt.Dimension(156, 17));
        jLabel13.setPreferredSize(new java.awt.Dimension(156, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.insets = new java.awt.Insets(10, 42, 10, 0);
        getContentPane().add(jLabel13, gridBagConstraints);

        jLabel14.setText("Camas:");
        jLabel14.setMaximumSize(new java.awt.Dimension(156, 17));
        jLabel14.setMinimumSize(new java.awt.Dimension(156, 17));
        jLabel14.setPreferredSize(new java.awt.Dimension(156, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.insets = new java.awt.Insets(10, 42, 10, 0);
        getContentPane().add(jLabel14, gridBagConstraints);

        borrarButton.setText("Borrar el inmueble");
        borrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.insets = new java.awt.Insets(59, 34, 15, 15);
        getContentPane().add(borrarButton, gridBagConstraints);

        label23.setText("Descripción:");
        label23.setMaximumSize(new java.awt.Dimension(156, 17));
        label23.setMinimumSize(new java.awt.Dimension(156, 17));
        label23.setPreferredSize(new java.awt.Dimension(156, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 42, 10, 0);
        getContentPane().add(label23, gridBagConstraints);

        label25.setText("Servicios:");
        label25.setMaximumSize(new java.awt.Dimension(156, 17));
        label25.setMinimumSize(new java.awt.Dimension(156, 17));
        label25.setPreferredSize(new java.awt.Dimension(156, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 42, 10, 0);
        getContentPane().add(label25, gridBagConstraints);

        guardarComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Volver", "Guardar cambios", "No guardar cambios" }));
        guardarComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarComboBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(59, 26, 15, 40);
        getContentPane().add(guardarComboBox, gridBagConstraints);

        fotoLabel.setText("foto");
        fotoLabel.setMaximumSize(new java.awt.Dimension(400, 200));
        fotoLabel.setMinimumSize(new java.awt.Dimension(400, 200));
        fotoLabel.setPreferredSize(new java.awt.Dimension(400, 200));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 40);
        getContentPane().add(fotoLabel, gridBagConstraints);

        tituloTextField.setText("titulo");
        tituloTextField.setMaximumSize(new java.awt.Dimension(200, 27));
        tituloTextField.setMinimumSize(new java.awt.Dimension(200, 27));
        tituloTextField.setPreferredSize(new java.awt.Dimension(200, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 42, 10, 58);
        getContentPane().add(tituloTextField, gridBagConstraints);

        tipoTextField.setText("Apartamento");
        tipoTextField.setMaximumSize(new java.awt.Dimension(100, 27));
        tipoTextField.setMinimumSize(new java.awt.Dimension(100, 27));
        tipoTextField.setPreferredSize(new java.awt.Dimension(100, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(tipoTextField, gridBagConstraints);

        precioTextField.setText("precio");
        precioTextField.setMaximumSize(new java.awt.Dimension(100, 27));
        precioTextField.setMinimumSize(new java.awt.Dimension(100, 27));
        precioTextField.setPreferredSize(new java.awt.Dimension(100, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(precioTextField, gridBagConstraints);

        calleTextField.setText("calle Juan Ramon Jimenez");
        calleTextField.setMaximumSize(new java.awt.Dimension(250, 27));
        calleTextField.setMinimumSize(new java.awt.Dimension(250, 27));
        calleTextField.setPreferredSize(new java.awt.Dimension(250, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(calleTextField, gridBagConstraints);

        numeroField.setText("numero");
        numeroField.setMaximumSize(new java.awt.Dimension(100, 27));
        numeroField.setMinimumSize(new java.awt.Dimension(100, 27));
        numeroField.setPreferredSize(new java.awt.Dimension(100, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(numeroField, gridBagConstraints);

        cpField.setText("cppppp");
        cpField.setMaximumSize(new java.awt.Dimension(140, 27));
        cpField.setMinimumSize(new java.awt.Dimension(140, 27));
        cpField.setPreferredSize(new java.awt.Dimension(140, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.insets = new java.awt.Insets(10, 42, 10, 15);
        getContentPane().add(cpField, gridBagConstraints);

        ciudadField.setText("Alcalá de Henares");
        ciudadField.setMaximumSize(new java.awt.Dimension(140, 27));
        ciudadField.setMinimumSize(new java.awt.Dimension(140, 27));
        ciudadField.setPreferredSize(new java.awt.Dimension(140, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(10, 42, 10, 18);
        getContentPane().add(ciudadField, gridBagConstraints);

        serviciosField.setText("servicios");
        serviciosField.setMaximumSize(new java.awt.Dimension(600, 27));
        serviciosField.setMinimumSize(new java.awt.Dimension(600, 27));
        serviciosField.setPreferredSize(new java.awt.Dimension(600, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(serviciosField, gridBagConstraints);

        descripcionField.setText("descripcion");
        descripcionField.setMaximumSize(new java.awt.Dimension(600, 27));
        descripcionField.setMinimumSize(new java.awt.Dimension(600, 27));
        descripcionField.setPreferredSize(new java.awt.Dimension(600, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(descripcionField, gridBagConstraints);

        camasField.setText("jTextField3");
        camasField.setMaximumSize(new java.awt.Dimension(100, 27));
        camasField.setMinimumSize(new java.awt.Dimension(100, 27));
        camasField.setPreferredSize(new java.awt.Dimension(100, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(camasField, gridBagConstraints);

        banosField.setText("jTextField4");
        banosField.setMaximumSize(new java.awt.Dimension(100, 27));
        banosField.setMinimumSize(new java.awt.Dimension(100, 27));
        banosField.setPreferredSize(new java.awt.Dimension(100, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(banosField, gridBagConstraints);

        habitacionesField.setText("jTextField5");
        habitacionesField.setMaximumSize(new java.awt.Dimension(100, 27));
        habitacionesField.setMinimumSize(new java.awt.Dimension(100, 27));
        habitacionesField.setPreferredSize(new java.awt.Dimension(100, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(habitacionesField, gridBagConstraints);

        mHuespedesField.setText("jTextField6");
        mHuespedesField.setMaximumSize(new java.awt.Dimension(100, 27));
        mHuespedesField.setMinimumSize(new java.awt.Dimension(100, 27));
        mHuespedesField.setPreferredSize(new java.awt.Dimension(100, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(mHuespedesField, gridBagConstraints);

        jLabel2.setText("                                                   ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        getContentPane().add(jLabel2, gridBagConstraints);

        jToggleButton1.setText("Seleccionar una nueva foto");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 40);
        getContentPane().add(jToggleButton1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarComboBoxActionPerformed
        switch(guardarComboBox.getSelectedIndex()) {
            case 1: //guardar cambios
                if(tituloTextField.getText().isEmpty()||calleTextField.getText().isEmpty()||ciudadField.getText().isEmpty()||descripcionField.getText().isEmpty()||serviciosField.getText().isEmpty()||ciudadField.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Campos vacios", "Error", JOptionPane.ERROR_MESSAGE);
                }else{
                    inmueble.setTitulo(tituloTextField.getText());
                    if(tipoTextField.getText().equals("Apartamento")||tipoTextField.getText().equals("Casa")){
                        inmueble.setTipo(tipoTextField.getText());
                    }else{
                        JOptionPane.showMessageDialog(this,"El tipo tiene que ser Casa o Apartamento", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    try{
                        inmueble.setPrecio(Double.parseDouble(precioTextField.getText()));
                        int numero = Integer.parseInt(numeroField.getText());
                        int cp = Integer.parseInt(cpField.getText());
                        if(DataChecker.checkCP(cpField.getText())){
                            inmueble.setDireccion(ciudadField.getText(),calleTextField.getText(),numero,cp);
                        }else{JOptionPane.showMessageDialog(this,"El código postal tiene que tener cinco dígitos","Error", JOptionPane.ERROR_MESSAGE);}
                        int huespedes = Integer.parseInt(mHuespedesField.getText());
                        int habitaciones = Integer.parseInt(habitacionesField.getText());
                        int banos = Integer.parseInt(banosField.getText());
                        int camas = Integer.parseInt(camasField.getText());
                        int masHuespedes = 0;
                        LocalDate now = LocalDate.now();
                        for (Reserva r:inmueble.getReservas()){
                            if((r.getHuespedes()>huespedes)&&(r.getSalida().isAfter(now))){
                                masHuespedes++;
                            }
                        }
                        if(masHuespedes==0){
                            inmueble.setDatos(banos,camas, habitaciones,huespedes,descripcionField.getText());
                        }else{
                            JOptionPane.showMessageDialog(this,"Existen reservas en el futuro con más huéspedes, no se puede modificar ahora","Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(this,"El precio, el número de la calle, el código postal, la cantidad de huéspedes, habitaciones, camas, baños tienen que ser un número","Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
                new MenuAnfitrion();
                this.dispose();
                break;
            case 2: //no guardar cambios
                new MenuAnfitrion();
                this.dispose();
                break;
        }
    }//GEN-LAST:event_guardarComboBoxActionPerformed

    private void borrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarButtonActionPerformed
        int quedanReservas = inmueble.borrarInmueble();
        new MenuAnfitrion();
        this.dispose();
        if(quedanReservas > 0){
            JOptionPane.showMessageDialog(this, "Este inmueble tiene "+quedanReservas+" reservas para el futuro, no se puede eliminar","Error",JOptionPane.ERROR_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this,"El inmueble ha sido eliminado","Eliminado",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_borrarButtonActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Imágen", "png", "jpg", "jpeg", "webp");
        fileChooser.setFileFilter(filter);
        int seleccion = fileChooser.showOpenDialog(this.getParent());

        if(seleccion == JFileChooser.APPROVE_OPTION) {
            try{
                String url = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator;

                int idx = fileChooser.getSelectedFile().getAbsolutePath().lastIndexOf(".");
                String ext = fileChooser.getSelectedFile().getAbsolutePath().substring(idx+1);
                File targetFile = new File(url, this.tituloTextField.getText() + "." + ext);
                Files.copy(fileChooser.getSelectedFile().toPath(), targetFile.toPath());
                this.fotoURL = url + this.tituloTextField.getText() + "."+ext;
                this.inmueble.setFotoURL(fotoURL);
            }catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    //public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditarInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarInmueble().setVisible(true);
            }
        });
    }*/


    private Inmueble inmueble;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField banosField;
    private javax.swing.JButton borrarButton;
    private javax.swing.JLabel calificacionLabel;
    private javax.swing.JTextField calleTextField;
    private javax.swing.JTextField camasField;
    private javax.swing.JTextField ciudadField;
    private javax.swing.JTextField cpField;
    private javax.swing.JTextField descripcionField;
    private javax.swing.JLabel fotoLabel;
    private javax.swing.JComboBox<String> guardarComboBox;
    private javax.swing.JTextField habitacionesField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel label23;
    private javax.swing.JLabel label25;
    private javax.swing.JTextField mHuespedesField;
    private javax.swing.JTextField numeroField;
    private javax.swing.JTextField precioTextField;
    private javax.swing.JTextField serviciosField;
    private javax.swing.JTextField tipoTextField;
    private javax.swing.JTextField tituloTextField;
    private javax.swing.JLabel vecesValoradoLabel;
    // End of variables declaration//GEN-END:variables
    private String fotoURL;
}
