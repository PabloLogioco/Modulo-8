package com.porfolio.SpringBoot_5.model;

import com.sun.istack.NotNull;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity // se declara como entidad

public class Titular {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String nombre;  // nombre y apellido todo junto

    @NotNull
    private String titulo;

    private String url_foto;

    public Titular() {
    }

    public Titular(Long id, String titular, String titulo, String urlFoto) {
        this.id = id;
        this.nombre = titular;
        this.titulo = titulo;
        this.url_foto = urlFoto;
    }
}
