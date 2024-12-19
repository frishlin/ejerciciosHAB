
package com.mycompany.ejemplojpa;

import Persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.List;
import logica.Persona;


public class EjemploJPA {

    public static void main(String[] args) {
        //ahora se hace una instancia de la controladora de persistencia para que se comuniquen las clases
        ControladoraPersistencia controlPersis = new ControladoraPersistencia();
        
        //creo 3 personas en la BD
        controlPersis.crearPersona(new Persona(1, "Yo", 42));
        controlPersis.crearPersona(new Persona(2, "Luisiana", 33));
        controlPersis.crearPersona(new Persona(3, "Alguien", 20));

        //Mostrar a las 3 personas creadas
        //ArrayList<Persona>listaPersonas = controlPersis.traerPersonas(); Esto no se puede hacer
        List<Persona>listaPersonas = controlPersis.traerPersonas();
        
        //recorrer
        for(Persona per:listaPersonas) {
            System.out.println("Persona: " + per.getNombre());
        }
        
        //borrar persona
        controlPersis.borrarPersona(2);
        
        controlPersis.modificarPersona(new Persona(3,"Alejandra", 45));
    }
}
