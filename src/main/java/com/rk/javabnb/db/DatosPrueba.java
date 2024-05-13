package com.rk.javabnb.db;


import com.rk.javabnb.Inmuebles.*;
import com.rk.javabnb.Usuarios.*;

import java.io.File;
import java.time.LocalDate;

public class DatosPrueba {

    public DatosPrueba()  {
        this.createData();
    }

    /**
     * Crea los datos de prueba para tener usuarios e inmuebles ya creados, de esta manera es más sencillo hacer el testing de la app
     * */
    public void createData() {
        new Admin();
        ClienteParticular luis = new ClienteParticular("clave", "87654321A", "luis@luis.com", "Luis Fernández", 653111000);
        ClienteParticular roberto = new ClienteParticular("clave", "09854422A", "roberto@roberto.com", "Roberto", 640000111);

        Anfitrion katia = new Anfitrion("clave", "09854422A", "katia@katia.com", "Katia", 680000111);
        Anfitrion lucas = new Anfitrion("clave", "12345678A", "lucas@lucas.com", "Lucas García", 625000999);


        TarjetaCredito cardRoberto = new TarjetaCredito(LocalDate.now(), 1234567812345678l, "Roberto");
        roberto.setTarjeta(cardRoberto);

        TarjetaCredito cardLuis = new TarjetaCredito(LocalDate.now(), 8765432187654321l, "Luis Fernández");
        luis.setTarjeta(cardLuis);

        Inmueble casa1 = new Inmueble("Casa Alcalá", 'c', "aire acondicionado, wifi", 100,  System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "Casa Alcalá.png", new Direccion("Alcalá" ,"Rosales", 3, 28806), new DatosInmueble(2, 3, 3, 3,"Casa acogedora en el centro de Alcalá de Henares, podrás pasarlo super bien"),katia);
        Inmueble casa2 = new Inmueble("Casa Madrileña", 'c', "piscina", 80,  System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "Casa Madrileña.png", new Direccion("Madrid" ,"Margaritas", 3, 28005), new DatosInmueble(2, 3, 3, 3,"Casa bonita perfecta para pasar un finde semana con amigos"),katia);
        Inmueble casa3 = new Inmueble("Casa Fiestas", 'c', "wifi", 90,  System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "Casa Fiestas.png", new Direccion("Cuenca" ,"Pantanos", 5, 28006), new DatosInmueble(2, 3, 3, 3,"Casa con un ambiente familiar en el que poder descansar"),katia);

        Inmueble apartamento1 = new Inmueble("Apartamento Centro", 'a', "cocina, discoteca", 99,  System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "Apartamento Centro.png",new Direccion("Madrid", "Callao", 3, 28803), new DatosInmueble(2,2,2,2,"Apartamento bien ubicado, restaurantes y zonas de ocio cercanas"),lucas);
        Inmueble apartamento2 = new Inmueble("Apartamento Gran Vía", 'a', "limpieza", 102,  "", new Direccion("Madrid", "Gran Vía", 180, 28805), new DatosInmueble(2,2,2,2,"Apartamento bien ubicado, en pleno corazón de Madrid"),lucas);
        Inmueble apartamento3 = new Inmueble("Apartamento Campanadas", 'a', "WiFi", 200,  "",new Direccion("Madrid", "Puerta del Sol", 7, 28001), new DatosInmueble(2,2,2,2,"Apartamento perfecto para ver las uvas"),katia);

        new Reserva(casa1, roberto, LocalDate.of(2024, 4, 29), LocalDate.of(2024, 5, 2), 2);
        new Reserva(apartamento2, luis, LocalDate.of(2024, 5, 1), LocalDate.of(2024, 6, 3), 1);

        casa1.addResena(2);
        casa2.addResena(5);
        casa3.addResena(1);

        apartamento1.addResena(4);
        apartamento2.addResena(5);
        apartamento3.addResena(5);
        apartamento2.addResena(4);
        Database.save();

    }
}
