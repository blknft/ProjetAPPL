package test;

import pappl.entitiesmongo.jeuDeDonnees;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.*;
import pappl.entities.*;
import pappl.view.*;

public class Main {
    public static GUI g = new GUI();
    public static EntityManagerFactory factory;
    public static final String MONGO_PROVIDER = "mongodb";
    public static void main(String[] args) {
        factory=Persistence.createEntityManagerFactory(MONGO_PROVIDER);
        EntityManager em=factory.createEntityManager();
        System.out.println("\nTesting find() by Id.\n");
        
        Query qu=em.createNativeQuery("db.jeuDeDonnees.findOne({\"ID\":1})", jeuDeDonnees.class);
        jeuDeDonnees order=(jeuDeDonnees)qu.getSingleResult();
        System.out.println("Found order:" +order.getAdresse() );
        em.close();
    }
}
