package com.rk.javabnb.db;


import com.rk.javabnb.Inmuebles.*;
import com.rk.javabnb.Usuarios.*;

public class DatosPrueba {

    public DatosPrueba()  {
        this.createData();
    }

    public void createData() {
        new ClienteParticular("sd", "780A", "re.com", "LUIS", 980);
        new ClienteParticular("clave", "098547422A", "resvolkava@gmail.com", "Roberto", 640721423);
        Anfitrion katia = new Anfitrion("clave", "Z48540189A", "katia@katia.com", "Katia", 680997055);
        Inmueble casa1 = new Inmueble("Casa Roberto", 'c', "aire acondicionado, wifi", 1000, "foto", new Direccion("Alcalá" ,"Belvis", 3, 28806), new DatosInmueble(2, 3, 3, 3,"Casa bonita"),katia);
        Inmueble casa2 = new Inmueble("Casa Katia", 'c', "piscina", 800, "foto", new Direccion("Madrid" ,"Belvis", 3, 28806), new DatosInmueble(2, 3, 3, 3,"Casa bonita"),katia);
        Inmueble casa3 = new Inmueble("Casa Pepe", 'c', "wifi", 900, "foto", new Direccion("Cuenca" ,"Belvis", 3, 28806), new DatosInmueble(2, 3, 3, 3,"Casa bonita"),katia);
        Inmueble casa4 = new Inmueble("Apartamento Luis", 'a', "cocina", 825, "foto", new Direccion("Madrid", "Bel", 3, 28805), new DatosInmueble(2,2,2,2,"Casa coquette"),katia);
        new Admin();
        //Reserva r1 = new Reserva(casa1,roberto,"comentario",LocalDate.parse("10/05/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy")),LocalDate.parse("15/05/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy")),2);

        casa1.addResena(2);
        casa2.addResena(5);
        casa3.addResena(1);
        casa4.addResena(4);
        Database.save();

    }
}
