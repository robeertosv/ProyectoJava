package com.rk.javabnb.db;

import com.rk.javabnb.Inmuebles.Inmueble;
import com.rk.javabnb.Usuarios.Cliente;

//import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

//TODO! LOS ARCHIVOS .DAT TIENEN QUE SER DIFERENTES PARA CADA ARRAY LIST!!!
public class DataHandler {
    private String sessionID;


    public DataHandler() {

    }

    public ArrayList<Cliente> leerClientes() {
        ArrayList<Cliente> clientes = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream("clientes.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            try {
                clientes = (ArrayList<Cliente>) objectInputStream.readObject();
            }catch(ClassNotFoundException e){
                e.printStackTrace();
            }
            fileInputStream.close();
            objectInputStream.close();
        } catch (IOException e) {
            //JOptionPane.showMessageDialog(null, "Ha ocurrido un error interno");
            System.out.println("Problema al leer clientes");
        }
        return clientes;
    }

    public ArrayList<Inmueble> leerInmuebles() {
        ArrayList<Inmueble> inmuebles = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream("inmuebles.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            try{
                    inmuebles = (ArrayList<Inmueble>) objectInputStream.readObject();
                    fileInputStream.close();
                    objectInputStream.close();
            }catch (ClassNotFoundException e){
                    e.printStackTrace();
            }
        }catch (IOException e) {
            //JOptionPane.showMessageDialog(null, "Ha ocurrido un error interno");
            System.out.println("Problema al leer inmuebles");
        }
        return inmuebles;
    }

    public void guardarClientes(ArrayList<Cliente> clientes) {
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("clientes.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            for (Cliente cliente : clientes) {
                objectOutputStream.writeObject(cliente);
            }
            objectOutputStream.close();
            fileOutputStream.close();
        }catch(IOException e){
            //JOptionPane.showMessageDialog(null, "Ha ocurrido un error interno");
            System.out.println("Problema al guardar clientes");
        }

    }

    public void guardarInmuebles(ArrayList<Inmueble> inmuebles) {
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("inmuebles.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            for (Inmueble inmueble : inmuebles) {
                objectOutputStream.writeObject(inmueble);
            }
            objectOutputStream.close();
            fileOutputStream.close();
        }catch(IOException e){
            //JOptionPane.showMessageDialog(null, "Ha ocurrido un error interno");
            System.out.println("Problema al guardar inmuebles");
        }

    }

    public String getSID() {
        return this.sessionID;
    }

}
