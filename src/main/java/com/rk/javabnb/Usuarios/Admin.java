/*
 * TODO: CAMBIAR LOS println() por su dialog correspondiente
 */

package com.rk.javabnb.Usuarios;

public class Admin {
    private String clave;
    private static final String correo = "admin@javabnb.com";

    public Admin() {
    }

    public static String getCorreo() {
        return correo;
    }

    public boolean claveCorrecta(String clave) {
        return true ? clave == this.clave : false;
    }

    public void setFirstPass(String clave) {
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

    }
}
