package com.hackaboss;

import Persistencia.ControladoraPersistencia;
import java.util.List;
import logica.Platillo;


public class Ejercicio2Restaurante {

    public static void main(String[] args) {
        ControladoraPersistencia controlPersis = new ControladoraPersistencia();
        
        controlPersis.crearPlatillo(new Platillo(1,"Milanesa a la napolitana", "receta de milanesa", 7));
        controlPersis.crearPlatillo(new Platillo(2,"Tacos de pastor", "receta de tacos", 10));
        controlPersis.crearPlatillo(new Platillo(3,"Albóndigas", "receta de albóndigas", 50));

        
        //ANTES
        System.out.println("ANTES");
        List<Platillo> listaPlatillos = controlPersis.traerPlatillos();
        for(Platillo plat: listaPlatillos) {
            System.out.println(plat.toString());
        }
        
        //BORRAMOS
        controlPersis.borrarPlatillo(1);
        
        //EDITAMOS
        controlPersis.modificarPlatillo(new Platillo(2, "Tacos de pastor con piña", "receta de tacos", 10));
        
        
        //DESPUÉS
        System.out.println("DESPUÉS");
        for(Platillo plat: listaPlatillos) {
            System.out.println(plat.toString());
        }
    }
}
