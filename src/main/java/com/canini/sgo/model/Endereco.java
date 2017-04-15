package com.canini.sgo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author danilo
 */

@Entity
@Table(name="endereco")
public class Endereco {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String logradouro;
    private String cep;
    private String cidade;
    private String estado;
    private String pais;
    
}
