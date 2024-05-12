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
        inmueble.addReserva(this);
        this.generarFactura();
        Database.save();
    }

    /**@return la fecha de la entrada de la reserva*/
    public LocalDate getEntrada(){return this.fechaEntrada;}
    /**@return la fecha de la salida de la reserva*/
    public LocalDate getSalida(){return this.fechaSalida;}
    /**@return la fecha de la creación de la reserva*/
    public LocalDate getCreacion(){return this.fechaCreacion;}
    /**@return al anfitrion del inmueble de la reserva*/
    public Anfitrion getAnfitrion(){return this.inmueble.getAnfitrion();}
    /**@return el nombre del anfitrion del inmueble de la reserva*/
    public String nombreAnfitrion(){return this.getAnfitrion().getNombre();}

    /**
     * reformatea la fecha a un string para mostrarla
     * @param fecha es la fecha que hay que reformatear
     * @return la fecha como un String
     */
    public String fechaToString(LocalDate fecha){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaString = fecha.format(formatter);
        return fechaString;
    }

    /**
     * @return los huespedes de la reserva como un string
     */
    public String getHuespedesString(){
        String huespedesString = String.valueOf(huespedes);
        return huespedesString;
    }
    /**@return el número de los huéspedes de la reserva*/
    public int getHuespedes(){return this.huespedes;}
    /**@return el inmueble de la reserva*/
    public Inmueble getInmueble() {
        return this.inmueble;
    }
    /**@return al cliente particular que ha hecho la reserva*/
    public ClienteParticular getParticular() {return this.cliente;}
    /**añade la reserva al AL de reservas del cliente particular
     * @param reserva es la reserva que se ha hecho
     * */
    public void addReservaParticular(Reserva reserva) {
        this.cliente.addReserva(this);
    }
    /**añade la reserva al AL de reservas del anfitrion
     * @param reserva es la reserva que se ha hecho
     * */
    public void addReservaAnfitrion(Reserva reserva) {
        this.getAnfitrion().addReserva(this);
    }

    /**
     * calcula el precio de la reserva, mirando cuantos dias hay entre la entrada y la salida, si el cliente es VIP o no
     * @return el precio de la reserva
     */
    public double calcularPrecio() {
        long dias = DAYS.between(fechaEntrada, fechaSalida);
        double precio = this.inmueble.getPrecio()*dias;
        if(this.cliente.isVIP){
            precio = precio*0.9;
        }
        precio=precio*100;
        if(precio%1>=0.5){
            precio = Math.ceil(precio);
        }else{
            precio = Math.floor(precio);
        }
        precio = precio/100;
        this.precio = precio;
        return precio;
    }

    /**mira si la reserva está en el futuro o en el pasado
     * @return true si la fecha de la entrada está en el futuro
     */
    public boolean cancelable(){
        boolean cancel = false;
        LocalDate today = LocalDate.now();
        if(!(today.isAfter(this.fechaEntrada))|| today.isEqual(this.fechaEntrada)){
            cancel = true;
        }
        return cancel;
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
            salida.println("Subtotal: " + this.precio);
            if(this.cliente.isVIP) {
                salida.println("Descuentos: " +"Sí");
                salida.println("TOTAL: " + this.precio);
            }else {
                salida.println("Descuentos: " +"NO");
                salida.println("TOTAL: " + this.precio);
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

    /**@return el precio de la reserva*/
    public double getPrecio() { return this.precio; }
    /**@return el inmueble y el nombre del cliente particular de la reserva como String*/
    public String toString(){
        return this.inmueble.toString()+this.cliente.getNombre();
    }
}

