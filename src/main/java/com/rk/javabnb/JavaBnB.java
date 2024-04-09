package com.rk.javabnb;

import com.rk.javabnb.Usuarios.*;
import com.rk.javabnb.db.DataHandler;

import java.io.*;
import java.util.ArrayList;

public class JavaBnB implements Serializable {

    public static void main(String[] args) throws IOException {
        DataHandler dataHandler = new DataHandler();
        Admin admin = new Admin();
        Cliente roberto = new Cliente("74hGdnfj3", "resvolkava@gmail.com", "robertoPass", "Roberto Seco", 640721423);

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(roberto);

        FileOutputStream fos = new FileOutputStream("usuarios.dat"); // TODO: Hacer que se pueda guardar en un directorio bien
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(clientes);
        oos.close();


    }
}
