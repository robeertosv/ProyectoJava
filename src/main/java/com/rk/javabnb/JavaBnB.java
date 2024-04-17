package com.rk.javabnb;


import com.rk.javabnb.Inmuebles.*;
import com.rk.javabnb.Usuarios.*;
import com.rk.javabnb.db.Database;
import com.rk.javabnb.UI.*;

import java.io.*;
import java.time.LocalDate;

public class JavaBnB implements Serializable {

    public static void main(String[] args) {
        Database db = new Database();

        /*ClienteParticular luis = new ClienteParticular("sd", "780A", "re.com", "LUIS", 980);
        ClienteParticular roberto = new ClienteParticular("clave", "098547422A", "resvolkava@gmail.com", "Roberto", 640721423);
        Anfitrion katia = new Anfitrion("clave", "Z48540189A", "katia@katia.com", "Katia", 680997055);
        TarjetaCredito card = new TarjetaCredito(LocalDate.now(), 874, "Roberto");

        Database.save();*/
        new Login().run();

        Anfitrion juan = new Anfitrion("clave","12345678A","juan@gmail.com","Juan",678345443);
        db.addAnfitrion(juan);
        //POR QUE NO FUNCIONAN LOS ANFITRIONES????????????


    }
}
