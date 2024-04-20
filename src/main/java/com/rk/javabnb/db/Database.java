package com.rk.javabnb.db;

import com.rk.javabnb.Inmuebles.Inmueble;
import com.rk.javabnb.Inmuebles.InmueblePreview;
import com.rk.javabnb.Usuarios.*;

import javax.swing.*;
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

    public static ArrayList<InmueblePreview> inmueblePreviews = new ArrayList<>();
    private static Map<String, ArrayList> datos = new HashMap<>();

    public Database() {
        this.load();
    }

    private void load() {
        try {
            FileInputStream fis = new FileInputStream("db.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Database.datos = (Map<String, ArrayList>) ois.readObject();

            Database.clientes = Database.datos.get("clientes");
            Database.anfitriones = Database.datos.get("anfitriones");
            Database.tarjetas = Database.datos.get("tarjetas");
            Database.inmueblePreviews = Database.datos.get("inmueblesPreview");

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
            new DatosPrueba();
        }
    }
    public static void save() {
        try{
            datos.put("clientes", Database.getClientes());
            datos.put("tarjetas", Database.tarjetas);
            datos.put("anfitriones", Database.anfitriones);
            datos.put("inmueblesPreview", Database.inmueblePreviews);

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

    public static void addCard(TarjetaCredito t) {
        Database.tarjetas.add(t);
    }
    public static ArrayList<TarjetaCredito> getTarjetas() { return Database.tarjetas; }
    public static void setAdmin(Admin a) {
        Database.admin = a;
    }

    public static ArrayList<ClienteParticular> getClientes() {
        return Database.clientes;
    }
    public static ArrayList<Anfitrion> getAnfitriones() { return Database.anfitriones; }
    public static void setCurrentUser(ArrayList c) {
        Database.currentUser = c;
    }

    private static ArrayList<String> setAllEmail() {
        ArrayList<String> emails = new ArrayList<>();

        for(Cliente c : Database.getClientes()) {
            emails.add(c.getEmail());
        }

        return emails;
    }

    public static void cerrarSesion() {
        ArrayList usr = new ArrayList();
        Database.setCurrentUser(usr);
        Database.save();
    }
    public static ArrayList<String> getAllEmail() {
        return Database.emails;
    }

    public static ArrayList getCurrentUser() { return Database.currentUser; }
    public static ArrayList<Cliente> getPersonas() {
        ArrayList<Cliente> temp = new ArrayList<>();

        for(ClienteParticular c : Database.clientes) {
            temp.add(c);
        }
        for(Anfitrion a : Database.anfitriones) {
            temp.add(a);
        }

        return temp;
    }

    public static void addInmueble(Inmueble i) { Database.inmuebles.add(i); }
    public static ArrayList<Inmueble> getInmuebles() { return Database.inmuebles; }
    public static void addInmueblePreview(InmueblePreview i) { Database.inmueblePreviews.add(i); }
    public static ArrayList<InmueblePreview> getInmueblePreview() { return Database.inmueblePreviews; }

}