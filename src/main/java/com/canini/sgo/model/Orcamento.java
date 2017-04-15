package com.canini.sgo.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author danilo
 */

@Entity
@Table(name="orcamento")
public class Orcamento implements Serializable {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;
    
    @ManyToOne
    private Cliente cliente;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataCriacao;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataFinalizacao;
    
    @Enumerated(EnumType.STRING)
    private StatusOrcamento statusOrcamento;
    
    private String observacao;

    public Orcamento() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Calendar getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Calendar dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Calendar getDataFinalizacao() {
        return dataFinalizacao;
    }

    public void setDataFinalizacao(Calendar dataFinalizacao) {
        this.dataFinalizacao = dataFinalizacao;
    }

    public StatusOrcamento getStatusOrcamento() {
        return statusOrcamento;
    }

    public void setStatusOrcamento(StatusOrcamento statusOrcamento) {
        this.statusOrcamento = statusOrcamento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    
    
    
    
    
    
    
    
    
}
