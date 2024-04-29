package com.rk.javabnb.Usuarios;

import com.rk.javabnb.Inmuebles.Reserva;
import com.rk.javabnb.db.DataChecker;
import com.rk.javabnb.db.Database;

import javax.swing.*;
import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;

public class Cliente extends Component implements Serializable{
    private String clave;
    private String dni;
    private String email;
    private String nombre;
    private int tfno;
    private ArrayList<Reserva> reservas = new ArrayList<Reserva>();

    private boolean noExiste = true;

    public Cliente(String clave, String DNI, String email, String nombre, int tfno){
            this.clave = clave;
            this.dni = DNI;
            this.email = email;
            this.nombre = nombre;
            this.tfno = tfno;
            Database.save();
    }

    public boolean checkPassword(char[] pass) {
        String passwd = String.valueOf(pass);
        return passwd.equals(this.clave);
        //verifica la contraseña
    }

    public String getEmail() {return this.email;}
    public String getNombre() { return this.nombre; }
    public String getDni() { return this.dni; }
    public String getTelefono(){
        String telefono = String.valueOf(this.tfno);
        return telefono;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
        Database.save();
    }
    public void setDni(String dni) {
        this.dni = dni;
        Database.save();
    }
    public void setEmail(String email) {
        this.email = email;
        Database.save();
    }
    public void setTelefono(int tfno) {
        this.tfno = tfno;
        Database.save();
    }
    
    public void addReserva(Reserva r){
        reservas.add(r);
        Database.save();
        //añade la reserva al cliente particular y al anfitrion
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }
    public void setClave(String clave) {
        this.clave = clave;
        Database.save();
    }

}
