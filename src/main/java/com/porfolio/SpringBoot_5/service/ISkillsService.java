package com.porfolio.SpringBoot_5.service;

import com.porfolio.SpringBoot_5.model.Skills;
import java.util.List;

public interface ISkillsService {

    public List<Skills> verSkills();
    public void agregarSkills(Skills skil);
    public void modificaSkills (Skills skil);
    public Skills buscarSkills( Long id);
      
}
