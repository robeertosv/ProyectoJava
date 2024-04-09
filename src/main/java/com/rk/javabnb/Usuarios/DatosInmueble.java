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
}
