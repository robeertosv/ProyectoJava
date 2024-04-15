package com.rk.javabnb.Usuarios;

import com.rk.javabnb.Inmuebles.Inmueble;
import com.rk.javabnb.db.DataHandler;

import java.io.Serializable;

public class ClienteParticular extends Cliente implements Serializable {
    public boolean isVIP;
    private TarjetaCredito tarjeta;

    public ClienteParticular(String clave, String DNI, String email, String nombre, int tfno, DataHandler dataHandler) {
        super(clave, DNI, email, nombre, tfno, dataHandler);
        this.isVIP = false;
    }

    public TarjetaCredito getTarjeta() {return tarjeta;}
    public boolean isVIP() {return isVIP;}
    public void setTarjeta(TarjetaCredito tarjeta) {this.tarjeta = tarjeta;}

    public void hacerVIP(){

        this.isVIP = true;
    }

    public void buscarInmuebles(){}

    public void getReservas(){}

    public void reservar(Inmueble inmueble){}

    public void valorarInmueble(Inmueble inmueble, double valoracion, String comentario){}
}
