package com.porfolio.SpringBoot_5.service;

import com.porfolio.SpringBoot_5.model.Estudios;
import java.util.List;

public interface IEstudiosService {
    
    public List<Estudios> verEstudios();
    public void agregarEstudio(Estudios est);
    public void borraEstudio (Long id);
    public void modificaEstudio (Estudios est);
    public Estudios buscarEstudio( Long id);
      
}
