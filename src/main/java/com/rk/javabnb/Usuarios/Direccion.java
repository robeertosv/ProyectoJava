package com.rk.javabnb.Usuarios;

import java.io.Serializable;

public class Direccion implements Serializable {
    private String calle;
    private String ciudad;
    private int cp;
    private int numero;

    public Direccion(String ciudad, String calle, int numero, int cp) {
        this.ciudad = ciudad;
        this.calle = calle;
        this.numero = numero;
        this.cp = cp;
    }
}
