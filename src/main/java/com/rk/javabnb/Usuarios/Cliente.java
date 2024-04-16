package com.rk.javabnb.Usuarios;

import com.rk.javabnb.db.DataHandler;

import javax.swing.*;
import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;

public class Cliente extends Component implements Serializable {
    private String clave;
    private String DNI;
    private String email;
    private String nombre;
    private int tfno;

    public Cliente(String clave, String DNI, String email, String nombre, int tfno, ArrayList<Cliente> clientes){
        for(Cliente c : clientes) {
            if(c.email.equals(email)){
                System.out.println("El email ya existe");
                //El usuario final no tiene acceso a los logs, por lo que se deberá mostrar por consola
                JOptionPane.showMessageDialog(this, "Ese correo ya está en uso", "Error de registro", JOptionPane.WARNING_MESSAGE);
            }
            else{
                String tfn = ""+tfno;
                if(tfn.length() != 9) {
                    JOptionPane.showMessageDialog(this, "El numero de teléfono está mal formateado", "Error", JOptionPane.WARNING_MESSAGE);
                } //verificar que el telefono tiene nueve digitos etc...

                this.clave = clave;
                this.DNI = DNI;
                this.email = email;
                this.nombre = nombre;
                this.tfno = tfno;
                clientes.add(c);
            }
        }
    }

    public void login(String email, String clave) {
        //Cuando arranque la app hay que mirar si existe SID.dat y se cargará la app siendo el usuario loggeado el que tenga el correo que aparece en ese archivo
        if(email.equals(this.email) && clave.equals(this.clave)) {
        }
    }

    public void modificarDatos(){}

    public String getEmail() {return this.email;}

}
