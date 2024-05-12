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

    private String fotoURL;
    public String titulo;
    private ArrayList<Reserva> reservas = new ArrayList<>();
    private Anfitrion anfitrion;
    private String nombre;
    private static int num = 1; //diferencia los distintos inmuebles creados

    public Inmueble(String titulo, char tipo, String servicios, double precio, String fotoURL, Direccion direccion, DatosInmueble datos, Anfitrion anfitrion){
        this.titulo = titulo;
        this.tipo = tipo;
        this.servicios = servicios;
        this.precio = precio;
        this.direccion = direccion;
        this.datos = datos;
        this.anfitrion = anfitrion;
        this.fotoURL = fotoURL;
        anfitrion.addInmueble(this);
        Database.addInmueble(this);
        nombre = "inmueble"+num;
        num += 1;
        Database.save();
    }

    /**@return el titulo del inmueble*/
    public String getNombre() { return this.titulo; }

    /**
     * calcula el precio por una noche para los clientes VIP
     * @return 90% del precio
     */
    public double getDesc() {
        double precioDesc = this.precio*0.9;
        return precioDesc;
    }

    public String getFotoURL() { return this.fotoURL; }
    public void setFotoURL(String url) { this.fotoURL = url; }
    /**@return el máximo del huéspedes que se pueden alojar en el inmueble*/
    public int getMHuespedes(){return this.datos.getMaxHuespedes();}
    public ArrayList<Reserva> getReservas(){return this.reservas;}
    /**añade una reserva a la lista de las reservas del inmueble*/
    public void addReserva(Reserva reserva){this.reservas.add(reserva);}
    /**@return el precio por noche del inmueble*/
    public double getPrecio() { return this.precio;}
    /**@return la calificacion del inmueble*/
    public double getCalificacion() { return this.calificacion;}
    /**@return la ciudad del inmueble*/
    public String getCiudad() { return this.direccion.getCiudad(); }
    /**@return la dirección del inmueble como un String*/
    public String getDireccion() {
        Direccion d = this.direccion;
        return  d.getCalle() + ", " + d.getNumero() + ", " + d.getNumero() + ", "+ d.getCiudad();
    }
    /**@return la dirección del inmueble no como String sino como la dirección*/
    public Direccion getDireccion2() {return this.direccion;}
    /**@return los servicios del inmueble*/
    public String getServicios() {
        return this.servicios;
    }
    /**@return los datos del inmueble*/
    public DatosInmueble getDatos() {
        return this.datos;
    }
    /**@return el tipo del inmueble como String*/
    public String getTipo() {
        if(this.tipo == 'c') {
            return "Casa";
        } else {
            return "Apartamento";
        }
    }
    /**@return al anfitrion del inmueble*/
    public Anfitrion getAnfitrion() {return this.anfitrion;}
    /**@return el titulo del inmueble*/
    public String getTitulo(){return this.titulo;}
    /**@return el nombre del anfitiron del inmueble*/
    public String getAnfitrionNombre(){
        Anfitrion a = this.anfitrion;
        return a.getNombre();
    }
    /**@return el número de veces que ha sido valorado el inmueble*/
    public int getVecesValorado() {return this.vecesValorado;}
    /**@return la suma de todas las calificaciones del inmueble*/
    public int getSumaCalificaciones() {return this.sumaCalificaciones;}

    /**pone el tipo del inmueble
     * @param tipo es el tipo del inmueble
     * */
    public void setTipo(String tipo) {
        char tipoChar = 'x';
        if(tipo.equals("Apartamento")){
            tipoChar = 'a';
        }else if(tipo.equals("Casa")){
            tipoChar = 'c';
        }
        this.tipo = tipoChar;
    }
    /**actualiza el titulo del inmueble
     * @param titulo es el nuevo titulo del inmueble
     * */
    public void setTitulo(String titulo) {this.titulo = titulo;}
    /**actualiza la dirección del inmueble
     * @param ciudad es la nueva ciudad del inmueble
     * @param calle es la nueva calle del inmueble
     * @param numero es el nuevo numero de la calle del inmueble
     * @param cp es el nuevo código postal del inmueble
     * */
    public void setDireccion(String ciudad, String calle, int numero, int cp){
        this.direccion = new Direccion(ciudad,calle,numero,cp);
    }

    /**
     * actualiza los datos del inmueble
     * @param banos es el número de los baños
     * @param camas es el número de las camas
     * @param habitaciones es el número de las habitaciones
     * @param maxHuespedes es el límite de los huéspedes que puede alojar el inmueble
     * @param descripcion es la descripción del inmueble
     */
    public void setDatos(int banos, int camas, int habitaciones, int maxHuespedes, String descripcion){
        this.datos = new DatosInmueble(banos, camas, habitaciones, maxHuespedes, descripcion);
    }
    /**actualiza el precio del inmueble*/
    public void setPrecio(double precio) {this.precio = precio;}
    /**actualiza los servicios del inmueble*/
    public void setServicios(String servicios) {this.servicios = servicios;}

    /**
     * actualiza las reseñas del inmueble cuando se añade una, actualiza cuantas veces ha sido valorado el inmueble,
     * añade la nueva valoración a la suma de calificaciones y actualiza la calificación general del inmueble y mira
     * si el anfitrion ha pasado a ser superanfitrion o ha dejado de ser superanfitiron con esta reseña
     * @param x - es la nueva reseña (entre 0 y 5)
     */
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

        }catch(Exception e) {
            System.out.println(e);

        }
        //calcula una nueva media de reseñas, actualiza la calificacion y mira si el anfitrion se ha vuelto superanfitrion o ha dejado de serlo
    }

    /**
     * permite ver la disponibilidad del inmueble para dejar o no dejar hacer una nueva reserva
     * y para mostrarla o no mostrarla en el motor de búsqueda cuando se busca por fechas
     * el método verifica si no hay ninguna reserva previa en exactamente las mismas fechas o si alguna reserva no tiene alguna
     * entrada o salida entre las fechas de la nueva reserva o si la nueva reserva no estaría entre entrada y salida de
     * una reserva previa
     * @param fechaEntrada - la fecha a la que le gustaría entrar al usuario, cuando busca inmueble o lo reserva
     * @param fechaSalida - la fecha a la que le gustaría irse al usuario, cuando busca inmueble o lo reserva
     * @return true si el inmueble está disponible en estas fechas o no
     */
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
                if(!((fechaEntrada.isAfter(entrada)&&fechaEntrada.isBefore(salida))||(fechaSalida.isAfter(entrada)&&fechaSalida.isBefore(salida)))) {
                    if(!(fechaEntrada.isEqual(entrada)&&fechaSalida.isEqual(salida))) {
                        nreservas = nreservas - 1;
                    }
                }
            }
        }
        if(nreservas==0){disponible=true;}//ve si el número de las reservas coincide con el número de las reservas que no intervendrían con la nueva, si es cero, entonces se puede hacer la reserva, ya que todas las reservas no intervienen
        if(fechaEntrada.isBefore(fechaSalida)){orden = true;}
        return disponible&&futuro&&orden;
        //verifica que no haya ningún inicio o fin de otra reserva hecha previamente en las fechas de la nueva reserva
        //tambien verifica si las fechas introducidas se encuentran en el futuro
        //tambien mira que la fecha de entrada es antes de la fecha de salida
    }

    /**
     * sirve para ver si se puede o no borrar el inmueble, dependiendo si hay reservas futuras
     * @return el número de reservas en el futuro del inmueble
     */
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

    /**
     * borra la reserva del AL de reservas
     * @param reserva
     */
    public void cancelarReserva(Reserva reserva){
        this.reservas.remove(reserva);
    }

    /**imprime la información sobre el inmueble*/
    public String toString(){
        return datos.toString()+this.direccion.toStringShort()+this.precio+this.servicios;
    }

}