package com.rk.javabnb.Usuarios;

import com.rk.javabnb.Inmuebles.PreReserva;
import com.rk.javabnb.db.DataHandler;
import com.rk.javabnb.db.Database;

import javax.swing.*;
import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;

public class Cliente extends Component implements Serializable{
    private String clave;
    private String DNI;
    private String email;
    private String nombre;
    private int tfno;
    private ArrayList<PreReserva> reservas = new ArrayList<PreReserva>();

    private boolean noExiste = true;

    public Cliente(String clave, String DNI, String email, String nombre, int tfno){

        for(Cliente c : Database.getPersonas()) {
            if(c.getEmail().equals(email)) {
                JOptionPane.showMessageDialog(this, "El correo ya está en uso", "Error de registro", JOptionPane.WARNING_MESSAGE);
                this.noExiste = false;
                break;
            }
        }

        if(noExiste) {
            this.clave = clave;
            this.DNI = DNI;
            this.email = email;
            this.nombre = nombre;
            this.tfno = tfno;
        }
    }

    protected boolean isNoExiste() {
        return this.noExiste;
    }
    public void login(String email, String clave) {
        //Cuando arranque la app hay que mirar si existe SID.dat y se cargará la app siendo el usuario loggeado el que tenga el correo que aparece en ese archivo
        if(email.equals(this.email) && clave.equals(this.clave)) {
        }
    }

    public void modificarDatos(){}

    public boolean checkPassword(char[] pass) {
        String passwd = String.valueOf(pass);

        return passwd.equals(this.clave) ? true : false;
    }

    public String getEmail() {return this.email;}
    public String getName() { return this.nombre; }

}
