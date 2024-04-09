package com.rk.javabnb.Usuarios;

import java.io.Serializable;

public class Inmueble implements Serializable {
    private double calificacion;
    private DatosInmueble datos;
    private Direccion direccion;
    private String[] fotografias; //por que es un string? arraylist?
    private int precio;
    private String[] servicios; //y si hacemos mejor un arraylist?
    private char tipo;
    public String titulo;

    public Inmueble(String titulo, char tipo, String[] servicios, int precio, String[] fotografias, Direccion direccion, DatosInmueble datos){
        this.titulo = titulo;
        this.tipo = tipo; //hola amor
        this.servicios = servicios;
        this.precio = precio;
        this.fotografias = fotografias;
        this.direccion = direccion;
        this.datos = datos;
        calificacion = 0;
    }
}
