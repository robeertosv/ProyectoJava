package com.rk.javabnb.Usuarios;

import com.rk.javabnb.Inmuebles.Inmueble;
import com.rk.javabnb.db.Database;

import java.io.Serializable;
import java.util.ArrayList;

public class ClienteParticular extends Cliente implements Serializable {
    public boolean isVIP;
    private TarjetaCredito tarjeta;
    private ArrayList<Inmueble> inmueblesReservados = new ArrayList<>();

    public ClienteParticular(String clave, String DNI, String email, String nombre, int tfno) {
        super(clave, DNI, email, nombre, tfno);
        this.isVIP = false;
        Database.addCliente(this);
        Database.save();
    }

    public TarjetaCredito getTarjeta() {return tarjeta;}
    public String getTarjetaS(){
        String text = this.tarjeta!=null?this.tarjeta.getNumeroS():"Todavía no ha sido configurado ningún método de pago";
        return text;
        //sirve para mostrar el número de la tarjeta o informar sobre su ausencia en el perfil o preview del cliente
    }
    public boolean isVIP() {return isVIP;}
    public String getVIPS(){
        String status = isVIP ? "VIP" : "no VIP";
        return status;
    }
    public void setTarjeta(TarjetaCredito tarjeta) {
        this.tarjeta = tarjeta;
        Database.save();
    }

    public void hacerVIP(){
        this.isVIP = true;
        Database.save();
    }
}
