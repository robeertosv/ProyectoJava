package com.rk.javabnb.db;


import com.rk.javabnb.Inmuebles.*;
import com.rk.javabnb.Usuarios.*;
import java.time.LocalDate;

public class DatosPrueba {

    public DatosPrueba()  {
        this.createData();
    }

    public void createData() {
        ClienteParticular luis = new ClienteParticular("sd", "780A", "re.com", "LUIS", 980);
        ClienteParticular roberto = new ClienteParticular("clave", "098547422A", "resvolkava@gmail.com", "Roberto", 640721423);
        Anfitrion katia = new Anfitrion("clave", "Z48540189A", "katia@katia.com", "Katia", 680997055);
        TarjetaCredito card = new TarjetaCredito(LocalDate.now(), 1234567890, "Roberto");
        roberto.setTarjeta(card);
        Inmueble casa1 = new Inmueble("Casa Roberto", 'c', "aire acondicionado, wifi", 1000, "foto", new Direccion("Alcalá" ,"Belvis", 3, 28806), new DatosInmueble(2, 3, 3, 3,"Casa bonita"),katia);
        Inmueble casa2 = new Inmueble("Casa Katia", 'c', "piscina", 800, "foto", new Direccion("Madrid" ,"Belvis", 3, 28806), new DatosInmueble(2, 3, 3, 3,"Casa bonita"),katia);
        Inmueble casa3 = new Inmueble("Casa Pepe", 'c', "wifi", 900, "foto", new Direccion("Cuenca" ,"Belvis", 3, 28806), new DatosInmueble(2, 3, 3, 3,"Casa bonita"),katia);
        Inmueble casa4 = new Inmueble("Apartamento Luis", 'a', "cocina", 825, "foto", new Direccion("Madrid", "Bel", 3, 28805), new DatosInmueble(2,2,2,2,"Casa coquette"),katia);
        new Admin();

        casa1.addResena(2);
        casa2.addResena(5);
        casa3.addResena(1);
        casa4.addResena(4);
        Database.save();

    }
}
