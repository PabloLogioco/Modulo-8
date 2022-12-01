package com.porfolio.SpringBoot_5.service;

import com.porfolio.SpringBoot_5.model.Experiencias;
import com.porfolio.SpringBoot_5.repository.ExperienciasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciasService implements IExperienciasService {
    
    @Autowired     // inyecta dependencia
    public ExperienciasRepository experienciasRepo;
    
    @Override
    public List<Experiencias> verExperiencias() { // Ok
        return experienciasRepo.findAll();
    }

    @Override
    public void agregarExperiencia(Experiencias exp) { // alta
        experienciasRepo.save(exp);
    }

    @Override
    public void borraExperiencia(Long id) {
        experienciasRepo.deleteById(id);
    }

    @Override
    public void modificaExperiencia(Experiencias exp) { // Ok
        experienciasRepo.save(exp);
    }

    @Override
    public Experiencias buscarExperiencia(Long id) {
        return experienciasRepo.findById(id).orElse(null);
    }
}
