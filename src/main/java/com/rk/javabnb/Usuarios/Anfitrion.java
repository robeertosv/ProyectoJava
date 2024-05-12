package com.rk.javabnb.Usuarios;

import com.rk.javabnb.Inmuebles.Inmueble;
import com.rk.javabnb.db.Database;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Anfitrion extends Cliente implements Serializable {
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

    /**
     * Permite al anfitrion crear un inmueble nuevo
     * @param inmueble El inmueble que ha creado
     * */
    public void addInmueble(Inmueble inmueble) {this.misInmuebles.add(inmueble);}

    /**
     * Elimina el inmueble
     * @param inmueble el inmueble a eliminar
     * */
    public void removeInmueble(Inmueble inmueble){this.misInmuebles.remove(inmueble);}
    /**
     * Devuelve los inmuebles de este anfitrion
     * @return un ArrayList con sus inmuebles
     * */
    public ArrayList<Inmueble> getMisInmuebles() {return this.misInmuebles;}

    /**
     * Devuelve el texto de Superanfitrion si este Anfitrion lo es
     * @return el texto que se deberá mostrar en las páginas de reserva
     * */
    public String getSuperS(){
        String texto = this.superAnfitrion ? "Superanfitrión" : " ";
        return texto;
        //devuelve si es un super anfitrion o no
    }

    /**
     * @return fecha del registro del anfitrion como un string para mostrarla
     * */
    public String getRegistroS(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String fechaString = this.fechaRegistro.format(formatter);
        return fechaString;
        //devuelve al fecha del registro del anfitrion como un string para mostrarla
    }

    /**
     * @return true si es superanfitrion*/
    public boolean isSuper(){return this.superAnfitrion;}
    /**
     * Calcula la valoración total del anfitrion, de todos sus inmuebles y modifica si es o no es superanfitrion
     * @return la valoración del anfitrion*/
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
    /**
     * Permite hacer que sea superanfitrion o deje de serlo
     * @param b es un boolean con el estado de superanfitrion
     * */
    public void setSuper(boolean b){
        superAnfitrion = b;
        Database.save();
    }
}
