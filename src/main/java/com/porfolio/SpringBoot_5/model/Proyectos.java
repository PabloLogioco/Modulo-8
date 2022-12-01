package com.porfolio.SpringBoot_5.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Id;

@Getter @Setter
@Entity // se declara como entidad

public class Proyectos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String anio;
    private String descripcion;

    public Proyectos() {
    }

    public Proyectos(Long id, String anio, String descripcion) {
        this.id = id;
        this.anio = anio;
        this.descripcion = descripcion;
    }
}
