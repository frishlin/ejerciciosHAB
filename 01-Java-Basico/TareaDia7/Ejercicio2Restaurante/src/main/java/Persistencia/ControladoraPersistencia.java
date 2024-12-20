
package Persistencia;

import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Platillo;


public class ControladoraPersistencia {
    PlatilloJpaController platilloJpa = new PlatilloJpaController();
    
    //y ahora se crean los métodos CRUD clásicos
    
    //crear platillo
    public void crearPlatillo(Platillo platillo) {
        platilloJpa.create(platillo);
    }
    
    //borrar platillo
    public void borrarPlatillo(int id) {
        try {
            platilloJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //búsqueda
    public Platillo traerPlatillo(int id) {
        return platilloJpa.findPlatillo(id);
    }
    
    //lista completa para todeos los platillos
    public List<Platillo> traerPlatillos() {
        return platilloJpa.findPlatilloEntities();
    }
        
    //modificar platillo
    public void modificarPlatillo(Platillo platillo) {
        try {
            platilloJpa.edit(platillo);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
