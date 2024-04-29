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
