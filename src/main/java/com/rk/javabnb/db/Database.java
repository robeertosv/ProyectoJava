package com.rk.javabnb.db;

import com.rk.javabnb.Inmuebles.Inmueble;
import com.rk.javabnb.UI.InmueblePreview;
import com.rk.javabnb.Inmuebles.Reserva;
import com.rk.javabnb.UI.ReservaPreview;
import com.rk.javabnb.UI.UsuarioPreview;
import com.rk.javabnb.Usuarios.*;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


/*
 * La nueva base de datos es así:
 *   - Todas las propiedades deben ser estáticas porque todas las clases necesitan poder acceder a los datos más nuevos, y no a los guardados en las instancias
 *   - Con un solo archivo se pueden guardar todos los elementos de la base de datos, excepto el admin, que por seguridad, debería ir en otro archivo
 */
public class Database implements Serializable{
    private static ArrayList currentUser = new ArrayList();
    private static ArrayList<ClienteParticular> clientes = new ArrayList<>();
    private static ArrayList<Anfitrion> anfitriones = new ArrayList<>();
    private static Admin admin;
    private static ArrayList<TarjetaCredito> tarjetas = new ArrayList<>();
    private static ArrayList<Inmueble> inmuebles = new ArrayList<>();
    private static ArrayList<String> emails = new ArrayList<>();
    private static ArrayList<Reserva> reservas = new ArrayList<>();
    private static ArrayList<InmueblePreview> inmueblePreviews = new ArrayList<>();
    private static ArrayList<UsuarioPreview> usuarioPreviews = new ArrayList<>();
    private static ArrayList<ReservaPreview> reservaPreviews = new ArrayList<>();
    private static Map<String, ArrayList> datos = new HashMap<>();
    private static ClienteParticular clienteVerMas;
    private static Anfitrion anfitrionVerMas;
    private static Inmueble currentInmueble;

    public Database() {
        this.load();
    }

