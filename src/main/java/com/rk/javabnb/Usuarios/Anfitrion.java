package com.rk.javabnb.Usuarios;

import com.rk.javabnb.Inmuebles.Inmueble;
import com.rk.javabnb.db.Database;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Anfitrion extends Cliente implements Serializable {
    //y sus datos bancarios?
    private LocalDate fechaRegistro;
    private boolean superAnfitrion;
    private ArrayList<Inmueble> misInmuebles = new ArrayList<>();
    private double valoracion = 0;

    public Anfitrion(String clave, String DNI, String email, String nombre, int tfno)  {
        super(clave, DNI, email, nombre, tfno);
        this.fechaRegistro = LocalDate.now();
        this.superAnfitrion = false;
        Database.addAnfitrion(this);
        Database.save();
    }

    public void addInmueble(Inmueble inmueble) {this.misInmuebles.add(inmueble);}
    public void removeInmueble(Inmueble inmueble){this.misInmuebles.remove(inmueble);}
    public ArrayList<Inmueble> getMisInmuebles() {return this.misInmuebles;}

    public String getSuperS(){
        String texto = this.superAnfitrion ? "Superanfitrión" : " ";
        return texto;
        //devuelve si es un super anfitrion o no
    }
    public String getRegistroS(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String fechaString = this.fechaRegistro.format(formatter);
        return fechaString;
        //devuelve al fecha del registro del anfitrion como un string para mostrarla
    }
    public boolean isSuper(){return this.superAnfitrion;}
    public int getValoracion(){
        int suma = 0;
        int vecesValorado = 0;
        for(Inmueble inmueble : misInmuebles) {
            suma+=inmueble.getSumaCalificaciones();
            vecesValorado+=inmueble.getVecesValorado();
        }
        int total = suma/vecesValorado;
        this.valoracion = total;
        if(total>=4){
            this.setSuper(true);
        }else{this.setSuper(false);}
        Database.save();
        return total;
        //calcula la valoración total del anfitrion, de todos sus inmuebles y modifica si es o no es superanfitrion
    }
    public void setSuper(boolean b){
        superAnfitrion = b;
        Database.save();
    }
}
