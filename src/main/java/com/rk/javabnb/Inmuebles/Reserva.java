package com.rk.javabnb.Inmuebles;

import com.rk.javabnb.Usuarios.Cliente;

import java.time.LocalDate;

public class Reserva {
    private Inmueble inmueble;
    private Cliente cliente;
    private int huespedes;
    private String comentario;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;

    public Reserva(Inmueble inmueble, Cliente cliente, String comentario, LocalDate fechaEntrada, LocalDate fechaSalida, int huespedes) {
        this.inmueble = inmueble;
        this.cliente = cliente;
        this.comentario = comentario;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.huespedes = huespedes;
    }

    //todo confirmar que las fechas estan libres
}

