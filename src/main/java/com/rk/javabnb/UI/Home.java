/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.rk.javabnb.UI;

import com.rk.javabnb.Usuarios.Admin;
import com.rk.javabnb.Usuarios.Anfitrion;
import com.rk.javabnb.Usuarios.Cliente;
import com.rk.javabnb.Usuarios.ClienteParticular;
import com.rk.javabnb.db.Database;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.ArrayList;

/*Pantalla principal de la aplicación*/

public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home(String persona) {
        initComponents();
        this.setVisible(true);
        //this.persona = persona; //una variable que sirve para diferenciar que tipo de home hay que abrir y que inmuebles enseñar, dependiendo del usuario loggeado y de si el admin quiere ver todos los inmuebles o detalles de algun anfitrion
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //abre la ventana de inmuebles cogiendo como parámetro el tipo del usuario - admin puede ver todos los inmuebles sin reservarlos, clientes particulares pueden hacer reservas y los anfitriones pueden ver solamente sus inmuebles
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        searchInmueble = new javax.swing.JButton();
        filtros = new javax.swing.JComboBox<>();
        search = new javax.swing.JTextField();
        menuOpciones = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        scrollPane = new javax.swing.JScrollPane();
        containerPanel = new JPanel(new GridLayout(0, 1)); //Crear el contenedor donde se añadirán las casas

        for(InmueblePreview panel : Database.getInmueblePreview()) {
            containerPanel.add(panel);
        }

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Home");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/small_logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new java.awt.GridBagConstraints());

        searchInmueble.setText("Buscar");
        searchInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchInmuebleActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        jPanel1.add(searchInmueble, gridBagConstraints);

        filtros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Ciudad", "Menores precios", "Mejor rating", "Tipo"}));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(11, 11, 11, 11);
        jPanel1.add(filtros, gridBagConstraints);

        search.setText("");//o mejor poner "busca por ..."?
        search.setMinimumSize(new java.awt.Dimension(130, 17));
        search.setPreferredSize(new java.awt.Dimension(130, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 26;
        gridBagConstraints.insets = new java.awt.Insets(11, 11, 11, 11);
        jPanel1.add(search, gridBagConstraints);

        String nombreCurrent = "Admin";
        if(!Database.getCurrentUser().getFirst().getClass().getSimpleName().equals("Admin")) {
            Cliente c = (Cliente) Database.getCurrentUser().getFirst();
            nombreCurrent = c.getNombre();
        }

        //mira quien está loggeado y muestra su nombre o Admin
        menuOpciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { nombreCurrent,"Menú", "Cerrar Sesión" }));
        menuOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOpcionesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 9, 0, 9);
        jPanel1.add(menuOpciones, gridBagConstraints);

        jLabel2.setText("                           ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPanel1.add(jLabel2, gridBagConstraints);

        scrollPane.setViewportView(containerPanel);
        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);
        getContentPane().add(scrollPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpcionesActionPerformed
        switch(menuOpciones.getSelectedIndex()) {
            case 1: //mira quien está loggeado y vuelve a su respectivo menú
                if(Database.getCurrentUser().get(0) instanceof Admin) {
                    new MenuAdmin();
                }else if(Database.getCurrentUser().get(0) instanceof Anfitrion) {
                    new MenuAnfitrion();
                }else{new MenuParticular();}
                this.dispose();
                break;
            case 2: //cierra la sesión
                Database.cerrarSesion();
                new Login();
                this.dispose();
                break;
        }
    }//GEN-LAST:event_menuOpcionesActionPerformed

    private void searchInmuebleActionPerformed(java.awt.event.ActionEvent evt) {
        if(!persona.equals("anfitrion")) { //busca entre todos los inmuebles según filtros
            ArrayList<InmueblePreview> resultado = new ArrayList<>();
            boolean huboResultados = false;
            switch (this.filtros.getSelectedIndex()) {
                //Buscar por nombre
                case 0:
                    for (InmueblePreview i : Database.getInmueblePreview()) {
                        if (i.getNombre().contains(this.search.getText())) {
                            resultado.add(i);
                            huboResultados = true;
                        }
                    }
                    break;
                //Buscar por ciudad
                case 1:
                    for (InmueblePreview i : Database.getInmueblePreview()) {
                        if (i.getCiudad().equalsIgnoreCase(this.search.getText())) {
                            resultado.add(i);
                            huboResultados = true;
                        }
                    }
                    break;
                //Por precios (Menor a mayor)
                case 2:
                    for (InmueblePreview i : Database.getInmueblePreview()) {
                        resultado.add(i);
                        huboResultados = true;
                    }
                    resultado.sort((obj1, obj2) -> Double.compare(obj1.getPrecio(), obj2.getPrecio()));
                    break;
                //Mejores ratings
                case 3:
                    for (InmueblePreview i : Database.getInmueblePreview()) {
                        resultado.add(i);
                        huboResultados = true;
                        System.out.println(i.getRating());
                    }
                    resultado.sort((obj1, obj2) -> Double.compare(obj1.getRating(), obj2.getRating()));
                    Collections.reverse(resultado);
                    break;
                //Busqueda por casa o apartamento
                case 4:
                    if(this.search.getText().equalsIgnoreCase("casa")) {
                        for(InmueblePreview i : Database.getInmueblePreview()) {
                            if(i.getTipo().equals("Casa")) {
                                resultado.add(i);
                                huboResultados = true;
                            }
                        }
                    }else if(this.search.getText().equalsIgnoreCase("apartamento")) {
                        for(InmueblePreview i : Database.getInmueblePreview()) {
                            if(i.getTipo().equals("Apartamento")) {
                                resultado.add(i);
                                huboResultados = true;
                            }
                        }
                    }else {
                        JOptionPane.showMessageDialog(this, "Solo puedes buscar \"casa\" o \"apartamento\"", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }

            }

            if (huboResultados) {
                this.containerPanel.removeAll();
                for (InmueblePreview i : resultado) {
                    this.containerPanel.add(i);
                }
                this.scrollPane.setViewportView(containerPanel);
            } else { //si no hubo resultados muestra todos los inmuebles
                JOptionPane.showMessageDialog(this, "No se encontraron resultados para: " + this.search.getText(), "No se encontraron resultados", JOptionPane.WARNING_MESSAGE);
                this.containerPanel.removeAll();
                for (InmueblePreview panel : Database.getInmueblePreview()) {
                    containerPanel.add(panel);
                }
                this.scrollPane.setViewportView(containerPanel);
            }
        }
        if((persona.equals("anfitrion"))&&(Database.getCurrentUser().getFirst()instanceof Anfitrion)) { //busca los inmuebles del anfitrion según filtros
            ArrayList<InmueblePreview> resultado = new ArrayList<>();
            boolean huboResultados = false;
            switch (this.filtros.getSelectedIndex()){
                case 0: //por nombre
                    for (InmueblePreview i : Database.getMisInmueblesPreview()) {
                        if (i.getNombre().contains(this.search.getText())) {
                            resultado.add(i);
                            huboResultados = true;
                        }
                    }
                    break;
                case 1: //mis inmuebles por ciudad
                    for(InmueblePreview i : Database.getMisInmueblesPreview()) {
                        if (i.getNombre().contains(this.search.getText())) {
                            resultado.add(i);
                            huboResultados = true;
                        }
                    }
                    break;
                case 2: //mis inmuebles por precio
                    for(InmueblePreview i : Database.getMisInmueblesPreview()){
                        resultado.add(i);
                        huboResultados = true;
                    }
                    resultado.sort((obj1, obj2) -> Double.compare(obj1.getPrecio(), obj2.getPrecio()));
                    break;
                case 3: //mis inmuebles por rating
                    for(InmueblePreview i : Database.getMisInmueblesPreview()){
                        resultado.add(i);
                        huboResultados = true;
                    }
                    resultado.sort((obj1, obj2) -> Double.compare(obj1.getRating(), obj2.getRating()));
                    Collections.reverse(resultado);
                    break;
            }
            if (huboResultados) {
                this.containerPanel.removeAll();
                for (InmueblePreview i : resultado) {
                    this.containerPanel.add(i);
                }
                this.scrollPane.setViewportView(containerPanel);
            } else { //si no hubo resultados muestra todos los inmuebles del anfitrion
                JOptionPane.showMessageDialog(this, "No se encontraron resultados para: " + this.search.getText(), "No se encontraron resultados", JOptionPane.WARNING_MESSAGE);
                this.containerPanel.removeAll();
                for (InmueblePreview panel : Database.getMisInmueblesPreview()) {
                    containerPanel.add(panel);
                }
                this.scrollPane.setViewportView(containerPanel);
            }
        }
        if((persona.equals("anfitrion"))&&(Database.getCurrentUser().getFirst()instanceof Admin)) {//busca los inmuebles del anfitrion según filtros para enseñarselo al admin
            Anfitrion anf = Database.getAnfitrionVerMas();
            ArrayList<InmueblePreview> resultado = new ArrayList<>();
            boolean huboResultados = false;
            switch (this.filtros.getSelectedIndex()){
                case 0: //por nombre
                    for (InmueblePreview i : Database.getInmueblePreview()) {
                        if(i.getAnfitrion().equals(anf)) {
                            if (i.getNombre().contains(this.search.getText())) {
                                resultado.add(i);
                                huboResultados = true;
                            }
                        }
                    }
                    break;
                case 1: //mis inmuebles por ciudad
                    for (InmueblePreview i : Database.getInmueblePreview()) {
                        if(i.getAnfitrion().equals(anf)) {
                            if (i.getNombre().contains(this.search.getText())) {
                                resultado.add(i);
                                huboResultados = true;
                            }
                        }
                    }
                    break;
                case 2: //mis inmuebles por precio
                    for (InmueblePreview i : Database.getInmueblePreview()) {
                        if (i.getAnfitrion().equals(anf)) {
                            resultado.add(i);
                            huboResultados = true;
                        }
                    }
                    resultado.sort((obj1, obj2) -> Double.compare(obj1.getPrecio(), obj2.getPrecio()));
                    break;
                case 3: //mis inmuebles por rating
                    for (InmueblePreview i : Database.getInmueblePreview()) {
                        if (i.getAnfitrion().equals(anf)) {
                            resultado.add(i);
                            huboResultados = true;
                        }
                    }
                    resultado.sort((obj1, obj2) -> Double.compare(obj1.getRating(), obj2.getRating()));
                    Collections.reverse(resultado);
                    break;
            }
            if (huboResultados) {
                this.containerPanel.removeAll();
                for (InmueblePreview i : resultado) {
                    this.containerPanel.add(i);
                }
                this.scrollPane.setViewportView(containerPanel);
            } else { //si no hubo resultados muestra todos los inmuebles del anfitrion
                JOptionPane.showMessageDialog(this, "No se encontraron resultados para: " + this.search.getText(), "No se encontraron resultados", JOptionPane.WARNING_MESSAGE);
                this.containerPanel.removeAll();
                for (InmueblePreview i : Database.getInmueblePreview()) {
                    if (i.getAnfitrion().equals(anf)) {
                        containerPanel.add(i);
                    }
                }
                this.scrollPane.setViewportView(containerPanel);
            }
        }
    }

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> filtros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> menuOpciones;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTextField search;
    private javax.swing.JButton searchInmueble;
    private JPanel containerPanel;
    private int filtro;
    // End of variables declaration//GEN-END:variables

    private String persona;
}