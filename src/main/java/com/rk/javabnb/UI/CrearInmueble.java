/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.rk.javabnb.UI;

import java.util.ArrayList;
import javax.swing.*;

import com.rk.javabnb.Inmuebles.DatosInmueble;
import com.rk.javabnb.Inmuebles.Direccion;
import com.rk.javabnb.Inmuebles.Inmueble;
import com.rk.javabnb.db.Database;

/**
 *
 * @author admin
 */
public class CrearInmueble extends javax.swing.JFrame {

    /**
     * Creates new form CrearInmueble
     */
    public CrearInmueble() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
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

        tituloTextField = new javax.swing.JTextField();
        calleTextField = new javax.swing.JTextField();
        tipoComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ciudadTextField = new javax.swing.JTextField();
        numeroTextField = new javax.swing.JTextField();
        cpTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        precioTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        huespedesSpinner = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        habitacionesSpinner = new javax.swing.JSpinner();
        camasSpinner = new javax.swing.JSpinner();
        banosSpinner = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        serviciosTextPane = new javax.swing.JTextPane();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        crearButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descripcionTextPane = new javax.swing.JTextPane();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        menuButton = new javax.swing.JButton();

        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formClosing();
            }
        });
        this.setBackground(new java.awt.Color(255, 255, 255));
        this.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 18)); // NOI18N
        this.setPreferredSize(new java.awt.Dimension(1000, 1000));
        this.getContentPane().setLayout(new java.awt.GridBagLayout());

        tituloTextField.setMinimumSize(new java.awt.Dimension(113, 27));
        tituloTextField.setPreferredSize(new java.awt.Dimension(113, 27));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        getContentPane().add(tituloTextField, gridBagConstraints);

        calleTextField.setMinimumSize(new java.awt.Dimension(113, 27));
        calleTextField.setPreferredSize(new java.awt.Dimension(113, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 3);
        getContentPane().add(calleTextField, gridBagConstraints);

        tipoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Casa", "Apartamento" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(tipoComboBox, gridBagConstraints);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Título:");
        jLabel1.setMaximumSize(new java.awt.Dimension(138, 17));
        jLabel1.setMinimumSize(new java.awt.Dimension(138, 17));
        jLabel1.setPreferredSize(new java.awt.Dimension(138, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(jLabel1, gridBagConstraints);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Dirección:");
        jLabel2.setMaximumSize(new java.awt.Dimension(138, 17));
        jLabel2.setMinimumSize(new java.awt.Dimension(138, 17));
        jLabel2.setPreferredSize(new java.awt.Dimension(138, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(jLabel2, gridBagConstraints);

        ciudadTextField.setMinimumSize(new java.awt.Dimension(113, 27));
        ciudadTextField.setPreferredSize(new java.awt.Dimension(113, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        getContentPane().add(ciudadTextField, gridBagConstraints);

        numeroTextField.setMinimumSize(new java.awt.Dimension(113, 27));
        numeroTextField.setPreferredSize(new java.awt.Dimension(113, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        getContentPane().add(numeroTextField, gridBagConstraints);

        cpTextField.setMinimumSize(new java.awt.Dimension(113, 27));
        cpTextField.setPreferredSize(new java.awt.Dimension(113, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(cpTextField, gridBagConstraints);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Precio por noche:");
        jLabel3.setMaximumSize(new java.awt.Dimension(138, 17));
        jLabel3.setMinimumSize(new java.awt.Dimension(138, 17));
        jLabel3.setPreferredSize(new java.awt.Dimension(138, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(jLabel3, gridBagConstraints);

        precioTextField.setMinimumSize(new java.awt.Dimension(113, 27));
        precioTextField.setPreferredSize(new java.awt.Dimension(113, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        getContentPane().add(precioTextField, gridBagConstraints);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Máximo de huéspedes:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(jLabel4, gridBagConstraints);

        huespedesSpinner.setMinimumSize(new java.awt.Dimension(113, 27));
        huespedesSpinner.setPreferredSize(new java.awt.Dimension(113, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        getContentPane().add(huespedesSpinner, gridBagConstraints);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Habitaciones:");
        jLabel5.setMaximumSize(new java.awt.Dimension(138, 17));
        jLabel5.setMinimumSize(new java.awt.Dimension(138, 17));
        jLabel5.setPreferredSize(new java.awt.Dimension(138, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(jLabel5, gridBagConstraints);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Camas:");
        jLabel6.setMaximumSize(new java.awt.Dimension(138, 17));
        jLabel6.setMinimumSize(new java.awt.Dimension(138, 17));
        jLabel6.setPreferredSize(new java.awt.Dimension(138, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(jLabel6, gridBagConstraints);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Baños:");
        jLabel7.setMaximumSize(new java.awt.Dimension(138, 17));
        jLabel7.setMinimumSize(new java.awt.Dimension(138, 17));
        jLabel7.setPreferredSize(new java.awt.Dimension(138, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(jLabel7, gridBagConstraints);

        habitacionesSpinner.setMinimumSize(new java.awt.Dimension(113, 27));
        habitacionesSpinner.setPreferredSize(new java.awt.Dimension(113, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        getContentPane().add(habitacionesSpinner, gridBagConstraints);

        camasSpinner.setMinimumSize(new java.awt.Dimension(113, 27));
        camasSpinner.setPreferredSize(new java.awt.Dimension(113, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        getContentPane().add(camasSpinner, gridBagConstraints);

        banosSpinner.setMinimumSize(new java.awt.Dimension(113, 27));
        banosSpinner.setPreferredSize(new java.awt.Dimension(113, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        getContentPane().add(banosSpinner, gridBagConstraints);

        jLabel8.setText("jLabel8");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        getContentPane().add(jLabel8, gridBagConstraints);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Servicios:");
        jLabel9.setMaximumSize(new java.awt.Dimension(138, 17));
        jLabel9.setMinimumSize(new java.awt.Dimension(138, 17));
        jLabel9.setPreferredSize(new java.awt.Dimension(138, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(jLabel9, gridBagConstraints);

        jScrollPane1.setMinimumSize(new java.awt.Dimension(300, 50));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(300, 50));

        serviciosTextPane.setMinimumSize(new java.awt.Dimension(300, 50));
        serviciosTextPane.setPreferredSize(new java.awt.Dimension(300, 50));
        jScrollPane1.setViewportView(serviciosTextPane);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 15);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Fotografía:?");
        jLabel10.setMaximumSize(new java.awt.Dimension(138, 17));
        jLabel10.setMinimumSize(new java.awt.Dimension(138, 17));
        jLabel10.setPreferredSize(new java.awt.Dimension(138, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(jLabel10, gridBagConstraints);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/small_logo.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        getContentPane().add(jLabel11, gridBagConstraints);

        crearButton.setText("Crear el inmueble");
        crearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 13;
        getContentPane().add(crearButton, gridBagConstraints);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Descirpción:");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel12.setMaximumSize(new java.awt.Dimension(138, 17));
        jLabel12.setMinimumSize(new java.awt.Dimension(138, 17));
        jLabel12.setPreferredSize(new java.awt.Dimension(138, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(jLabel12, gridBagConstraints);

        jScrollPane2.setMinimumSize(new java.awt.Dimension(300, 50));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(300, 50));

        descripcionTextPane.setMinimumSize(new java.awt.Dimension(300, 50));
        descripcionTextPane.setPreferredSize(new java.awt.Dimension(300, 50));
        jScrollPane2.setViewportView(descripcionTextPane);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 15);
        getContentPane().add(jScrollPane2, gridBagConstraints);

        jLabel13.setText("Calle");
        jLabel13.setMaximumSize(new java.awt.Dimension(113, 27));
        jLabel13.setMinimumSize(new java.awt.Dimension(113, 27));
        jLabel13.setPreferredSize(new java.awt.Dimension(113, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        getContentPane().add(jLabel13, gridBagConstraints);

        jLabel14.setText("Número");
        jLabel14.setMaximumSize(new java.awt.Dimension(81, 17));
        jLabel14.setMinimumSize(new java.awt.Dimension(81, 17));
        jLabel14.setPreferredSize(new java.awt.Dimension(81, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        getContentPane().add(jLabel14, gridBagConstraints);

        jLabel15.setText("Código postal");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        getContentPane().add(jLabel15, gridBagConstraints);

        jLabel16.setText("Ciudad");
        jLabel16.setMaximumSize(new java.awt.Dimension(113, 27));
        jLabel16.setMinimumSize(new java.awt.Dimension(113, 27));
        jLabel16.setPreferredSize(new java.awt.Dimension(113, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        getContentPane().add(jLabel16, gridBagConstraints);

        menuButton.setText("Volver al menú");
        menuButton.setMaximumSize(new java.awt.Dimension(136, 27));
        menuButton.setMinimumSize(new java.awt.Dimension(136, 27));
        menuButton.setPreferredSize(new java.awt.Dimension(136, 27));
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.insets = new java.awt.Insets(13, 0, 13, 0);
        getContentPane().add(menuButton, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formClosing() {
        new Home("anfitrion");
        this.dispose();
    }
    private void crearButtonActionPerformed(java.awt.event.ActionEvent evt) {//verifica que todos los datos obligatorios fueron introducidos e instancia un nuevo inmueble//GEN-FIRST:event_crearButtonActionPerformed
        boolean tituloB = false;
        if(!tituloTextField.getText().isEmpty()){
            tituloB = true;
        }else{
            JOptionPane.showMessageDialog(this, "La casilla del título es obligatoria", "Falta del título", JOptionPane.WARNING_MESSAGE);
        }
        boolean ciudadB = false;
        if(!ciudadTextField.getText().isEmpty()){
            ciudadB = true;
        }else{
            JOptionPane.showMessageDialog(this, "La casilla de la ciudad es obligatoria", "Falta de la ciudad", JOptionPane.WARNING_MESSAGE);
        }
        boolean calleB = false;
        if(!calleTextField.getText().isEmpty()){
            calleB = true;
        }else{
            JOptionPane.showMessageDialog(this, "La casilla de la calle es obligatoria", "Falta de la calle", JOptionPane.WARNING_MESSAGE);
        }
        boolean numeroB = false;
        int numeroInt = 0;
        if(!numeroTextField.getText().isEmpty()){
            try{
                numeroInt = Integer.parseInt(numeroTextField.getText());
                numeroB = true;
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "El número de casa/apartamento tiene que ser un entero.", "Error del número", JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "La casilla del número es obligatoria", "Falta del número", JOptionPane.WARNING_MESSAGE);
        }
        boolean cpB = false;
        int cpInt = 0;
        if(!cpTextField.getText().isEmpty()&&cpTextField.getText().length()==5){
            try{
                cpInt = Integer.parseInt(cpTextField.getText());
                cpB = true;
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "El código postal tiene que ser un entero.", "Error del código postal", JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Introduzca cinco caracteres como número postal", "Error del código postal", JOptionPane.WARNING_MESSAGE);
        }
        boolean precioB = false;
        boolean precioEsDouble = false;
        Double precioDouble = 0.0;
        try{
            precioDouble = Double.parseDouble(precioTextField.getText());
            precioEsDouble = true;
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
        if(!precioTextField.getText().isEmpty()&&precioEsDouble){
            precioB = true;
        }else{
            JOptionPane.showMessageDialog(this, "Introduzca un número como precio", "Error del precio", JOptionPane.WARNING_MESSAGE);
        }
        ArrayList<javax.swing.JSpinner> spinners = new ArrayList<>();
        spinners.add(camasSpinner);
        spinners.add(habitacionesSpinner);
        spinners.add(huespedesSpinner);
        spinners.add(banosSpinner);
        int spinnersInt = 0;
        for(javax.swing.JSpinner spinner:spinners){
            int numero = (int) spinner.getValue();
            if(numero>0){spinnersInt += 1;}
        }
        if(spinnersInt<4){JOptionPane.showMessageDialog(this, "Tiene que haber por lo menos un huéspes, una habitación, una cama y un baño.", "Error", JOptionPane.WARNING_MESSAGE);}
        
        if(tituloB&&ciudadB&&calleB&&numeroB&&cpB&&precioB&&(spinnersInt>3)){
            String titulo = tituloTextField.getText();
            Direccion dir = new Direccion(ciudadTextField.getText(),calleTextField.getText(),numeroInt,cpInt);//se pueden llamar asi todas las direcciones?
            DatosInmueble datos = new DatosInmueble((int)banosSpinner.getValue(),(int)camasSpinner.getValue(),(int)habitacionesSpinner.getValue(),(int)huespedesSpinner.getValue(),descripcionTextPane.getText());
            char tipo = 'a';
            if(tipoComboBox.getSelectedItem().equals("Casa")){tipo = 'c';}
            Inmueble inmueble = new Inmueble(titulo,tipo,serviciosTextPane.getText(),precioDouble,"foto.png",dir,datos,Database.getCurrentAnfitrion());
            new MenuAnfitrion();
            this.dispose();
            this.setVisible(false);
            
        }
    }//GEN-LAST:event_crearButtonActionPerformed

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonActionPerformed
        new MenuAnfitrion();
        this.dispose();
        this.setVisible(false);
        //vuelve al menú
    }//GEN-LAST:event_menuButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CrearInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearInmueble().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner banosSpinner;
    private javax.swing.JTextField calleTextField;
    private javax.swing.JSpinner camasSpinner;
    private javax.swing.JTextField ciudadTextField;
    private javax.swing.JTextField cpTextField;
    private javax.swing.JButton crearButton;
    private javax.swing.JTextPane descripcionTextPane;
    private javax.swing.JSpinner habitacionesSpinner;
    private javax.swing.JSpinner huespedesSpinner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton menuButton;
    private javax.swing.JTextField numeroTextField;
    private javax.swing.JTextField precioTextField;
    private javax.swing.JTextPane serviciosTextPane;
    private javax.swing.JComboBox<String> tipoComboBox;
    private javax.swing.JTextField tituloTextField;
    // End of variables declaration//GEN-END:variables
}
