package com.rk.javabnb.Inmuebles;
import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReservarInmueble {
    private JLabel numeroPersonasLabel;
    private JLabel fechaLlegadaLabel;
    private JLabel fechaSalidaLabel;
    private JLabel comentariosLabel;
    private JComboBox huespedesComboBox;
    private JPanel reservaPanel;
    private JTextArea comentariosTextArea;
    private JButton volverButton;
    private JButton reservarButton;

    public ReservarInmueble() {
        JFrame frame = new JFrame("Reservar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        reservaPanel = new JPanel();
        reservaPanel.setLayout(new GridBagLayout());

        numeroPersonasLabel = new JLabel("Número de personas:");
        fechaLlegadaLabel = new JLabel("Fecha de llegada:");
        fechaSalidaLabel = new JLabel("Fecha de salida:");
        comentariosLabel = new JLabel("Comentarios:");

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        reservaPanel.add(numeroPersonasLabel, gbc);

        gbc.gridy = 1;
        reservaPanel.add(fechaLlegadaLabel, gbc);

        gbc.gridy = 2;
        reservaPanel.add(fechaSalidaLabel, gbc);

        gbc.gridy = 3;
        reservaPanel.add(comentariosLabel, gbc);

        volverButton = new JButton("Volver al inmueble");
        reservarButton = new JButton("Reservar");

        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.weightx = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        reservaPanel.add(volverButton, gbc);

        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.weightx = 1;
        gbc.anchor = GridBagConstraints.LINE_END;
        reservaPanel.add(reservarButton, gbc);

        elegirFechas();
        numeroHuespedes(4);
        agregarComentarios();

        frame.getContentPane().add(reservaPanel);
        frame.pack();
        frame.setVisible(true);

        Font montserratFont = new Font("Montserrat", Font.PLAIN, 18);
        for (Component component : reservaPanel.getComponents()) {
            if (component instanceof JLabel || component instanceof JTextField || component instanceof JTextArea) {
                component.setFont(montserratFont);
            }
        }

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);

        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VerInmueble verInmueble = new VerInmueble("inmueble anterior"); //todo hacer que aparezca el inmueble anterior
            }
        });

        reservarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numPersonas = (String) huespedesComboBox.getSelectedItem();
                String fechaEntrada = ((JDateChooser) reservaPanel.getComponent(5)).getDate().toString();
                String fechaSalida = ((JDateChooser) reservaPanel.getComponent(6)).getDate().toString();
                String comentarios = comentariosTextArea.getText();
                ConfirmarReserva confirmar = new ConfirmarReserva(numPersonas, fechaEntrada, fechaSalida, comentarios);
            }
        });
    }

    public int numeroHuespedes (int max){
        String[] opciones = new String[max];
        for (int i = 0; i < max; i++) {
            opciones[i] = Integer.toString(i + 1);
        }
        huespedesComboBox = new JComboBox<>(opciones);
        String eleccion = (String) huespedesComboBox.getSelectedItem();
        int eleccionInt = Integer.parseInt(eleccion);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        reservaPanel.add(huespedesComboBox, gbc);
        return eleccionInt;
    }

    public void elegirFechas(){
        JDateChooser fechaEntradaChooser = new JDateChooser();
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        reservaPanel.add(fechaEntradaChooser, gbc);
        JDateChooser fechaSalidaChooser = new JDateChooser();
        GridBagConstraints gbc2 = new GridBagConstraints();
        gbc2.gridx = 1;
        gbc2.gridy = 2;
        reservaPanel.add(fechaSalidaChooser, gbc2);
        reservaPanel.revalidate();
        reservaPanel.repaint();
    }

    public void agregarComentarios() {
        comentariosTextArea = new JTextArea(5, 20); // 5 rows, 20 columns
        comentariosTextArea.setLineWrap(true); // enable line wrapping
        comentariosTextArea.setWrapStyleWord(true); // wrap at word boundaries
        JScrollPane scrollPane = new JScrollPane(comentariosTextArea); // add a scrollbar
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH; // expand in both directions
        reservaPanel.add(scrollPane, gbc);
    }
}
