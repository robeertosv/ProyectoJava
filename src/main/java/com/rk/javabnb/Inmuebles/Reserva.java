package com.rk.javabnb.Inmuebles;

import com.rk.javabnb.Usuarios.Anfitrion;
import com.rk.javabnb.Usuarios.Cliente;
import com.rk.javabnb.Usuarios.ClienteParticular;
import com.rk.javabnb.db.Database;

import javax.swing.*;
import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
        inmueble.addReserva(this);
        this.generarFactura();
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

    public void generarFactura() {
        try{
            PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter(LocalDate.now()+"_"+LocalDateTime.now().getNano()+"_factura.txt")));
            salida.println("-------- CONFIRMACIÓN DE RESERVA --------");
            salida.println("JAVABNB                        "+ LocalDate.now());
            salida.println("*****************************************");
            salida.println("Datos del cliente");
            salida.println();
            salida.println("Nombre: " + this.cliente.getNombre());
            salida.println("Correo: " + this.cliente.getEmail());
            salida.println();
            salida.println("*****************************************");
            salida.println("Datos del inmueble");
            salida.println("Nombre: " + this.inmueble.getTitulo());
            salida.println("Habitaciones: " + this.inmueble.getDatos().getHabitaciones());
            salida.println("Camas: " + this.inmueble.getDatos().getCamas());
            salida.println("Huéspedes reservados: " + this.huespedes);
            salida.println("Fecha de entrada: " + this.fechaEntrada);
            salida.println("Fecha de salida: " + this.fechaSalida);
            salida.println();
            salida.println("*****************************************");
            salida.println("Datos bancarios");
            salida.println();
            salida.println("Método de pago: Tarjeta");
            String numeroTarjeta = this.cliente.getTarjetaS();
            String numero = numeroTarjeta.substring(numeroTarjeta.length()-4);
            salida.println("Nº: **** **** **** " + numero);
            salida.println("Titular: " + this.cliente.getTarjeta().getTitular() );
            salida.println("Subtotal: " + this.calcularPrecio());
            if(this.cliente.isVIP) {
                salida.println("Descuentos: " +"Sí");
                salida.println("TOTAL: " + this.calcularPrecio()*0.9);
            }else {
                salida.println("Descuentos: " +"NO");
                salida.println("TOTAL: " + this.calcularPrecio());
            }
            salida.println();
            salida.println("*****************************************");
            salida.println("Por favor, conserve este documento hasta\nla finalización de su estancia");
            salida.println();

            salida.close();
        }catch(IOException ioe) {
            System.out.println("Error de IO: "+ioe);
        }

    }
    public String toString(){
        return this.inmueble.toString()+this.cliente.getNombre();
    }
}

