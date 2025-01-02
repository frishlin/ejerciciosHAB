/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import logica.Oficina;

public class OficinaJpaController implements Serializable {
    private EntityManagerFactory emf = null;

    public OficinaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public OficinaJpaController() {
        this.emf = Persistence.createEntityManagerFactory("EjercicioSistemaOficinasDirectoresPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Oficina oficina) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();

            // Persistir el director si no está ya en la base de datos
            if (oficina.getUnDirector() != null && oficina.getUnDirector().getId() == null) {
                em.persist(oficina.getUnDirector());
            }

            em.persist(oficina);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void edit(Oficina oficina) throws Exception {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            oficina = em.merge(oficina);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw e;
        } finally {
            em.close();
        }
    }

    public void delete(Long id) throws Exception {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            Oficina oficina = em.find(Oficina.class, id);
            if (oficina == null) {
                throw new Exception("La oficina con id " + id + " no existe.");
            }
            em.remove(oficina);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
}
