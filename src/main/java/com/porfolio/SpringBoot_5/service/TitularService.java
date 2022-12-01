package com.porfolio.SpringBoot_5.service;

import com.porfolio.SpringBoot_5.model.Titular;
import com.porfolio.SpringBoot_5.repository.TitularRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // se declara como servicio

public class TitularService  implements ITitularService {
    
    @Autowired     // inyecta dependencia, el repositorio de titular
    public TitularRepository titularRepo;
    
    @Override
    public void agregarTitular(Titular tit) { // alta
        titularRepo.save(tit);
    }
    
    @Override
    public Titular verTitular() {
        return titularRepo.findAll().get(0);
    }
    
    @Override
    public void modificaTitular(Titular tit) {
        titularRepo.save( tit);
    }
}
