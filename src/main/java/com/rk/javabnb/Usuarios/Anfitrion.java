package com.rk.javabnb.Usuarios;

import com.rk.javabnb.Inmuebles.Inmueble;
import com.rk.javabnb.db.DataHandler;

import java.io.Serializable;
import java.time.LocalDate;

public class Anfitrion extends Cliente implements Serializable {
    //y sus datos bancarios?
    private LocalDate fechaRegistro;
    private boolean superAnfitrion;

    public Anfitrion(String clave, String DNI, String email, String nombre, int tfno, DataHandler dataHandler) {
        super(clave, DNI, email, nombre, tfno,dataHandler);
        this.fechaRegistro = LocalDate.now();
        this.superAnfitrion = false;
    }

    public void crearInmueble(Inmueble inmueble) {}

    public void modificarInmueble(Inmueble inmueble) {}
    //para que quieres introducir el parametro int aqui?
}
