package com.rk.javabnb.Inmuebles;

import javax.swing.*;
import java.io.Serializable;
import java.util.ArrayList;
//import com.rk.javabnb.Usuarios.Anfitrion;

public class Inmueble implements Serializable {
    private double calificacion;
    private DatosInmueble datos;
    private Direccion direccion;
    private ArrayList<String> fotografias; //por que es un string? arraylist?
    private int precio;
    private ArrayList<String> servicios; //y si hacemos mejor un arraylist?
    private char tipo;
    public String titulo;

    //todo anadir anfitrion

    public Inmueble(String titulo, char tipo, ArrayList<String> servicios, int precio, ArrayList<String> fotografias, Direccion direccion, DatosInmueble datos){
        this.titulo = titulo;
        this.tipo = tipo;
        this.servicios = servicios;
        this.precio = precio;
        this.fotografias = fotografias;
        this.direccion = direccion;
        this.datos = datos;
        calificacion = 0;
    }

   

    public String serviciosToString(){
        String text = "";
        for (String servicio : servicios) {
            text+=servicio + ", ";
        }
        String textoSinComa = text.substring(0, text.length()-2);
        return textoSinComa;
    }

    //metodo que calcula el precio total dependiendo de la cantidad de personas y de noches

    public String toString(){
        return datos.toString()+"\n"+"Direccion: "+this.direccion.toStringShort()+"\nPrecio mínimo por noche: "+this.precio+"\nServicios: "+this.serviciosToString()+"\nCalificacion: "+this.calificacion;
    }


}
