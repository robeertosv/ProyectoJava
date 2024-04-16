package com.rk.javabnb.db;

import com.rk.javabnb.Usuarios.*;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


/*
* La nueva base de datos es así:
*   - Todas las propiedades deben ser estáticas porque todas las clases necesitan poder acceder a los datos más nuevos, y no a los guardados en las instancias
*   - Con un solo archivo se pueden guardar todos los elementos de la base de datos, excepto el admin, que por seguridad, debería ir en otro archivo
*/
public class Database implements Serializable{
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static ArrayList<Anfitrion> anfitriones = new ArrayList<>();
    private static Admin admin;
    private static ArrayList<TarjetaCredito> tarjetas = new ArrayList<>();
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

            ois.close();
            fis.close();

            fis = new FileInputStream("admin.dat");
            ois = new ObjectInputStream(fis);
            Database.admin = (Admin) ois.readObject();
        }catch (Exception e) {
            System.err.println(e);
        }
    }
    public void save() {
        try{
            datos.put("clientes", Database.getClientes());
            datos.put("tarjetas", Database.tarjetas);
            datos.put("anfitriones", Database.anfitriones);
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

        }catch (IOException e) {
            System.err.println(e);
        }
    }

    public static void addCliente(Cliente cliente) {
        Database.clientes.add(cliente);
    }

    public static void addAnfitrion(Anfitrion anf) {
        Database.clientes.add(anf);
    }

    public static void addCard(TarjetaCredito t) {
        Database.tarjetas.add(t);
    }

    public static void setAdmin(Admin a) {
        Database.admin = a;
    }

    public static ArrayList<Cliente> getClientes() {
        return Database.clientes;
    }
}
