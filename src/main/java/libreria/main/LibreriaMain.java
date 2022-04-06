package libreria.main;

import libreria.entities.Autor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class LibreriaMain {
    public static void main(String[] args) {

        EntityManagerFactory em = Persistence.createEntityManagerFactory("libreriaPU");
        EntityManager eman = em.createEntityManager();
        EntityTransaction transaction = eman.getTransaction();

        transaction.begin();

        Autor autor = new Autor();

        autor.setAlta(Boolean.TRUE);
        autor.setNombre("Fernando");

        eman.persist(autor);
        transaction.commit();



    }
}
