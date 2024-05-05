package com.rk.javabnb;

import com.rk.javabnb.Inmuebles.DatosInmueble;
import com.rk.javabnb.Inmuebles.Direccion;
import com.rk.javabnb.Inmuebles.Inmueble;
import com.rk.javabnb.UI.*;
import com.rk.javabnb.Usuarios.*;
import com.rk.javabnb.db.Database;
import java.io.*;

public class JavaBnB implements Serializable {

    public static void main(String[] args) {
        new Database();//Cargar los datos desde la db


        if(!Database.getCurrentUser().isEmpty()) {
            Object user = Database.getCurrentUser().getFirst();
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

    }
}
