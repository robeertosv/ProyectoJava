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

    /**@return la calle del inmueble*/
    public String getCalle() {return this.calle;}
    /**@return la ciudad del inmueble*/
    public String getCiudad() {return this.ciudad;}
    /**@return el número de la calle del inmueble*/
    public int getNumero() {return this.numero;}
    /**@return el código postal del inmueble*/
    public int getCp() {return this.cp;}

    public String toStringShort(){return this.ciudad + " " + this.calle;}
}
