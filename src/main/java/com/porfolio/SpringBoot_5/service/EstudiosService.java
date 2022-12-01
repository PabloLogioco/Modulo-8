package com.porfolio.SpringBoot_5.service;

import com.porfolio.SpringBoot_5.model.Estudios;
import com.porfolio.SpringBoot_5.repository.EstudiosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // se declara como servicio
public class EstudiosService implements IEstudiosService {
    
    @Autowired     // inyecta dependencia
    public EstudiosRepository estudiosRepo;
    
    @Override
    public List<Estudios> verEstudios() { // Ok
        return estudiosRepo.findAll();
    }

    @Override
    public void agregarEstudio(Estudios est) { // alta
        estudiosRepo.save(est);
    }

    @Override
    public void borraEstudio(Long id) {
        estudiosRepo.deleteById(id);
    }

    @Override
    public void modificaEstudio(Estudios est) { // Ok
        estudiosRepo.save(est);
    }

    @Override
    public Estudios buscarEstudio(Long id) {
        return estudiosRepo.findById(id).orElse(null);
    }

}
