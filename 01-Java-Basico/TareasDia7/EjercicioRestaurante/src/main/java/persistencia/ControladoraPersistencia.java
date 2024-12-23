
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Platillo;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
     PlatilloJpaController platilloJpa = new PlatilloJpaController();

     //crear métodos CRUD
     public void crearPlatillo(Platillo platillo) {
         platilloJpa.create(platillo);
     }
     
     //borrar un platillo
     public void borrarPlatillo(int id) {
         try {
             platilloJpa.destroy(id);
         } catch (NonexistentEntityException ex) {
             Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
         }
         
     }
     
     //buscar un platillo  - función que trae un platillo en específico
     public Platillo traerPlatillo(int id) {
         return platilloJpa.findPlatillo(id);
     }
     
     //lista completa de todos platillos
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

