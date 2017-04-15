package com.canini.sgo.model;

import javax.persistence.Entity;

/**
 *
 * @author danilo
 */
@Entity
public class ClienteFisico extends Cliente {

    private String cpf;

    public ClienteFisico() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
