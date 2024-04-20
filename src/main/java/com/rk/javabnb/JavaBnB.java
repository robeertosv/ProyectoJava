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

        if(Database.getCurrentUser().size() != 0) {
            new Home();
        }else {
            new Login();
        }
    }
}
