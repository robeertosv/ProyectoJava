package com.rk.javabnb.Usuarios;

import java.io.Serializable;

public class ClienteParticular extends Cliente implements Serializable {
    public boolean isVIP;
    private TarjetaCredito tarjeta;

    public ClienteParticular() {
        this.isVIP = false;
    }

    public void buscarInmuebles(){}

    public void getReservas(){}

    public void reservar(Inmueble inmueble){}

    public void valorarInmueble(Inmueble inmueble, double valoracion, String comentario){}
}
