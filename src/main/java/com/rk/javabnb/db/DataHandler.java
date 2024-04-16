package com.rk.javabnb.db;

import com.rk.javabnb.Inmuebles.Inmueble;
import com.rk.javabnb.Usuarios.Cliente;

//import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

//ODO! LOS ARCHIVOS .DAT TIENEN QUE SER DIFERENTES PARA CADA ARRAY LIST!!!
public class DataHandler {
    private String sessionID;

    public ArrayList<Cliente> leerClientes() {
        ArrayList<Cliente> clientes = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream("clientesParitculares.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            while(true){
                try{
                    Cliente cliente = (Cliente) objectInputStream.readObject();
                    clientes.add(cliente);
                }catch (EOFException e){
                    break;
                }catch (ClassNotFoundException e){
                    e.printStackTrace();
                    break;
                }
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
            while(true){
                try{
                    Inmueble inmueble = (Inmueble) objectInputStream.readObject();
                    inmuebles.add(inmueble);
                }catch (EOFException e){
                    break;
                }catch (ClassNotFoundException e){
                    e.printStackTrace();
                    break;
                }
            }
            fileInputStream.close();
            objectInputStream.close();
        } catch (IOException e) {
            //JOptionPane.showMessageDialog(null, "Ha ocurrido un error interno");
            System.out.println("Problema al leer inmuebles");
        }
        return inmuebles;
    }
}
