package com.rk.javabnb.Usuarios;

import java.io.Serializable;
import java.time.LocalDate;

public class TarjetaCredito implements Serializable {
    private LocalDate caducidad;
    private int numero;
    private String titular;

    public TarjetaCredito(LocalDate caducidad, int numero, String titular) {
        this.caducidad = caducidad;
        this.numero = numero;
        this.titular = titular;
    }

    public LocalDate getCaducidad() {return caducidad;}
    public int getNumero() {return numero;}
    public String getTitular() {return titular;}

}
