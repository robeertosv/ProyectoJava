package com.rk.javabnb.Inmuebles;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VerInmueble extends JFrame{
    private JPanel verInmueblePanel;
    private JButton reservarButton;
    private JScrollPane descipcionScrollPanel;
    //todo añadir fotos

    public VerInmueble(String texto) { //pasar texto de inmueble.toString()
        super("Inmueble");
        JTextArea descipcionTextArea = new JTextArea(texto);
        descipcionTextArea.setEditable(false);
        descipcionTextArea.setLineWrap(true);
        JScrollPane descipcionScrollPanel = new JScrollPane(descipcionTextArea);
        getContentPane().add(descipcionScrollPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        pack();
        reservarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //todo cambiar a reservarInmueble
            }
        });
    }

}
