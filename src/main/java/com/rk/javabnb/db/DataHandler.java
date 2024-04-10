package com.rk.javabnb.db;

import com.rk.javabnb.Usuarios.*;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class DataHandler {
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private ArrayList<Anfitrion> anfitriones = new ArrayList<Anfitrion>();
    private ArrayList<Direccion> direcciones = new ArrayList<Direccion>();
    private ArrayList<Inmueble> inmuebles = new ArrayList<Inmueble>();

    private String sessionID;

    public DataHandler() {
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("clientes.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(clientes);
            fileOutputStream.close();
            objectOutputStream.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error interno");
        }
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("anfitriones.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(anfitriones);
            fileOutputStream.close();
            objectOutputStream.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error interno");
        }
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("direcciones.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(direcciones);
            fileOutputStream.close();
            objectOutputStream.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error interno");
        }
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("inmuebles.dat");
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
            FileOutputStream fileOutputStream = new FileOutputStream("clientes.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(clientes);
            fileOutputStream.close();
            objectOutputStream.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error interno");
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
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error interno");
        }

    }
    public void actualizarAnfitriones(Anfitrion anfitrion){
        anfitriones.add(anfitrion);
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("anfitriones.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(anfitriones);
            fileOutputStream.close();
            objectOutputStream.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error interno");
        }
    }

    public void actualizarDirecciones(Direccion direccion){
        direcciones.add(direccion);
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("clientes.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(clientes);
            fileOutputStream.close();
            objectOutputStream.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error interno");
        }
    }

    public void actualizarInmuebles(Inmueble inmueble){
        inmuebles.add(inmueble);
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("clientes.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(clientes);
            fileOutputStream.close();
            objectOutputStream.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error interno");
        }
    }

    //añadir getters y readObject


    public ArrayList<Cliente> getClientes() {return clientes;}

    //metodo para ver si el correo existe
    //public boolean comprobarCorreo(String correo){}
}
