package com.rk.javabnb.Inmuebles;

import com.rk.javabnb.Usuarios.ClienteParticular;
import com.rk.javabnb.db.Database;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import com.rk.javabnb.Usuarios.Anfitrion;

public class Inmueble implements Serializable {
    private double calificacion = 0;
    private int vecesValorado = 0;
    private int sumaCalificaciones = 0;
    private DatosInmueble datos;
    private Direccion direccion;
    private double precio;
    private String servicios;
    private char tipo;
    public String titulo;
    private ArrayList<Reserva> reservas = new ArrayList<>();
    private Anfitrion anfitrion;
    private String nombre;
    private static int num = 1; //diferencia los distintos inmuebles creados

    public Inmueble(String titulo, char tipo, String servicios, double precio, Direccion direccion, DatosInmueble datos, Anfitrion anfitrion){
        this.titulo = titulo;
        this.tipo = tipo;
        this.servicios = servicios;
        this.precio = precio;
        this.direccion = direccion;
        this.datos = datos;
        this.anfitrion = anfitrion;
        anfitrion.addInmueble(this);
        Database.addInmueble(this);
        nombre = "inmueble"+num;
        num += 1;
        Database.save();
    }

    public String getNombre() { return this.titulo; }
    public int getMHuespedes(){return this.datos.getMaxHuespedes();}
    public ArrayList<Reserva> getReservas(){return this.reservas;}
    public void addReserva(Reserva reserva){this.reservas.add(reserva);}
    public double getPrecio() { return this.precio;}
    public double getCalificacion() { return this.calificacion;}
    public String getCiudad() { return this.direccion.getCiudad(); }
    public String getDireccion() {
        Direccion d = this.direccion;
        return  d.getCalle() + ", " + d.getNumero() + ", " + d.getNumero() + ", "+ d.getCiudad();
    }
    public Direccion getDireccion2() {return this.direccion;}
    public String getServicios() {
        return this.servicios;
    }
    public DatosInmueble getDatos() {
        return this.datos;
    }
    public String getTipo() {
        if(this.tipo == 'c') {
            return "Casa";
        } else {
            return "Apartamento";
        }
    }
    public Anfitrion getAnfitrion() {return this.anfitrion;}
    public String getTitulo(){return this.titulo;}
    public String getAnfitrionNombre(){
        Anfitrion a = this.anfitrion;
        return a.getNombre();
    }
    public int getVecesValorado() {return this.vecesValorado;}
    public int getSumaCalificaciones() {return this.sumaCalificaciones;}

    public void setTipo(String tipo) {
        char tipoChar = 'x';
        if(tipo.equals("Apartamento")){
            tipoChar = 'a';
        }else if(tipo.equals("Casa")){
            tipoChar = 'c';
        }
        this.tipo = tipoChar;
    }
    public void setTitulo(String titulo) {this.titulo = titulo;}
    public void setDireccion(String ciudad, String calle, int numero, int cp){
        this.direccion = new Direccion(ciudad,calle,numero,cp);
    }
    public void setDatos(int banos, int camas, int habitaciones, int maxHuespedes, String descripcion){
        this.datos = new DatosInmueble(banos, camas, habitaciones, maxHuespedes, descripcion);
    }
    public void setPrecio(double precio) {this.precio = precio;}
    public void setServicios(String servicios) {this.servicios = servicios;}


    public void addResena(int x){
        vecesValorado +=1;
        sumaCalificaciones+=x;
        this.calificacion = sumaCalificaciones/ vecesValorado;
        if(this.calificacion>4){
            this.anfitrion.setSuper(true);
        }else{this.anfitrion.setSuper(false);}
        try {
            ClienteParticular cliente = (ClienteParticular) Database.getCurrentUser().getFirst();
            cliente.addInmuebleValorado(this);
            Database.save();
        }catch(Exception e) {
            System.out.println(e);

        }
        //calcula una nueva media de reseñas, actualiza la calificacion y mira si el anfitrion se ha vuelto superanfitrion o ha dejado de serlo
    }
    public boolean verDisponibilidad(LocalDate fechaEntrada, LocalDate fechaSalida){
        boolean disponible = false;
        int nreservas = this.getReservas().size();
        boolean futuro = false;
        boolean orden = false;
        LocalDate today = LocalDate.now();
        if(today.isBefore(fechaEntrada)&&today.isBefore(fechaSalida)){
            futuro = true;
        }
        for(Reserva reserva:this.getReservas()){
            LocalDate entrada = reserva.getEntrada();
            LocalDate salida = reserva.getSalida();
            if(!((entrada.isAfter(fechaEntrada)&&entrada.isBefore(fechaSalida))||(salida.isAfter(fechaEntrada)&&salida.isBefore(fechaSalida)))){
                nreservas = nreservas - 1;
            }
        }
        if(nreservas==0){disponible=true;}//ve si el número de las reservas coincide con el número de las reservas que no intervendrían con la nueva, si es cero, entonces se puede hacer la reserva, ya que todas las reservas no intervienen
        if(fechaEntrada.isBefore(fechaSalida)){orden = true;}
        return disponible&&futuro&&orden;
        //verifica que no haya ningún inicio o fin de otra reserva hecha previamente en las fechas de la nueva reserva
        //tambien verifica si las fechas introducidas se encuentran en el futuro
        //tambien mira que la fecha de entrada es antes de la fecha de salida
    }
    public int borrarInmueble(){
        int reservas = 0;
        LocalDate now = LocalDate.now();
        for(Reserva reserva:this.getReservas()){
            if(reserva.getSalida().isAfter(now)){
                reservas+=1;
            }
        }
        if(reservas==0){
            Database.removeInmueble(this);
            Database.save();
        }
        return reservas;
    }

    public String toString(){
        return datos.toString()+this.direccion.toStringShort()+this.precio+this.servicios;
    }

    /*public void setCalificacion(double nota) {
        this.calificacion = nota;
        for(InmueblePreview i : Database.inmueblePreviews) {
            if(i.getNombre().equals(this.titulo)) {
                int idx = Database.inmueblePreviews.indexOf(i);
                InmueblePreview p = Database.inmueblePreviews.get(idx);
                p.setRating(nota);

                System.out.println(Database.getInmueblePreview());
            }
        }
    }*/

}