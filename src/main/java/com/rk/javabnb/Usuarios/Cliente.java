package com.rk.javabnb.Usuarios;

import com.rk.javabnb.db.DataHandler;

import java.io.Serializable;
import java.util.ArrayList;

public class Cliente implements Serializable {
    private String clave;
    private String DNI;
    private String email;
    private String nombre;
    private int tfno;

    public Cliente(String clave, String DNI, String email, String nombre, int tfno){

    }

    public void registrar(String clave, String DNI, String email, String nombre, int tfno) {
        if(correos.contains(email)){
            System.out.println("El email ya existe");
        }else{ //verificar que el telefono tiene nueve digitos etc...
            this.clave = clave;
            this.DNI = DNI;
            this.email = email;
            this.nombre = nombre;
            this.tfno = tfno;
            dataHandler.actualizarClientes(this);
        }
    }

    public void login(String email, String clave) {
        //SetLoginState
    }

    public void modificarDatos(){}

    public String getEmail() {return email;}
}
