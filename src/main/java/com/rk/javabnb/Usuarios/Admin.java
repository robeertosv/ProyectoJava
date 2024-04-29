/*
 * TODO: CAMBIAR LOS println() por su dialog correspondiente
 */

package com.rk.javabnb.Usuarios;

import com.rk.javabnb.Inmuebles.Inmueble;
import com.rk.javabnb.db.Database;

import java.io.Serializable;
import java.util.ArrayList;

public class Admin implements Serializable{
    private static final String clave = "clave";
    private static final String correo = "admin@javabnb.com";

    public Admin() {
        Database.save();
    }

    public static String getEmail() {
        return correo;
    }

    public static boolean checkPassword(char[] pass) {
        String passwd = String.valueOf(pass);
        return passwd.equals(clave);
        //verifica si la contraseña es correcta
    }

    /*public void setFirstPass(String clave) {
        if (this.clave == null) {
            this.clave = clave;
        }
    }

    public void actualizarClave(String claveActual, String nuevaClave) {
        if (this.clave != claveActual) {
            System.out.println("Las claves no coinciden");
            return;
        }

        if (nuevaClave.length() < 8) {
            System.out.println("Clave demasiado corta");
            return;
        }
        System.out.println("Clave actualizada");
        this.clave = nuevaClave;

    }*/
}
