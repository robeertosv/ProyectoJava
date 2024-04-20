package com.rk.javabnb.Inmuebles;

import com.rk.javabnb.db.Database;

import javax.swing.*;
import java.io.Serializable;
import java.util.ArrayList;
//import com.rk.javabnb.Usuarios.Anfitrion;

public class Inmueble implements Serializable {
    private double calificacion = 0;
    private DatosInmueble datos;
    private Direccion direccion;
    private ArrayList<String> fotografias;
    private double precio;
    private ArrayList<String> servicios;
    private char tipo;
    public String titulo;
    public String desc;
    //todo anadir anfitrion

    public Inmueble(String titulo, char tipo, ArrayList<String> servicios, int precio, ArrayList<String> fotografias, Direccion direccion, DatosInmueble datos){
        this.titulo = titulo;
        this.tipo = tipo;
        this.servicios = servicios;
        this.precio = precio;
        this.fotografias = fotografias;
        this.direccion = direccion;
        this.datos = datos;
        new InmueblePreview(this);
    }

    public String getNombre() { return this.titulo; }
    public String getDesc() { return this.desc; }

    public double getPrecio() { return this.precio;}
    public double getCalificacion() { return this.calificacion;}
    public void setCalificacion(double nota) {
        this.calificacion = nota;
        for(InmueblePreview i : Database.inmueblePreviews) {
            if(i.getNombre().equals(this.titulo)) {
                int idx = Database.inmueblePreviews.indexOf(i);
                InmueblePreview p = Database.inmueblePreviews.get(idx);
                p.setRating(nota);

                System.out.println(Database.getInmueblePreview());
            }
        }
    }

    public String getCiudad() { return this.direccion.getCiudad(); }


    public String serviciosToString(){
        String text = "";
        for (String servicio : servicios) {
            text+=servicio + ", ";
        }
        String textoSinComa = text.substring(0, text.length()-2);
        return textoSinComa;
    }

    //metodo que calcula el precio total dependiendo de la cantidad de personas y de noches

    /*public String toString(){
        return datos.toString()+"\n"+"Direccion: "+this.direccion.toStringShort()+"\nPrecio mínimo por noche: "+this.precio+"\nServicios: "+this.serviciosToString()+"\nCalificacion: "+this.calificacion;
    }*/


}