    private void load() {
        //convierte todos los datos de ficheros a ArrayLists para trabajar con ellos durante el uso de la app
        //ficheros: datos (HashMap con clientes, anfitriones, tarjetas e inmuebles), admin, currentUser
        try {
            FileInputStream fis = new FileInputStream("db.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Database.datos = (Map<String, ArrayList>) ois.readObject();

            Database.clientes = Database.datos.get("clientes");
            Database.anfitriones = Database.datos.get("anfitriones");
            Database.tarjetas = Database.datos.get("tarjetas");
            Database.inmuebles = Database.datos.get("inmuebles");
            Database.reservas = Database.datos.get("reservas");

            ois.close();
            fis.close();

            fis = new FileInputStream("admin.dat");
            ois = new ObjectInputStream(fis);
            Database.admin = (Admin) ois.readObject();
            ois.close();
            fis.close();

            fis = new FileInputStream("currentUser.dat");
            ois = new ObjectInputStream(fis);
            Database.currentUser = (ArrayList) ois.readObject();
            ois.close();
            fis.close();

            Database.emails = Database.getAllEmail();


        }catch (Exception e) {
            System.err.println(e);
            new DatosPrueba(); //en caso de error, cargaba datos de prueba
        }
    }
    public static void save() {
        //guarda todos los datos en ficheros, para el futuro uso de la app
        try{
            datos.put("clientes", Database.getClientes());
            datos.put("tarjetas", Database.tarjetas);
            datos.put("anfitriones", Database.anfitriones);
            //datos.put("inmueblesPreview", Database.inmueblePreviews);
            datos.put("inmuebles", Database.inmuebles);
            datos.put("reservas", Database.reservas);

            FileOutputStream fos = new FileOutputStream("db.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(datos);
            oos.close();
            fos.close();

            fos = new FileOutputStream("admin.dat");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(Database.admin);
            oos.close();
            fos.close();

            fos = new FileOutputStream("currentUser.dat");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(Database.currentUser);
            oos.close();
            fos.close();

        }catch (IOException e) {
            System.err.println(e);
        }
    }

    public static void addCliente(ClienteParticular cliente) {
        Database.clientes.add(cliente);
    }
    public static void addAnfitrion(Anfitrion anf) {
        Database.anfitriones.add(anf);
    }
    public static void addReserva(Reserva reserva) {Database.reservas.add(reserva); Database.save();}
    public static void popReserva(Reserva reserva) { Database.reservas.remove(reserva); Database.save(); }
    public static void addCard(TarjetaCredito t) {
        Database.tarjetas.add(t);
    }
    public static void addInmueble(Inmueble i) { Database.inmuebles.add(i); }
    public static void removeInmueble(Inmueble i) { Database.inmuebles.remove(i); }

    public static void cerrarSesion() {
        ArrayList usr = new ArrayList();
        Database.setCurrentUser(usr);
        Database.save();
        //guarda en usuarios loggeados un arraylist vacío
    }

    public static ArrayList<String> getAllEmail() {
        ArrayList<String> emails = new ArrayList<>();
        for(Cliente c : Database.getPersonas()) {
            emails.add(c.getEmail());
        }
        emails.add("admin@javabnb.com");
        return emails;
        //devuelve un arraylist de todos los emails de los anfitriones y clientes particulares
    }
    public static ArrayList<Cliente> getPersonas() {
        //devuelve un arraylist de todos los clientes particulares y anfitriones
        ArrayList<Cliente> temp = new ArrayList<>();
        for(ClienteParticular c : Database.clientes) {
            temp.add(c);
        }
        for(Anfitrion a : Database.anfitriones) {
            temp.add(a);
        }
        return temp;
    }
    public static ArrayList<Inmueble> getInmuebles() { return Database.inmuebles; }

    public static ArrayList<InmueblePreview> getInmueblePreview() {
        ////crea y devuelve un arraylist de previews de inmuebles creados a partir de todos los inmuebles almacenados en el sistema
        Database.inmueblePreviews = new ArrayList<>();
        for(Inmueble i : Database.inmuebles) {
            Database.inmueblePreviews.add(new InmueblePreview(i));
        }
        return Database.inmueblePreviews;
    }
    public static ArrayList<InmueblePreview> getMisInmueblesPreview(){
        //crea y devuelve un arraylist de previews de inmuebles existentes del anfitrión loggeado a partir de todos sus inmuebles almacenados en el sistema
        ArrayList<InmueblePreview> misInmuebles  = new ArrayList<>();
        Anfitrion a = Database.getCurrentAnfitrion();
        for(Inmueble i : a.getMisInmuebles()) {
            misInmuebles.add(new InmueblePreview(i));
        }
        return misInmuebles;
    }
    public static ArrayList<UsuarioPreview> getUsuarioPreviews(){
        //crea y devuelve un arraylist de previews de usuarios existentes (clientes particulares y anfitriones) a partir de todos los usuarios almacenados en el sistema
        Database.usuarioPreviews = new ArrayList<>();
        for(ClienteParticular particular: Database.clientes){
            Database.usuarioPreviews.add(new UsuarioPreview(particular));
        }
        for(Anfitrion anfitrion: Database.anfitriones){
            Database.usuarioPreviews.add(new UsuarioPreview(anfitrion));
        }
        return Database.usuarioPreviews;
    }

    public static ArrayList<Reserva> getReservas() { return Database.reservas; }
    public static ArrayList<ReservaPreview> getReservaPreviews(){
        //crea y devuelve un arraylist de previews de reservas creadas a partir de todas las reservas almacenadas en el sistema
        Database.reservaPreviews = new ArrayList<>();
        for(Reserva reserva:Database.reservas){
            Database.reservaPreviews.add(new ReservaPreview(reserva, reserva.nombreAnfitrion()));
        }
        return Database.reservaPreviews;
    }
    public static ArrayList<TarjetaCredito> getTarjetas() { return Database.tarjetas; }
    public static ArrayList<ClienteParticular> getClientes() {
        return Database.clientes;
    }
    public static ArrayList<Anfitrion> getAnfitriones() { return Database.anfitriones; }

    public static void setCurrentUser(ArrayList c) {
        Database.currentUser = c;
        Database.save();
        //almacena usuario loggeado
    }
    public static void setAdmin(Admin a) {
        Database.admin = a;
    }
    public static ArrayList getCurrentUser() { return Database.currentUser; /*devuelve un arraylist, cuyo primer elemento es el usuario loggeado en el sistema*/}
    public static ClienteParticular getCurrentParticular(){
        Object user = Database.getCurrentUser().getFirst();
        if(user instanceof ClienteParticular) {
            return (ClienteParticular) user;
        }else {
            return null;
        }
    }
    public static String getNombreParticular(){
        //devuelve el nombre del cliente particular que está loggeado
        ClienteParticular cliente = Database.getCurrentParticular();
        String nombre = cliente.getNombre();
        return nombre;
    }
    public static Anfitrion getCurrentAnfitrion(){
        //devuelve al anfitrion que está loggeado
        Object user = Database.getCurrentUser().getFirst();
        if(user instanceof Anfitrion) {
            return (Anfitrion) user;
        }else {
            return null;
        }
    }
    public static String getNombreAnfitrion(){
        //devuelve el nombre del anfitrión que está loggeado
        Anfitrion a = Database.getCurrentAnfitrion();
        String nombre = a.getNombre();
        return nombre;
    }

    public static void setClienteVerMas(ClienteParticular c) {clienteVerMas = c;}
    public static ClienteParticular getClienteVerMas() {return clienteVerMas;}
    public static void setAnfitrionVerMas(Anfitrion a) {anfitrionVerMas = a;}
    public static Anfitrion getAnfitrionVerMas() {return anfitrionVerMas;}
    public static void setCurrentInmueble(Inmueble i) {currentInmueble = i;}
    public static Inmueble getCurrentInmueble(){return currentInmueble;}
}