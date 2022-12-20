package com.porfolio.SpringBoot_5.Controller;

import com.porfolio.SpringBoot_5.model.Skills;
import com.porfolio.SpringBoot_5.service.ISkillsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin(origins = "http://localhost:4200") // va a ser llamado desde esta url
@CrossOrigin(origins = "*") // habilita todas las url

public class SkillsController {
    @Autowired    // inyecta dependencia
    private ISkillsService skillsServ;

    @GetMapping ("/verSkills")
    @ResponseBody
    public List<Skills> verSkills () {
        return skillsServ.verSkills();
    }
 
    @PutMapping  ("/modificaSkills")     // para modificaciones item´s
    public void modificaSkills (@RequestBody Skills skil ) {
        skillsServ.modificaSkills(skil);
    }

    @PostMapping ("/newSkills")
    public String agregarSkills(@RequestBody Skills skil) { // datos vienen 
        skillsServ.agregarSkills(skil);                    // body JSON
        return "Agregar Skills OK";
    }

    @GetMapping ("/buscarSkills/{id}") // ver solo 1 item
    @ResponseBody // localhost:8080/buscarSkills/4
    public Skills buscarSkills (@PathVariable Long id) {
        return skillsServ.buscarSkills( id );
    }
}

