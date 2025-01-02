
package persistencia;

import logica.Carro;


public class ControladoraPersistencia {
    CarroJpaController carroJpa = new CarroJpaController();
    PropietarioJpaController propJpa = new PropietarioJpaController();
    
    public void crearCarro(Carro carro) {
        carroJpa.create(carro);
    }
}
