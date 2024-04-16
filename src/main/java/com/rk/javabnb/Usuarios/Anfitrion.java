package com.rk.javabnb.Usuarios;

import com.rk.javabnb.Inmuebles.Inmueble;
import com.rk.javabnb.db.DataHandler;

import javax.swing.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Anfitrion extends Cliente implements Serializable {
    //y sus datos bancarios?
    private LocalDate fechaRegistro;
    private boolean superAnfitrion;

    public Anfitrion(String clave, String DNI, String email, String nombre, int tfno, ArrayList<Cliente> clientes) {
        super(clave, DNI, email, nombre, tfno, clientes);
        this.fechaRegistro = LocalDate.now();
        this.superAnfitrion = false;
        //anadir readObject
    }

    public void crearInmueble(Inmueble inmueble) {

    }

    public void modificarInmueble(Inmueble inmueble) {}
}
