package com.porfolio.SpringBoot_5.service;

import com.porfolio.SpringBoot_5.model.Proyectos;
import java.util.List;

public interface IProyectosService {
   
    public List<Proyectos> verProyectos();
    public void agregarProyecto(Proyectos proy);
    public void borraProyecto (Long id);
    public void modificaProyecto (Proyectos proy);
    public Proyectos buscarProyecto( Long id);
          
}
