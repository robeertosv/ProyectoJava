package com.rk.javabnb.Usuarios;

import java.io.Serializable;

public class Cliente implements Serializable {
    private String clave;
    private String DNI;
    private String email;
    private String nombre;
    private int tfno;


    public void registrar(String clave, String DNI, String email, String nombre, int tfno) {
        //COMPROBAR SI YA EXISTE con un if de email? y es el constructor, hace falta llamar el metodo registrar?

        this.clave = clave;
        this.DNI = DNI;
        this.email = email;
        this.nombre = nombre;
        this.tfno = tfno;
    }

    public void login(String email, String clave) {
        //SetLoginState
    }

    public void modificarDatos(){}

}
