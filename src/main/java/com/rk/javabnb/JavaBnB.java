package com.rk.javabnb;


import com.rk.javabnb.Inmuebles.*;
import com.rk.javabnb.UI.*;
import com.rk.javabnb.Usuarios.*;
import com.rk.javabnb.db.DataChecker;
import com.rk.javabnb.db.Database;


import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class JavaBnB implements Serializable {

    public static void main(String[] args) {
        Database db = new Database(); //Cargar los datos desde la db

        /*ClienteParticular luis = new ClienteParticular("sd", "780A", "re.com", "LUIS", 980);
        ClienteParticular roberto = new ClienteParticular("clave", "098547422A", "resvolkava@gmail.com", "Roberto", 640721423);
        Anfitrion katia = new Anfitrion("clave", "Z48540189A", "katia@katia.com", "Katia", 680997055);
        TarjetaCredito card = new TarjetaCredito(LocalDate.now(), 874, "Roberto");

        Database.save();*/
        //new Login().run();


        //Cerrar sesión
        //Database.cerrarSesion();

        /*if(Database.getCurrentUser().size() != 0) {
            System.out.println("HAY ALGUIEN LOGGEADO");
            System.out.println(Database.getTarjetas());
            new DatosBancarios();
            //Abrir pestaña principal
        }else {
            Login login = new Login();
        }*/

        /*Inmueble casa1 = new Inmueble("Casa Roberto", 'c', new ArrayList<>(), 600, new ArrayList<>(), new Direccion("Alcalá" ,"Belvis", 3, 28806), new DatosInmueble(2, 3, 3, 3,"Casa bonita"));
        Inmueble casa2 = new Inmueble("Casa Katia", 'c', new ArrayList<>(), 800, new ArrayList<>(), new Direccion("Alcalá" ,"Belvis", 3, 28806), new DatosInmueble(2, 3, 3, 3,"Casa bonita"));
        Inmueble casa3 = new Inmueble("Casa Pepe", 'c', new ArrayList<>(), 900, new ArrayList<>(), new Direccion("Alcalá" ,"Belvis", 3, 28806), new DatosInmueble(2, 3, 3, 3,"Casa bonita"));*/

        new Home();

    }
}
