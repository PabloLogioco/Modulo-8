package com.porfolio.SpringBoot_5.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity // se declara como entidad

public class Estudios {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String anio;
    private String institucion;
    private String descripcion;

    public Estudios() {
    }

    public Estudios(Long id, String anio, String institucion, String detalle) {
        this.id = id;
        this.anio = anio;
        this.institucion = institucion;
        this.descripcion = detalle;
    }
}
