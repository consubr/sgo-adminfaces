package com.canini.sgo.controller;

import com.canini.sgo.dao.DAO;
import com.canini.sgo.model.Cliente;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author danilo
 */
@ManagedBean
public class ClienteController {
    
    private Cliente cliente = new Cliente();

    public Cliente getCliente() {
        return cliente;
    }
   
    
   public void gravar() {
            System.out.println("Gravando " + this.cliente.getNome());
            
            if (cliente.getNome().isEmpty()) {
               throw new RuntimeException("Campo vazio porra!");
                
            }
            
            new DAO<Cliente>(Cliente.class).adiciona(this.cliente); 
            
            
}
   
   public void remover() {
       System.out.println("Removendo " + this.cliente.getNome());
       
       new DAO<Cliente>(Cliente.class).remove(this.cliente);
       
   }
    
    
    
}
