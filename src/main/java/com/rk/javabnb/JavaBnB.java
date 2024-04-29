package com.rk.javabnb;


import com.rk.javabnb.Inmuebles.*;
import com.rk.javabnb.UI.*;
import com.rk.javabnb.Usuarios.*;
import com.rk.javabnb.db.DataChecker;
import com.rk.javabnb.db.Database;
import com.rk.javabnb.db.DatosPrueba;


import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class JavaBnB implements Serializable {

    public static void main(String[] args) {
        Database db = new Database();//Cargar los datos desde la db
        //Admin admin = new Admin();


        if(Database.getCurrentUser().size() != 0) {
            Object user = Database.getCurrentUser().get(0);
            if (user instanceof Admin){
                new MenuAdmin();
            }else if(user instanceof ClienteParticular){
                new Home("particular");
            }else if(user instanceof Anfitrion){
                new MenuAnfitrion();
            }
        }else {
            new Login();
        }

        /*ClienteParticular roberto = new ClienteParticular("clave", "098547422A", "resvolkava@gmail.com", "Roberto", 640721423);
        Anfitrion katia = new Anfitrion("clave", "Z48540189A", "katia@katia.com", "Katia", 680997055);
        TarjetaCredito card = new TarjetaCredito(LocalDate.now(), 1234567890, "Roberto");
        roberto.setTarjeta(card);
        Inmueble casa1 = new Inmueble("Casa Roberto", 'c', "aire acondicionado, wifi", 1000, "foto", new Direccion("Alcalá" ,"Belvis", 3, 28806), new DatosInmueble(2, 3, 3, 3,"Casa bonita"),katia);
        Inmueble casa2 = new Inmueble("Casa Katia", 'c', "piscina", 800, "foto", new Direccion("Madrid" ,"Belvis", 3, 28806), new DatosInmueble(2, 3, 3, 3,"Casa bonita"),katia);
        LocalDate date1 = LocalDate.of(2024, 10, 4);
        LocalDate date2 = LocalDate.of(2024, 10, 20);
        LocalDate date3 = LocalDate.of(2024, 10, 8);
        LocalDate date4 = LocalDate.of(2024, 11, 22);

        Reserva r1 = new Reserva(casa1,roberto,date1,date2,1);
        boolean disponible = casa1.verDisponibilidad(date3,date4);
        System.out.println(disponible);*/

        /*
        Admin admin = new Admin();
        ArrayList<Object> logeados = new ArrayList<>();
        logeados.add(admin);
        Database.setCurrentUser(logeados);
        new Home("admin");

        /*ArrayList<Admin> admins = new ArrayList<>();
        admins.add(admin);
        Database.setCurrentUser(admins);
        new HomeAdmin("inmuebles");*/
        

    }
}
