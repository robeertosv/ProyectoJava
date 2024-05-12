/*
 * TODO: CAMBIAR LOS println() por su dialog correspondiente
 */

package com.rk.javabnb.Usuarios;

import com.rk.javabnb.Inmuebles.Inmueble;
import com.rk.javabnb.db.Database;

import java.io.Serializable;
import java.util.ArrayList;

public class Admin implements Serializable{
    private static final String clave = "admin";
    private static final String correo = "admin@javabnb.com";

    public Admin() {
        Database.save();
    }

    /**@return Correo electrónico del Admin*/
    public static String getEmail() {
        return correo;
    }

    /**
     * Comprueba que la contraseña del Admin sea correcta
     * @return true si es correcta
     * */
    public static boolean checkPassword(char[] pass) {
        String passwd = String.valueOf(pass);
        return passwd.equals(clave);
        //verifica si la contraseña es correcta
    }
}
