package com.rk.javabnb;


import com.rk.javabnb.Inmuebles.*;
import com.rk.javabnb.Usuarios.*;
import com.rk.javabnb.db.Database;
import com.rk.javabnb.UI.*;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class JavaBnB implements Serializable {

    public static void main(String[] args) {
        Database db = new Database();

        /*ClienteParticular luis = new ClienteParticular("sd", "780A", "re.com", "LUIS", 980);
        ClienteParticular roberto = new ClienteParticular("clave", "098547422A", "resvolkava@gmail.com", "Roberto", 640721423);
        Anfitrion katia = new Anfitrion("clave", "Z48540189A", "katia@katia.com", "Katia", 680997055);
        TarjetaCredito card = new TarjetaCredito(LocalDate.now(), 874, "Roberto");

        Database.save();*/
        //new Login().run();

        //probando versiones incompletas de VerInmueble
        Direccion d1 = new Direccion("Málaga","Calle Venus",33,23350);
        DatosInmueble di1 = new DatosInmueble(1,3,2,4,"Una apartamento soleado, a 500 metros de la playa, cerca del casco histórico de Málaga. Muy moderno y limpio. Se admiten mascotas.");
        ArrayList<String> servicios1 = new ArrayList<>();
        servicios1.add("aire acondicionado");
        ArrayList<String> fotos1 = new ArrayList<>();
        fotos1.add("foto1.jpg");
        Inmueble inmuebleMalaga1 = new Inmueble("Palmera",'A', servicios1, 90,fotos1,d1,di1);
        inmuebleMalaga1.verInmueble();


    }
}
