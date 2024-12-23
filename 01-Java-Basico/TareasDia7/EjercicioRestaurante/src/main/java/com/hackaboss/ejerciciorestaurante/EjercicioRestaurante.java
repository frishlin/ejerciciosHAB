/*
Un restaurante necesita un programa para almacenar en una base de datos sus diferentes platillos del menú. 
De cada uno de estos se almacena: id, nombre, receta, precio.
Sabiendo esto:
Crear una base de datos llamada restaurante. Dejarla completamente vacía.
Realizar las configuraciones necesarias para implementar JPA en el proyecto. Esto incluye:
Mapeo mediante annotations
Creación de la unidad de persistencia
Creación de los paquetes para representar capas (logica y persistencia)
Creación de las clases controladoras: para la lógica y para la persistencia.
Creación de los respectivos JPA Controller.
Crear un nuevo objeto platillo y darlo de alta en la base de datos mediante JPA.
Crear 2 objetos de tipo platillo más. Eliminar luego uno y editar los datos de otro mediante JPA.
Obtener de la base de datos los platillos restantes en la base de datos y mostrarlos por pantalla.

Recomendación: Para este ejercicio te recomendamos utilizar MAVEN como gestor de dependencias para obtener de forma más sencilla las dependencias necesarias de JPA y MySql. Recuerda que si todo sale bien, la tabla platillo se creará de forma automática.

*/
package com.hackaboss.ejerciciorestaurante;

import java.util.List;
import logica.Platillo;
import persistencia.ControladoraPersistencia;


public class EjercicioRestaurante {

    public static void main(String[] args) {
        ControladoraPersistencia controlPersis = new  ControladoraPersistencia(); //con esto ya se pueden acceder a todos los métodos CRUD creados
        controlPersis.crearPlatillo(new Platillo(1, "pizza hawaiana", "receta pizza", 180.0));
        controlPersis.crearPlatillo(new Platillo(2, "tacos al pastor", "receta tacos", 80.0));
        controlPersis.crearPlatillo(new Platillo(3, "Milanesa a la napolitana", "receta milanesa", 120.0));

        
        System.out.println("----ANTES----");
        List<Platillo> listaPlatillos = controlPersis.traerPlatillos();
        
        //mostrar el ANTES DE LAS ADECUACIONES          //Es mala práctica duplicar código, es mejor usar un método
        /*for(Platillo plat:listaPlatillos) {
            System.out.println(plat.toString());
        }*/
        recorrerLista(listaPlatillos);
        
        //eliminar el registro 1
        controlPersis.borrarPlatillo(1);
        
        //modificar un platillo
        controlPersis.modificarPlatillo(new Platillo(2, "tacos al pastor con piña", "receta tacos", 80.0));
        
 
        //mostrar un platillo en particular
        //Platillo platillo = controlPersis.traerPlatillo(2);
        
        
        //mostrar todo DESPUÉS DE LAS ADECUACIONES      //Es mala práctica duplicar código, es mejor usar un método
        System.out.println("----DESPUÉS----");
        listaPlatillos = controlPersis.traerPlatillos();
        
        /*for(Platillo plat:listaPlatillos) {               
            System.out.println(plat.toString());
        }*/
        recorrerLista(listaPlatillos);
    }
    
    //método para mostrar platillos
    //cuando el método está en Main, debe ser static
    public static void recorrerLista(List<Platillo>listaPlatillos) {
        for(Platillo plat:listaPlatillos) {
            System.out.println(plat.toString());
        }
    }
}
