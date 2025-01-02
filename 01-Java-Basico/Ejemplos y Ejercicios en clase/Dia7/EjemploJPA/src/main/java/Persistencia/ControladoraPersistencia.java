
package Persistencia;

import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Persona;


public class ControladoraPersistencia {
    //se creará un objeto de tipo persona
    //alta de una persona
    PersonaJpaController persoJpa = new PersonaJpaController(); //con esto ya se pueden utilizar todos los métodos, se crea una instancia
    
    public void crearPersona(Persona perso) {
        persoJpa.create(perso);
        
    }
    
    //baja de una persona
    public void borrarPersona(int id) {
        try {
            persoJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //buscar una persona
    public Persona traerPersona(int id) {
        return persoJpa.findPersona(id);
    }
    
    //traer todas las personas
    public List<Persona>traerPersonas() {
        return persoJpa.findPersonaEntities();
    }
    
    //Persona que llega como parámetro es la persona con los datos nuevos a modificar
    public void modificarPersona(Persona pers) {
        try {
            persoJpa.edit(pers);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}


/*
CRUD
    CREATE - ALTA
    READ - LECTURA
    UPDATE - ACTUALIZAR/MODIFICAR
    DELETE - BAJA
*/