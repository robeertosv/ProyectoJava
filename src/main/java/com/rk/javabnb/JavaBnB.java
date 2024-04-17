package com.rk.javabnb;


import com.rk.javabnb.Inmuebles.*;
import com.rk.javabnb.UI.Login;
import com.rk.javabnb.Usuarios.*;
import com.rk.javabnb.db.Database;


import java.io.*;
import java.time.LocalDate;

public class JavaBnB implements Serializable {

    public static void main(String[] args) {
        Database db = new Database(); //Cargar los datos desde la db

        /*ClienteParticular luis = new ClienteParticular("sd", "780A", "re.com", "LUIS", 980);
        ClienteParticular roberto = new ClienteParticular("clave", "098547422A", "resvolkava@gmail.com", "Roberto", 640721423);
        Anfitrion katia = new Anfitrion("clave", "Z48540189A", "katia@katia.com", "Katia", 680997055);
        TarjetaCredito card = new TarjetaCredito(LocalDate.now(), 874, "Roberto");

        Database.save();*/

        /*
        ArrayList usr = new ArrayList();
        Database.setCurrentUser(usr);
        Database.save();
         */

        if(Database.getCurrentUser().size() != 0) {
            System.out.println("HAY ALGUIEN LOGGEADO");
            //Abrir pestaña principal
        }else {
            Login login = new Login();
        }
        //POR QUE NO FUNCIONAN LOS ANFITRIONES????????????


    }
}
