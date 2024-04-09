package com.rk.javabnb.Usuarios;

import java.io.Serializable;

public class DatosInmueble implements Serializable {
    private int banos;
    private int camas;
    private int habitaciones;
    private int maxHuespedes;

    public DatosInmueble(int banos, int camas, int habitaciones, int maxHuespedes) {
        this.banos = banos;
        this.camas = camas;
        this.habitaciones = habitaciones;
        this.maxHuespedes = maxHuespedes;
    }

    public int getBanos() {return banos;}
    public int getCamas() {return camas;}
    public int getHabitaciones() {return habitaciones;}
    public int getMaxHuespedes() {return maxHuespedes;}
    public void setBanos(int banos) {this.banos = banos;}
    public void setCamas(int camas) {this.camas = camas;}
    public void setHabitaciones(int habitaciones) {this.habitaciones = habitaciones;}
    public void setMaxHuespedes(int maxHuespedes) {this.maxHuespedes = maxHuespedes;}
}
