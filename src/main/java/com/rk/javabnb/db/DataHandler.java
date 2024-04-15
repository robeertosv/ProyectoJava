package com.rk.javabnb.db;

import com.rk.javabnb.Inmuebles.Direccion;
import com.rk.javabnb.Inmuebles.Inmueble;
import com.rk.javabnb.Usuarios.*;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

//TODO! LOS ARCHIVOS .DAT TIENEN QUE SER DIFERENTES PARA CADA ARRAY LIST!!!
public class DataHandler {
    public static List readData(String path) {
        List list = new ArrayList<>();
        try{
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            //terminar el codigo, hacer un metodo que lea todo al iniciarse el programa
            //incorporar en los contructores y actualizaciones writes, para actualizarlo
            //las listas completas de objetos tiene que ser de clase Main
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error interno");
        }
    }

    //lo que sigue aqui se podria borrar?, lo se sessionID no

    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private ArrayList<Anfitrion> anfitriones = new ArrayList<Anfitrion>();
    private ArrayList<Direccion> direcciones = new ArrayList<Direccion>();
    private ArrayList<Inmueble> inmuebles = new ArrayList<Inmueble>();

    private String sessionID;

    public DataHandler() {
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("clientes.res");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(clientes);
            fileOutputStream.close();
            objectOutputStream.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error interno");
        }
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("anfitriones.res");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(anfitriones);
            fileOutputStream.close();
            objectOutputStream.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error interno");
        }
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("direcciones.res");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(direcciones);
            fileOutputStream.close();
            objectOutputStream.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error interno");
        }
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("inmuebles.res");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(inmuebles);
            fileOutputStream.close();
            objectOutputStream.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error interno");
        }
    }
    public void actualizarClientes(Cliente cliente){
        clientes.add(cliente);
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("clientes.res");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(clientes);
            fileOutputStream.close();
            objectOutputStream.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error interno ID: CANNOT_RETRIEVE_CLIENT_DB");
        }
    }

    public void actualizarSID(String SID) {
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("sid.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(SID);
            fileOutputStream.close();
            objectOutputStream.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error interno ERROR_SESSION_ID");
        }

    }
    public void actualizarAnfitriones(Anfitrion anfitrion){
        anfitriones.add(anfitrion);
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("anfitriones.res");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(anfitriones);
            fileOutputStream.close();
            objectOutputStream.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error interno\nERROR_UPDATE_HOST");
        }
    }

    public void actualizarDirecciones(Direccion direccion){
        direcciones.add(direccion);
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("clientes.res");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(clientes);
            fileOutputStream.close();
            objectOutputStream.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error interno\nERROR_UPDATE_DIR");
        }
    }

    public void actualizarInmuebles(Inmueble inmueble){
        inmuebles.add(inmueble);
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("clientes.res");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(clientes);
            fileOutputStream.close();
            objectOutputStream.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error interno\nERROR_UPDATE_HOUSE");
        }
    }

    //añadir getters y readObject


    public ArrayList<Cliente> getClientes() {return clientes;}

    //metodo para ver si el correo existe
    public boolean comprobarCorreo(String correo){
        boolean nuevo = true;
        for(Cliente c: clientes){
            if(c.getEmail().equals(correo)){
                nuevo = false;
            }
        }
        return nuevo;
    }

}
