package com.una.entity;

import javax.persistence.*;

public class Gravadora {

    @Id
    @GeneratedValue
    private Integer id;

    private String nome;

    private Double cnpj;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getCnpj() {
        return cnpj;
    }

    public void setCnpj(Double cnpj) {
        this.cnpj = cnpj;
    }
}
