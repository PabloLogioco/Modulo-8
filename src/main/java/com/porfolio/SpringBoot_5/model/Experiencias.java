package com.porfolio.SpringBoot_5.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity // se declara como entidad

public class Experiencias {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String desde;
    private String hasta;
    private String empresa;
    private String descripcion;

    public Experiencias() {
    }

    public Experiencias(Long id, String desde, String hasta, String empresa, String descripcion) {
        this.id = id;
        this.desde = desde;
        this.hasta = hasta;
        this.empresa = empresa;
        this.descripcion = descripcion;
    }
}
