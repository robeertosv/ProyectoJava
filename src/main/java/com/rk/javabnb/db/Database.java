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
 * La base de datos es así:
 *   - Todas las propiedades deben ser estáticas porque todas las clases necesitan poder acceder a los datos más nuevos, y no a los guardados en las instancias
 *   - Con un solo archivo se pueden guardar todos los elementos de la base de datos, excepto el admin, que por seguridad, debería ir en otro archivo
 *   - Además del usuario actual, que es para tener una persistencia de sesión
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

    /**
     * Todos los ArrayList que utiliza la aplicación para guardar datos se almacenan en un HashMap, que será el único objeto guardado en db.dat
     * */
    private static Map<String, ArrayList> datos = new HashMap<>();
    private static ClienteParticular clienteVerMas;
    private static Anfitrion anfitrionVerMas;
    private static Inmueble currentInmueble;

    /**
     * - Al iniciar la app se deberá instanciar la base de datos, lo que cargará los ArrayList para tener los datos que ya existían
     * */
    public Database() {
        this.load();
    }

    /**
     *  - Método para cargar los datos desde un archivo externo
     *  - Lee el archivo y obtiene el HashMap con todos los ArrayList, luego carga en el ArrayList correspondiente la información
     *  - Hace lo mismo para el admin y el usuario activo
     *  - Si no encuentra los archivos crea unos nuevos
     * */
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
    /**
     *  - Guardar la base de datos en un archivo externo para tener persistencias
     * */
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

    /**añade a un cliente particular a la database cuando este se crea
     * @param cliente es el cliente particular que se acaba de registrar
     * */
    public static void addCliente(ClienteParticular cliente) {
        Database.clientes.add(cliente);
    }
    /**añade a un anfitrion a la database cuando este se crea
     * @param anf es el anfitrion que se acaba de registrar
     * */
    public static void addAnfitrion(Anfitrion anf) {
        Database.anfitriones.add(anf);
    }
    /**añade una reserva a la database cuando esta se crea
     * @param reserva es la reserva que se acaba de crear
     * */
    public static void addReserva(Reserva reserva) {Database.reservas.add(reserva); Database.save();}
    /**elimina una reserva de la database cuando un usuario la
     * elimina y también la elimina del arraylist de reservas del inmueble para actualizar su disponibilidad
     * @param reserva es la reserva que acaba de ser cancelada
     * */
    public static void popReserva(Reserva reserva) {
        Database.reservas.remove(reserva); Database.save();
        Inmueble inmueble = reserva.getInmueble();
        inmueble.cancelarReserva(reserva);
        Database.save();
    }
    public static void addCard(TarjetaCredito t) {
        Database.tarjetas.add(t);
    }
    /**añade un inmueble a la database cuando este se crea
     * @param i es el inmueble que acaba de ser creado
     * */
    public static void addInmueble(Inmueble i) { Database.inmuebles.add(i); }
    /**elimina a un inmueble de la database y de AL del anfitrion cuando un anfitrion lo borra
     * @param i es el inmueble que acaba de ser borrado
     * */
    public static void removeInmueble(Inmueble i) {
        Database.inmuebles.remove(i);
        Anfitrion a = i.getAnfitrion();
        a.removeInmueble(i);
    }

    /**
     *  - Elimina el usuario actual del archivo que gestiona la persistencia de sesiones, de manera que se cierra la sesión
     * */
    public static void cerrarSesion() {
        ArrayList usr = new ArrayList();
        Database.setCurrentUser(usr);
        Database.save();
        //guarda en usuarios loggeados un arraylist vacío
    }

    /**
     * - Obtiene todos los correos registrados, se utiliza para comprobar que no haya duplicidades
     * @return ArrayList
     * */
    public static ArrayList<String> getAllEmail() {
        ArrayList<String> emails = new ArrayList<>();
        for(Cliente c : Database.getPersonas()) {
            emails.add(c.getEmail());
        }
        emails.add("admin@javabnb.com");
        return emails;
        //devuelve un arraylist de todos los emails de los anfitriones y clientes particulares
    }
    /**
     * Devuelve todos los ClientesParticulares y Anfitriones registrados
     * @return ArrayList
     * */
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

    /**
     * Devuelve todos los inmuebles registrados
     * @return ArrayList
     * */
    public static ArrayList<Inmueble> getInmuebles() { return Database.inmuebles; }

    /**
     *  Por cada inmueble crea un InmueblePreview y devuelve un ArrayList con ellos
     *  De esta manera podemos renderizar la información más nueva
     * @return ArrayList
     * */
    public static ArrayList<InmueblePreview> getInmueblePreview() {
        ////crea y devuelve un arraylist de previews de inmuebles creados a partir de todos los inmuebles almacenados en el sistema
        Database.inmueblePreviews = new ArrayList<>();
        for(Inmueble i : Database.inmuebles) {
            Database.inmueblePreviews.add(new InmueblePreview(i));
        }
        return Database.inmueblePreviews;
    }
    /**crea y devuelve un arraylist de previews de inmuebles existentes del anfitrión loggeado a partir de todos sus inmuebles almacenados en el sistema
     * @return arraylist de inmueblepreview - una clase de GUI
     */
    public static ArrayList<InmueblePreview> getMisInmueblesPreview(){
        ArrayList<InmueblePreview> misInmuebles  = new ArrayList<>();
        Anfitrion a = Database.getCurrentAnfitrion();
        for(Inmueble i : a.getMisInmuebles()) {
            misInmuebles.add(new InmueblePreview(i));
        }
        return misInmuebles;
    }
    /**crea y devuelve un arraylist de previews de usuarios existentes (clientes particulares y anfitriones) a partir de todos los usuarios almacenados en el sistema
     * @return arraylist de UsuarioPreview - una clase de GUI
     */
    public static ArrayList<UsuarioPreview> getUsuarioPreviews(){
        Database.usuarioPreviews = new ArrayList<>();
        for(ClienteParticular particular: Database.clientes){
            Database.usuarioPreviews.add(new UsuarioPreview(particular));
        }
        for(Anfitrion anfitrion: Database.anfitriones){
            Database.usuarioPreviews.add(new UsuarioPreview(anfitrion));
        }
        return Database.usuarioPreviews;
    }

    /**@return un arraylist de reservas almacenadas en la database*/
    public static ArrayList<Reserva> getReservas() { return Database.reservas; }
    /**crea y devuelve un arraylist de previews de reservas creadas a partir de todas las reservas almacenadas en el sistema
     * @return arraylist de ReservaPreview - una clase de GUI
     */
    public static ArrayList<ReservaPreview> getReservaPreviews(){
        Database.reservaPreviews = new ArrayList<>();
        for(Reserva reserva:Database.reservas){
            Database.reservaPreviews.add(new ReservaPreview(reserva, reserva.nombreAnfitrion()));
        }
        return Database.reservaPreviews;
    }
    /**@return arraylist de tarjetas almacenadas en el sistema*/
    public static ArrayList<TarjetaCredito> getTarjetas() { return Database.tarjetas; }
    /**@return arraylist de todos los clientes particulares almacenados en el sistema*/
    public static ArrayList<ClienteParticular> getClientes() {
        return Database.clientes;
    }
    /**@return arraylist de todos los anfitriones almacenados en el sistema*/
    public static ArrayList<Anfitrion> getAnfitriones() { return Database.anfitriones; }

    /**
     * Método que se utiliza para indicar qué usuario tiene la sesión iniciada
     * Se utiliza para recuperar los datos de sesión al recargar la app
     * */
    public static void setCurrentUser(ArrayList c) {
        Database.currentUser = c;
        Database.save();
        //almacena usuario loggeado
    }

    /**
     * Devuelve el usuario que tiene la sesión iniciada
     * @return ArrayList
     * */
    public static ArrayList getCurrentUser() { return Database.currentUser; /*devuelve un arraylist, cuyo primer elemento es el usuario loggeado en el sistema*/}
    /**@return el cliente particular que está loggeado en la app*/
    public static ClienteParticular getCurrentParticular(){
        Object user = Database.getCurrentUser().getFirst();
        if(user instanceof ClienteParticular) {
            return (ClienteParticular) user;
        }else {
            return null;
        }
    }
    /**@return el nombre del cliente particular que está loggeado en la app*/
    public static String getNombreParticular(){
        //devuelve el nombre del cliente particular que está loggeado
        ClienteParticular cliente = Database.getCurrentParticular();
        String nombre = cliente.getNombre();
        return nombre;
    }
    /**@return el anfitrion que está loggeado en la app*/
    public static Anfitrion getCurrentAnfitrion(){
        //devuelve al anfitrion que está loggeado
        Object user = Database.getCurrentUser().getFirst();
        if(user instanceof Anfitrion) {
            return (Anfitrion) user;
        }else {
            return null;
        }
    }
    /**@return el nombre del anfitrion que está loggeado en la app*/
    public static String getNombreAnfitrion(){
        //devuelve el nombre del anfitrión que está loggeado
        Anfitrion a = Database.getCurrentAnfitrion();
        String nombre = a.getNombre();
        return nombre;
    }

    /**el método guarda en clienteVerMas al cliente particular
     * @param c es el cliente particular cuya información se va a mostrar
     */
    public static void setClienteVerMas(ClienteParticular c) {clienteVerMas = c;}
    /**se usa para enseñar la información de un cliente particular por ejemplo al admin
     * @return el cliente particular cuya información se va a visualizar, como sus reservas
     */
    public static ClienteParticular getClienteVerMas() {return clienteVerMas;}
    /**@param a es el anfitiron cuya información se va a visualizar cuando admin haga click en ver más, este método lo guarda en una variable*/
    public static void setAnfitrionVerMas(Anfitrion a) {anfitrionVerMas = a;}
    /**@return devuelve al anfitrió guardado en ver mas para que admin pueda ver su informacion, como sus inmuebles*/
    public static Anfitrion getAnfitrionVerMas() {return anfitrionVerMas;}
    /**vacia al anfitrion, para que se pueda cambiar en el futuro*/
    public static void vaciarAnfitrion(){anfitrionVerMas = null;}
    /**cuando por alguna razón el usuario está redirigido de la página del inmueble por ejemplo a la página de datos
     * bancarios porque quiere hacer una reserva y no tiene asociada una tarjeta, este método guarda el inmueble visualizado
     * para posteriormente poder volver a la misma página
     * @param i es el inmueble que el usuario estaba visualizando y quería reservar antes de ser redirigido
     */
    public static void setCurrentInmueble(Inmueble i) {currentInmueble = i;}
    /** @return devuelve el inmueble que el usuario estaba viendo antes de ser redirigido al VIP o datos bancarios,
     * para poder volver fácilmente a la misma página del inmueble*/
    public static Inmueble getCurrentInmueble(){return currentInmueble;}
    /**vacia el currentInmueble cuando ya no hace falta usarlo*/
    public static void vaciarCurrentInmueble(){currentInmueble = null;}
}