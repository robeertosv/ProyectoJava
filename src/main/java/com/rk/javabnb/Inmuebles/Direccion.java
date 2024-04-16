package com.rk.javabnb.Inmuebles;

import com.rk.javabnb.db.DataHandler;

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

    public String getCalle() {return calle;}
    public String getCiudad() {return ciudad;}
    public int getNumero() {return numero;}
    public int getCp() {return cp;}
    public void setCalle(String calle) {this.calle = calle;}
    public void setCiudad(String ciudad) {this.ciudad = ciudad;}
    public void setCp(int cp) {this.cp = cp;}
    public void setNumero(int numero) {this.numero = numero;}
}
