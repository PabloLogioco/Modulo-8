package com.porfolio.SpringBoot_5.service;

import com.porfolio.SpringBoot_5.model.Skills;
import com.porfolio.SpringBoot_5.repository.SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // se declara como servicio
public class SkillsService implements ISkillsService {
    
    @Autowired     // inyecta dependencia
    public SkillsRepository skillsRepo;
    
    @Override
    public List<Skills> verSkills() {
        return skillsRepo.findAll();
    }

    @Override
    public void agregarSkills(Skills skil) { // alta
        skillsRepo.save(skil);
    }

    @Override
    public void modificaSkills(Skills skil) {
        skillsRepo.save(skil);
    }

    @Override
    public Skills buscarSkills(Long id) {
        return skillsRepo.findById(id).orElse(null);
    }
}

   

