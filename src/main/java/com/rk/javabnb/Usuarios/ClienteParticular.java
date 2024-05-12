package com.rk.javabnb.Usuarios;

import com.rk.javabnb.Inmuebles.Inmueble;
import com.rk.javabnb.db.Database;

import java.io.Serializable;
import java.util.ArrayList;

public class ClienteParticular extends Cliente implements Serializable {
    public boolean isVIP;
    private TarjetaCredito tarjeta;
    private ArrayList<Inmueble> inmueblesReservados = new ArrayList<>();
    private ArrayList<Inmueble> inmueblesValorados = new ArrayList<>();

    public ClienteParticular(String clave, String DNI, String email, String nombre, int tfno) {
        super(clave, DNI, email, nombre, tfno);
        this.isVIP = false;
        Database.addCliente(this);
        System.out.println("Se acaba de añadir un cliente a la DB" + this.getNombre());
        Database.save();
    }

    /**@return la tarjeta del ClienteParticular*/
    public TarjetaCredito getTarjeta() {return tarjeta;}

    /**sirve para mostrar el número de la tarjeta o informar sobre su ausencia en el perfil o preview del cliente
     * @return el texto a mostrar*/
    public String getTarjetaS(){
        String text = this.tarjeta!=null?this.tarjeta.getNumeroS():"Todavía no ha sido configurado ningún método de pago";
        return text;
        //sirve para mostrar el número de la tarjeta o informar sobre su ausencia en el perfil o preview del cliente
    }
    /**@return true si es VIP*/
    public boolean isVIP() {return isVIP;}

    /**@return el texto que se debe mostrar si el ClienteParticular es VIP*/
    public String getVIPS(){
        String status = isVIP ? "VIP" : "no VIP";
        return status;
    }
    /**@param tarjeta es la tarjeta asociada al ClienteParticular*/
    public void setTarjeta(TarjetaCredito tarjeta) {
        this.tarjeta = tarjeta;
        Database.save();
    }

    /**
     * Sirve para saber que inmuebles ha valorado este ClienteParticular y que de esta manera no pueda valorar varias veces el mismo inmueble
     * @param i el inmueble que ha valorado
     * */
    public void addInmuebleValorado(Inmueble i) { this.inmueblesValorados.add(i); Database.save(); }

    /**
     * @return los inmuebles valorados por este ClienteParticular*/
    public ArrayList<Inmueble> getInmueblesValorados() { return this.inmueblesValorados; }

    /**
     * Hace que este ClienteParticular sea VIP
     */
    public void hacerVIP(){
        this.isVIP = true;
        Database.save();
    }

    /**
     * Hace que este ClienteParticular deje de ser VIP*/

    public void noVIP() {
        this.isVIP = false;
        Database.save();
    }
}
