package com.porfolio.SpringBoot_5.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity // se declara como entidad

public class Skills {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private int valor;

    public Skills() {
    }

    public Skills(Long id, String titulo, int valor) {
        this.id = id;
        this.titulo = titulo;
        this.valor = valor;
    }
}

