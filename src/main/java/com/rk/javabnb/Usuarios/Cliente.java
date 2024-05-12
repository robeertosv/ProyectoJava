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
            //Database.save();
    }

    /**
     * Comrpueba que la contraseña sea la correcta
     * @param pass es la contraseña a comprobar
     * @return true si la contraseña es correcta
     * */
    public boolean checkPassword(char[] pass) {
        String passwd = String.valueOf(pass);
        return passwd.equals(this.clave);
        //verifica la contraseña
    }

    /**@return el email del cliente*/
    public String getEmail() {return this.email;}
    /**@return el nombre del cliente*/
    public String getNombre() { return this.nombre; }
    /**@return el DNI del cliente*/
    public String getDni() { return this.dni; }
    /**@return el telefono del cliente*/
    public String getTelefono(){
        String telefono = String.valueOf(this.tfno);
        return telefono;
    }

    /**@param nombre hace que ese sea el nombre del cliente*/
    public void setNombre(String nombre) {
        this.nombre = nombre;
        Database.save();
    }

    /**@param dni hace que ese sea el DNI del cliente*/
    public void setDni(String dni) {
        this.dni = dni;
        Database.save();
    }

    /**@param email hace que ese sea el email del cliente*/
    public void setEmail(String email) {
        this.email = email;
        Database.save();
    }

    /**@param tfno hace que ese sea el teléfono del cliente*/
    public void setTelefono(int tfno) {
        this.tfno = tfno;
        Database.save();
    }
    
    /**
     * Asocia una reserva con un cliente
     * @param r la reserva
     * */
    public void addReserva(Reserva r){
        reservas.add(r);
        Database.save();
        //añade la reserva al cliente particular y al anfitrion
    }

    /**Devuelve las reservas de un cliente
     * @return las reservas de un cliente*/
    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    /**@param clave hace que esa sea la contraseña de un cliente*/
    public void setClave(String clave) {
        this.clave = clave;
        Database.save();
    }

}
