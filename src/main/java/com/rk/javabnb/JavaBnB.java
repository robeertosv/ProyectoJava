package com.rk.javabnb;

import com.rk.javabnb.Inmuebles.DatosInmueble;
import com.rk.javabnb.Inmuebles.Direccion;
import com.rk.javabnb.Inmuebles.Inmueble;
import com.rk.javabnb.Usuarios.*;
import com.rk.javabnb.db.DataHandler;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class JavaBnB implements Serializable {

    public static void main(String[] args) throws IOException {
        DataHandler dataHandler = new DataHandler();
        ArrayList<Cliente> clientes = dataHandler.leerClientes();
        ArrayList<Inmueble> inmuebles = dataHandler.leerInmuebles();

        Admin admin = new Admin();
        Cliente roberto = new Cliente("74hGdnfj3", "12345678G", "resvolkava@gmail.com", "Roberto Seco", 640721423, clientes);
        Direccion d1 = new Direccion("Madrid","Calle Alcalá",5,28803);
        DatosInmueble di1 = new DatosInmueble(2,4,3,6);
        Inmueble inmueble1 = new Inmueble ("SolMar",'C', {"800 m de la playa","aire acondicionado","cocina equipada"},120, {"foto playa","foto cocina", "foto dormitorio..."},d1,di1);


    }
}
