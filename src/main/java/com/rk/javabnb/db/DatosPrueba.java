package com.rk.javabnb.db;


import com.rk.javabnb.Inmuebles.*;
import com.rk.javabnb.Usuarios.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class DatosPrueba {

    public DatosPrueba()  {
        this.createData();
        return;
    }

    public void createData() {
        ClienteParticular luis = new ClienteParticular("sd", "780A", "re.com", "LUIS", 980);
        ClienteParticular roberto = new ClienteParticular("clave", "098547422A", "resvolkava@gmail.com", "Roberto", 640721423);
        Anfitrion katia = new Anfitrion("clave", "Z48540189A", "katia@katia.com", "Katia", 680997055);
        TarjetaCredito card = new TarjetaCredito(LocalDate.now(), 874, "Roberto");
        Inmueble casa1 = new Inmueble("Casa Roberto", 'c', new ArrayList<>(), 1000, new ArrayList<>(), new Direccion("Alcalá" ,"Belvis", 3, 28806), new DatosInmueble(2, 3, 3, 3,"Casa bonita"));
        Inmueble casa2 = new Inmueble("Casa Katia", 'c', new ArrayList<>(), 800, new ArrayList<>(), new Direccion("Madrid" ,"Belvis", 3, 28806), new DatosInmueble(2, 3, 3, 3,"Casa bonita"));
        Inmueble casa3 = new Inmueble("Casa Pepe", 'c', new ArrayList<>(), 900, new ArrayList<>(), new Direccion("Cuenca" ,"Belvis", 3, 28806), new DatosInmueble(2, 3, 3, 3,"Casa bonita"));
        Inmueble casa4 = new Inmueble("Casa Luis", 'c', new ArrayList<>(), 825, new ArrayList<>(), new Direccion("Madrid", "Bel", 3, 28805), new DatosInmueble(2,2,2,2,"Casa coquette"));

        casa1.setCalificacion(2.63);
        casa2.setCalificacion(5);
        casa3.setCalificacion(1.8);
        casa4.setCalificacion(4.8);
        Database.save();

    }
}
