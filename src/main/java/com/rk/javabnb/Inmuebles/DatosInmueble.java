package com.rk.javabnb.Inmuebles;

import java.io.Serializable;

public class DatosInmueble implements Serializable {
    private int banos;
    private int camas;
    private int habitaciones;
    private int maxHuespedes;
    private String descripcion;

    public DatosInmueble(int banos, int camas, int habitaciones, int maxHuespedes, String descripcion) {
        this.banos = banos;
        this.camas = camas;
        this.habitaciones = habitaciones;
        this.maxHuespedes = maxHuespedes;
        this.descripcion = descripcion;
    }

    public int getBanos() {return banos;}
    public int getCamas() {return camas;}
    public int getHabitaciones() {return habitaciones;}
    public int getMaxHuespedes() {return maxHuespedes;}
    public String getDescripcion() {return descripcion;}

    public void setBanos(int banos) {this.banos = banos;}
    public void setCamas(int camas) {this.camas = camas;}
    public void setHabitaciones(int habitaciones) {this.habitaciones = habitaciones;}
    public void setMaxHuespedes(int maxHuespedes) {this.maxHuespedes = maxHuespedes;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}

    public String toString() {
        return descripcion + "\nDetalles: "+habitaciones+"habitaciones, "+camas+"camas, "+banos+"baños, "+maxHuespedes+"el máximo de huéspedes";
    }
}
