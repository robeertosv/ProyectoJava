package com.rk.javabnb.Inmuebles;

import com.rk.javabnb.Usuarios.Anfitrion;
import com.rk.javabnb.Usuarios.Cliente;
import com.rk.javabnb.Usuarios.ClienteParticular;
import com.rk.javabnb.db.Database;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.time.temporal.ChronoUnit.DAYS;

public class Reserva implements Serializable {
    private Inmueble inmueble;
    private ClienteParticular cliente;
    private int huespedes;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private LocalDate fechaCreacion;
    private double precio;

    public Reserva(Inmueble inmueble, ClienteParticular cliente, LocalDate fechaEntrada, LocalDate fechaSalida, int huespedes) {
        this.inmueble = inmueble;
        this.cliente = cliente;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.huespedes = huespedes;
        this.fechaCreacion = LocalDate.now();
        this.precio = calcularPrecio();
        //this.cliente.addReserva(this);
        //this.getAnfitrion().addReserva(this);
        Database.addReserva(this);
        Database.save();
    }
    
    public LocalDate getEntrada(){return this.fechaEntrada;}
    public LocalDate getSalida(){return this.fechaSalida;}
    public LocalDate getCreacion(){return this.fechaCreacion;}
    public Anfitrion getAnfitrion(){return this.inmueble.getAnfitrion();}
    public String nombreAnfitrion(){return this.getAnfitrion().getNombre();}
    public String fechaToString(LocalDate fecha){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaString = fecha.format(formatter);
        return fechaString;
        //reformatea la fecha a un string para mostrarla
    }
    public String getHuespedesString(){
        String huespedesString = String.valueOf(huespedes);
        return huespedesString;
    }
    public Inmueble getInmueble() {
        return this.inmueble;
    }
    public ClienteParticular getParticular() {return this.cliente;}
    public void addReservaParticular(Reserva reserva) {
        this.cliente.addReserva(this);
    }
    public void addReservaAnfitrion(Reserva reserva) {
        this.getAnfitrion().addReserva(this);
    }
    public double calcularPrecio() {
        long dias = DAYS.between(fechaEntrada, fechaSalida);
        double precio = this.inmueble.getPrecio()*dias;
        return precio;
    }
    public String toString(){
        return this.inmueble.toString()+this.cliente.getNombre();
    }
}

