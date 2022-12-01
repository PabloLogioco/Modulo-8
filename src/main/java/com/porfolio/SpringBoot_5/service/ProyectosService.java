package com.porfolio.SpringBoot_5.service;

import com.porfolio.SpringBoot_5.model.Proyectos;
import com.porfolio.SpringBoot_5.repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // se declara como servicio
public class ProyectosService implements IProyectosService {
    
    @Autowired     // inyecta dependencia
    public ProyectosRepository proyectosRepo;
    
    @Override
    public List<Proyectos> verProyectos() { // Ok
        return proyectosRepo.findAll();
    }

    @Override
    public void agregarProyecto(Proyectos proy) { // alta
        proyectosRepo.save(proy);
    }

    @Override
    public void borraProyecto(Long id) {
        proyectosRepo.deleteById(id);
    }

    @Override
    public void modificaProyecto(Proyectos proy) { // Ok
        proyectosRepo.save(proy);
    }

    @Override
    public Proyectos buscarProyecto(Long id) {
        return proyectosRepo.findById(id).orElse(null);
    }
}
