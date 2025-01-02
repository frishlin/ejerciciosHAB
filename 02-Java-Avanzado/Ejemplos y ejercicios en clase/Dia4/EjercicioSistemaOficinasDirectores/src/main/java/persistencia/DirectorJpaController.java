/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import logica.Director;

public class DirectorJpaController implements Serializable {
    private EntityManagerFactory emf = null;

    public DirectorJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public DirectorJpaController() {
        this.emf = Persistence.createEntityManagerFactory("EjercicioSistemaOficinasDirectoresPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Director director) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(director);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void edit(Director director) throws Exception {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            director = em.merge(director);
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
            Director director = em.find(Director.class, id);
            if (director == null) {
                throw new Exception("El director con id " + id + " no existe.");
            }
            em.remove(director);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
}
