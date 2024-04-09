package com.rk.javabnb;

import com.rk.javabnb.Usuarios.*;
import java.io.*;
import java.util.ArrayList;

public class JavaBnB implements Serializable {

    public static void main(String[] args) throws IOException {
        Admin admin = new Admin();
        Cliente roberto = new Cliente();

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        roberto.registrar("Roberto Seco", "resvolkava@gmail.com", "robertoPass", "09854422A", 640721423);
        clientes.add(roberto);

        FileOutputStream fos = new FileOutputStream("./db/usuarios.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(clientes);
        oos.close();


    }
}
