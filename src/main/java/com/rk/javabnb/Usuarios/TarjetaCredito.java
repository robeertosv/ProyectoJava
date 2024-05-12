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
        Database.save();
    }

    /**@return el numero de la tarjeta*/
    public long getNumero() {return numero;}
    /**@return el Titular de la tarjeta*/
    public String getTitular() {return titular;}

    /**@param numero de esta tarjeta*/
    public void setNumero(long numero) {this.numero = numero;}

    /**
     * Sirve para mostrar el numero de la tarjeta como String
     * @return el numero de la tarjeta como String*/
    public String getNumeroS(){
        String num = String.valueOf(this.numero);
        return num;
    }

}
