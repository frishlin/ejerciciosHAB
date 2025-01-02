/*
Implementa un sistema para una empresa que gestiona oficinas y directores. 
Cada oficina tiene asignado un solo director, y cada director tiene asignada una sola oficina. 
Tu tarea es modelar estas dos entidades utilizando una relación @OneToOne. 
Debés crear las clases Oficina y Director con sus respectivos atributos 
y asegurarte de mapear correctamente la relación entre ambas.
Además, implementa una clase de prueba que simule la creación de al menos una oficina con su respectivo director, 
persistiendo los datos en una base de datos utilizando JPA.
Requerimientos:
Las entidades deben incluir los atributos que consideres necesarios (por ejemplo, nombre del director, 
número de la oficina, etc.).
Mapear la relación utilizando la anotación @OneToOne.
Configurá correctamente la bidireccionalidad de la relación si es necesario.
Incluí las configuraciones necesarias para persistir las entidades en una base de datos.
*/

package com.hackaboss.ejerciciosistemaoficinasdirectores;

import logica.Director;
import logica.Oficina;
import persistencia.ControladoraPersistencia;

public class EjercicioSistemaOficinasDirectores {

    public static void main(String[] args) {
        ControladoraPersistencia controlPersis = new ControladoraPersistencia();

        Director director = new Director(null, "Luis", "Juárez", "luis.juarez@example.com", "123", null);
        Oficina oficina = new Oficina(null, "Oficina Principal", "Planta Baja", 25, "Administrativa", director);
        director.setOficina(oficina);

        // Persistir datos
        controlPersis.crearDirector(director);
        //controlPersis.crearOficina(oficina);
    }
}