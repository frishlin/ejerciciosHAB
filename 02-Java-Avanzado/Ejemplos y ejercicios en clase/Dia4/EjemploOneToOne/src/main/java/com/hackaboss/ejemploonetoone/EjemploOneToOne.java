package com.hackaboss.ejemploonetoone;

import logica.Carro;
import logica.Propietario;
import persistencia.ControladoraPersistencia;


public class EjemploOneToOne {

    public static void main(String[] args) {
        ControladoraPersistencia controlPersis = new ControladoraPersistencia();
        
        Propietario prop = new Propietario(12L, "juan", "perez", "123","casado",null);
        Carro carro = new Carro(14L, "Onix", "Chevrolet", prop);
        
        //controlPersis.crearPropietario(prop);
        controlPersis.crearCarro(carro);
    }
}
