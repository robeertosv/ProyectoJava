/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.rk.javabnb.UI;

import com.rk.javabnb.Inmuebles.Inmueble;
import com.rk.javabnb.Inmuebles.InmueblePreview;
import com.rk.javabnb.Usuarios.Cliente;
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
    public Home() {
        initComponents();
        this.setVisible(true);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));

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

        filtros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Ciudad", "Menores precios", "Mejor rating"}));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(11, 11, 11, 11);
        jPanel1.add(filtros, gridBagConstraints);

        search.setText("Search something");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 26;
        gridBagConstraints.insets = new java.awt.Insets(11, 11, 11, 11);
        jPanel1.add(search, gridBagConstraints);

        menuOpciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Roberto", "Cerrar Sesión" }));
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
            //Cerrar sesión
            case 1:
                Database.cerrarSesion();
                new Login();
                this.dispose();
                break;
        }
    }//GEN-LAST:event_menuOpcionesActionPerformed

    private void searchInmuebleActionPerformed(java.awt.event.ActionEvent evt) {
        //BUSCAR BUSCAR Y MOSTRAR INMUEBLES
        ArrayList<InmueblePreview> resultado = new ArrayList<>();
        boolean huboResultados = false;
        switch(this.filtros.getSelectedIndex()) {
            //Buscar por nombre
            case 0:
                for(InmueblePreview i : Database.getInmueblePreview()) {
                    if(i.getNombre().equals(this.search.getText())) {
                        resultado.add(i);
                        huboResultados = true;
                    }
                }
            break;
            //Buscar por ciudad
            case 1:
                for(InmueblePreview i : Database.getInmueblePreview()) {
                    if(i.getCiudad().equals(this.search.getText())) {
                        resultado.add(i);
                        huboResultados = true;
                    }
                }
            break;
            //Por precios (Menor a mayor)
            case 2:
                for(InmueblePreview i : Database.getInmueblePreview()) {
                    resultado.add(i);
                    huboResultados = true;
                }
                resultado.sort((obj1, obj2) -> Double.compare(obj1.getPrecio(), obj2.getPrecio()));
                break;
            //Mejores ratings
            case 3:
                for(InmueblePreview i : Database.getInmueblePreview()) {
                    resultado.add(i);
                    huboResultados = true;
                    System.out.println(i.getRating());
                }
                resultado.sort((obj1, obj2) -> Double.compare(obj1.getRating(), obj2.getRating()));
                Collections.reverse(resultado);
                break;
        }

        if(huboResultados) {
            this.containerPanel.removeAll();
            for(InmueblePreview i : resultado) {
                this.containerPanel.add(i);
            }
            this.scrollPane.setViewportView(containerPanel);
        } else {
            JOptionPane.showMessageDialog(this, "No se encontraron resultados para: " + this.search.getText(), "No se encontraron resultados", JOptionPane.WARNING_MESSAGE);
            this.containerPanel.removeAll();
            for(InmueblePreview panel : Database.getInmueblePreview()) {
                containerPanel.add(panel);
            }
            this.scrollPane.setViewportView(containerPanel);
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
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
}
