package com.rk.javabnb.Usuarios;

import java.io.Serializable;
import java.time.LocalDate;

public class Anfitrion extends Cliente implements Serializable {
    //y sus datos bancarios?
    private LocalDate fechaRegistro;
    private boolean superAnfitrion;

    public Anfitrion() {
        this.fechaRegistro = LocalDate.now();
        this.superAnfitrion = false;
    }

    public void crearInmueble(Inmueble inmueble) {}

    public void modificarInmueble(Inmueble inmueble) {}
    //para que quieres introducir el parametro int aqui?
}
