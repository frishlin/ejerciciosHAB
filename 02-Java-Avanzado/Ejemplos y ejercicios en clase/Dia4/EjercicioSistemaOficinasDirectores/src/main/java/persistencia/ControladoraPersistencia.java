
package persistencia;

import logica.Director;
import logica.Oficina;

public class ControladoraPersistencia {
    OficinaJpaController oficinaJpa = new OficinaJpaController();
    DirectorJpaController directorJpa = new DirectorJpaController();

    public void crearOficina(Oficina oficina) {
        oficinaJpa.create(oficina);
    }

    public void crearDirector(Director director) {
        directorJpa.create(director);
    }
}