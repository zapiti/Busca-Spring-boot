package com.una.entity;

import org.hibernate.validator.constraints.NotBlank;
import javax.persistence.*;

public class Artista {
    @Id
    @GeneratedValue
    private Integer id;
    @NotBlank(message = "Campo obrigatório")

    private String nome;

    private Integer Ano_formacao;



    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "album", referencedColumnName = "id")
    private Album album;


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

    public Integer getAno_formacao() {
        return Ano_formacao;
    }

    public void setAno_formacao(Integer ano_formacao) {
        Ano_formacao = ano_formacao;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}
