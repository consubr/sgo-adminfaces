package com.canini.sgo.util;

import javax.persistence.EntityManager;

import com.canini.sgo.model.Cliente;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author danilo
 */
public class TesteJPA {
    
    public static void main(String[] args) {
        
        double inicio = System.currentTimeMillis();
        
         Cliente cliente = new Cliente();
         cliente.setNome("Fernando Almeida");
         cliente.setTelefone("32333873");
         cliente.setEndereco("Av. Fermino Corazza");
         cliente.setEmail("danilodecanini@gmail.com");      
        
        
        EntityManager em = new JPAUtil().getEntityManager();
        
        em.getTransaction().begin();

        em.persist(cliente);

        em.getTransaction().commit();
        em.close();        
        
        double fim = System.currentTimeMillis();
        System.out.println("Executado em: " + (fim - inicio)/1000 + "s");
        
    }
    
}
