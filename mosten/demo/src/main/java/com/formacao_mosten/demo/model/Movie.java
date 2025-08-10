package com.formacao_mosten.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "filmes_series")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String tipo;

    private int votosPositivos = 0;
    private int votosNegativos = 0;

    public Movie() {}

    public Movie(String titulo) {
        this.titulo = titulo;
    }

    public double getMediaAvaliacao() {
        int totalVotos = votosPositivos + votosNegativos;
        if (totalVotos == 0) {
            return 0.0;
        }
        double media = ((double) votosPositivos / totalVotos) * 5;
        return Math.round(media * 10.0) / 10.0; // 1 casa decimal
    }

    public Long getId() { return id; }
    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVotosPositivos() {
        return votosPositivos;
    }

    public void setVotosPositivos(int votosPositivos) {
        this.votosPositivos = votosPositivos;
    }

    public int getVotosNegativos() {
        return votosNegativos;
    }

    public void setVotosNegativos(int votosNegativos) {
        this.votosNegativos = votosNegativos;
    }
}
