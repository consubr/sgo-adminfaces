package com.canini.sgo.model;

import javax.persistence.Entity;

/**
 *
 * @author danilo
 */
@Entity
public class ClienteJuridico extends Cliente {

    private String cnpj;

    public ClienteJuridico() {
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

}
