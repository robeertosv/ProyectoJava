package com.rk.javabnb.Usuarios;

import com.rk.javabnb.db.Database;

import java.io.Serializable;
import java.time.LocalDate;

public class TarjetaCredito implements Serializable {
    private LocalDate caducidad;
    private long numero;
    private String titular;

    public TarjetaCredito(LocalDate caducidad, long numero, String titular) {
        this.caducidad = caducidad;
        this.numero = numero;
        this.titular = titular;
    }

    public LocalDate getCaducidad() {return caducidad;}
    public long getNumero() {return numero;}
    public String getTitular() {return titular;}
    public void setTitular(String titular) {this.titular = titular;}
    public void setCaducidad(LocalDate caducidad) {this.caducidad = caducidad;}
    public void setNumero(long numero) {this.numero = numero;}

}
