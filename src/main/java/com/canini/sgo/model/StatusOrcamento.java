package com.canini.sgo.model;

/**
 *
 * @author danilo
 */
public enum StatusOrcamento {
    
    ABERTO("Aberto"), 
    ANDAMENTO("Andamento"), 
    CANCELADO("Cancelado"), 
    APROVADO("Cancelado");
    
    private StatusOrcamento(String descricao) {
        this.descricao = descricao;
    }

    private final String descricao;

    public String getDescricao() {
        return descricao;
    }
    
}
