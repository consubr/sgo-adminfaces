package com.canini.sgo.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author danilo
 */
public class JPAUtil {
    
    private static EntityManagerFactory entityManagerFactory = Persistence
            .createEntityManagerFactory("sgo2");
    
    public EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }
    
}
