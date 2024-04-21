package com.rk.javabnb.Inmuebles;

import com.rk.javabnb.db.Database;

public class InmueblePreview extends javax.swing.JPanel {
    public InmueblePreview(Inmueble i) {
        this.inmueble = i;
        initComponents();
        this.nombre.setText(i.getNombre());
        this.desc.setText(i.getDesc());
        this.rating.setText(i.getCalificacion() + "/5");
        this.precio.setText(String.valueOf(i.getPrecio()) + "€");

        this.ratingD = i.getCalificacion();
        this.precioD = i.getPrecio();
        this.ciudad = i.getCiudad();
        Database.save();
    }

    public String getNombre() { return this.nombre.getText(); }
    public String getCiudad() { return this.ciudad; }
    public double getPrecio() { return this.precioD; }
    public double getRating() { return  this.ratingD; }
    public void setRating(double nota) {
        this.ratingD = nota;
        this.rating.setText(nota + "/5");
        Database.save();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        nombre = new javax.swing.JLabel();
        desc = new javax.swing.JLabel();
        precio = new javax.swing.JLabel();
        rating = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        showMore = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setLayout(new java.awt.GridBagLayout());

        nombre.setFont(new java.awt.Font("Montserrat", 3, 24)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 9;
        add(nombre, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        add(desc, gridBagConstraints);

        precio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        precio.setAlignmentX(0.5F);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 24;
        add(precio, gridBagConstraints);

        rating.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipady = 14;
        add(rating, gridBagConstraints);

        jLabel5.setText("                                                                                                                        ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(jLabel5, gridBagConstraints);

        showMore.setText("Ver más");
        showMore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showMoreActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 9;
        add(showMore, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void showMoreActionPerformed(java.awt.event.ActionEvent evt) {
        //Crear la página del Inmueble y poder gestionar la reserva desde ahí
        new PreReserva(this.inmueble);
    }


    private double ratingD;
    private double precioD;
    private String ciudad;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel desc;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel precio;
    private javax.swing.JLabel rating;
    private javax.swing.JButton showMore;
    private Inmueble inmueble;
    // End of variables declaration//GEN-END:variables
}