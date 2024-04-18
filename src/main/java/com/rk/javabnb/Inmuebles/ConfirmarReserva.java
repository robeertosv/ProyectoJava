package com.rk.javabnb.Inmuebles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConfirmarReserva {

    private JButton confirmarButton;

    public ConfirmarReserva(String huespedes, String entrada, String salida, String comentario){
        JFrame frame = new JFrame("Confirmación de la reserva");
        JTextArea textArea = new JTextArea("La reserva está hecha para "+huespedes+" huéspedes, a partir del día "
                + entrada + " hasta el día "+salida+".\nComentario: "+comentario);
        textArea.setEditable(false);
        textArea.setLineWrap(true);

        confirmarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "La reserva se ha hecho correctemanete");
            }
        });

        frame.add(textArea);
        frame.pack();
        frame.setVisible(true);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
    }
}
