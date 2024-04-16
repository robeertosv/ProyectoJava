package com.rk.javabnb.Inmuebles;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.*;

public class verInmueble extends JFrame{
    private JPanel verInmueblePanel;
    private JButton reservarButton;
    private JScrollPane descipcionScrollPanel;
    //todo añadir fotos

    public verInmueble(String texto) { //pasar texto de inmueble.toString()
        super("verInmueble");
        JTextArea descipcionTextArea = new JTextArea(texto);
        descipcionTextArea.setEditable(false);
        descipcionTextArea.setLineWrap(true);
        JScrollPane descipcionScrollPanel = new JScrollPane(descipcionTextArea);
        reservarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //todo cambiar a reservarInmueble
            }
        });
    }




}
