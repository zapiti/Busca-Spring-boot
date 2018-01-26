package com.una.entity;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.util.Set;

public class Album {

    @Id
    @GeneratedValue
    private Integer id;

    private String nome;

    private Integer qtd_musicas;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "genero", referencedColumnName = "id")
    private Genero genero;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "album_midia", joinColumns = @JoinColumn(name = "id_album"),
                inverseJoinColumns=@JoinColumn(name= "id_midia") )
    private Set<Media> midias;

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

    public Integer getQtd_musicas() {
        return qtd_musicas;
    }

    public void setQtd_musicas(Integer qtd_musicas) {
        this.qtd_musicas = qtd_musicas;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Set<Media> getMidias() {
        return midias;
    }

    public void setMidias(Set<Media> midias) {
        this.midias = midias;
    }
}
