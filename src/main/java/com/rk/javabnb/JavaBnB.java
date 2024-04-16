package com.rk.javabnb;

import com.rk.javabnb.Inmuebles.DatosInmueble;
import com.rk.javabnb.Inmuebles.Direccion;
import com.rk.javabnb.Inmuebles.Inmueble;
import com.rk.javabnb.Usuarios.*;
import com.rk.javabnb.db.DataHandler;
import com.rk.javabnb.db.Database;
import com.rk.javabnb.Usuarios.ClienteParticular;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JavaBnB implements Serializable {

    /*public static void main(String[] args) throws IOException {
        /*DataHandler dataHandler = new DataHandler();
        ArrayList<Cliente> clientes = dataHandler.leerClientes();
        ArrayList<Inmueble> inmuebles = dataHandler.leerInmuebles();

        Admin admin = new Admin();
        Cliente roberto = new Cliente("74hGdnfj3", "12345678G", "resvolkava@gmail.com", "Roberto Seco", 640721423, clientes);
        Direccion d1 = new Direccion("Madrid","Calle Alcalá",5,28803);
        DatosInmueble di1 = new DatosInmueble(2,4,3,6);
        //Inmueble inmueble1 = new Inmueble ("SolMar",'C', new String[],120, {"foto playa","foto cocina", "foto dormitorio..."},d1,di1);


        dataHandler.guardarClientes(clientes);
        dataHandler.guardarInmuebles(inmuebles);

        /*ArrayList<Cliente> clientesLeidos = new ArrayList<>();
        try{
            FileInputStream fileInputStream = new FileInputStream("clientes.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            clientesLeidos = (ArrayList<Cliente>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        for(Cliente c: clientesLeidos){
            System.out.println(c.getEmail());
        }
    }*/
    public static void main(String[] args) {
        Database db = new Database();

        ClienteParticular luis = new ClienteParticular("sd", "780A", "re.com", "LUIS", 980);
        ClienteParticular roberto = new ClienteParticular("clabve", "098547422A", "resvolkava@gmail.com", "Roberto", 640721423);
        Anfitrion katia = new Anfitrion("clave", "Z48540189A", "katia@katia.com", "Katia", 680997055);
        TarjetaCredito card = new TarjetaCredito(LocalDate.now(), 874, "Roberto");
        ClienteParticular roberto2 = new ClienteParticular("clabve", "098547422A", "resvolkava@gmail.com", "Roberto", 640721423);


        for(ClienteParticular c : Database.getClientes()){
            System.out.println(c.getName());
        }


    }
}
