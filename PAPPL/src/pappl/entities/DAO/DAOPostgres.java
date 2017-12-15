package pappl.entities.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class DAOPostgres {
    private static final String PERSISTENCE_UNITE_NAME = "PAPPLPU";
    private EntityManagerFactory factory;
    private EntityManager em;

    public DAOPostgres() {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNITE_NAME);
        em = factory.createEntityManager();
    }

    public static String getPersistenceUniteName() {
        return PERSISTENCE_UNITE_NAME;
    }

    public EntityManagerFactory getFactory() {
        return factory;
    }

    public void setFactory(EntityManagerFactory factory) {
        this.factory = factory;
    }

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
}
