package com.rk.javabnb.Inmuebles;

import java.io.Serializable;
import java.util.ArrayList;

public class DatosInmueble implements Serializable {
    private int banos;
    private int camas;
    private int habitaciones;
    private int maxHuespedes;
    private String descripcion;
    private String nombre;
    private static int num = 1; //sirve para diferenciar los distintos datos creados

    /**
     * Constructor para los Datos de un Inmueble
     * @param banos Numero de baños
     * @param camas Número de camas
     * @param habitaciones Cantidad de habitaciones
     * @param maxHuespedes Cantidad máxima de huéspedes admitidos
     * @param  descripcion Descripcion del inmueble
     * */
    public DatosInmueble(int banos, int camas, int habitaciones, int maxHuespedes, String descripcion) {
        this.banos = banos;
        this.camas = camas;
        this.habitaciones = habitaciones;
        this.maxHuespedes = maxHuespedes;
        this.descripcion = descripcion;
        nombre = "datosIn"+num;
        num+=1;
    }

    /**@return devuelve el número de baños del inmueble*/
    public int getBanos() {return banos;}
    /**@return el número de las camas del inmueble*/
    public int getCamas() {return camas;}
    /**@return el número de habitaciones del inmueble*/
    public int getHabitaciones() {return habitaciones;}
    /**@return el número máximo de huéspedes del inmueble, por ejemplo para verificar que este límite no se
     * sobrepasa en las reservas
     */
    public int getMaxHuespedes() {return maxHuespedes;}
    /**@return la descripción del inmueble*/
    public String getDescripcion() {return descripcion;}

    /**@param banos es el número de baños que tiene el inmueble*/
    public void setBanos(int banos) {this.banos = banos;}
    /**@param camas es el número de camas que tiene el inmueble*/
    public void setCamas(int camas) {this.camas = camas;}
    /**@param habitaciones es el número de habitaciones que tiene el inmueble*/
    public void setHabitaciones(int habitaciones) {this.habitaciones = habitaciones;}
    /**@param maxHuespedes es el número máximo de huéspedes que puede alojar el inmueble*/
    public void setMaxHuespedes(int maxHuespedes) {this.maxHuespedes = maxHuespedes;}
    /**@param descripcion es la descripcion del inmueble*/
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}

    /**@return los detalles del inmueble para visualizarlos*/
    public String toString() {
        return descripcion + "\nDetalles: "+habitaciones+" habitaciones, "+camas+" camas, "+banos+" baños.";
    }
}
