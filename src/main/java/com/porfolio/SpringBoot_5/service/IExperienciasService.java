package com.porfolio.SpringBoot_5.service;

import com.porfolio.SpringBoot_5.model.Experiencias;
import java.util.List;

public interface IExperienciasService {
    
    public List<Experiencias> verExperiencias();
    public void agregarExperiencia(Experiencias exp);
    public void borraExperiencia (Long id);
    public void modificaExperiencia (Experiencias exp);
    public Experiencias buscarExperiencia( Long id);
    
}
