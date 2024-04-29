package com.rk.javabnb.Inmuebles;

import java.io.Serializable;

public class Direccion implements Serializable {
    private String calle;
    private String ciudad;
    private int cp;
    private int numero;
    private String nombre;
    private static int num = 1; //diferencia las distintas direcciones creadas

    public Direccion(String ciudad, String calle, int numero, int cp) {
        this.ciudad = ciudad;
        this.calle = calle;
        this.numero = numero;
        this.cp = cp;
        nombre = "direccion" + num;
        num+=1;
    }

    public String getCalle() {return this.calle;}
    public String getCiudad() {return this.ciudad;}
    public int getNumero() {return this.numero;}
    public int getCp() {return this.cp;}
    public void setCalle(String calle) {this.calle = calle;}
    public void setCiudad(String ciudad) {this.ciudad = ciudad;}
    public void setCp(int cp) {this.cp = cp;}
    public void setNumero(int numero) {this.numero = numero;}

    public String toStringShort(){
        return calle+", "+ciudad;
    }
}
