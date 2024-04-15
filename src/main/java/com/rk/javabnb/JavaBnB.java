package com.rk.javabnb;

import com.rk.javabnb.Inmuebles.Direccion;
import com.rk.javabnb.Usuarios.*;
import com.rk.javabnb.db.DataHandler;

import java.io.*;
import java.util.ArrayList;

public class JavaBnB implements Serializable {

    public static void main(String[] args) throws IOException {
        DataHandler dataHandler = new DataHandler();

        Admin admin = new Admin();
        Cliente roberto = new Cliente("74hGdnfj3", "12345678G", "resvolkava@gmail.com", "Roberto Seco", 640721423, dataHandler);
        Direccion d1 = new Direccion("Madrid","Calle Alcalá",5,28803,dataHandler);
        dataHandler.actualizarDirecciones(d1);
        //ArrayList<Cliente> clientes = dataHandler.getClientes();


    }
}
