package com.rk.javabnb.Usuarios;

public class Cliente {
    private String clave;
    private String DNI;
    private String email;
    private String nombre;
    private int tfno;


    public void register(String clave, String DNI, String email, String nombre, int tfno) {
        //COMPROBAR SI YA EXISTE

        this.clave = clave;
        this.DNI = DNI;
        this.email = email;
        this.nombre = nombre;
        this.tfno = tfno;
    }

    public void login(String email, String clave) {
        //SetLoginState
    }
}
