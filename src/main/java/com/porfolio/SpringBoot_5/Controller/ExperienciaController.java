package com.porfolio.SpringBoot_5.Controller;

import com.porfolio.SpringBoot_5.model.Experiencias;
import com.porfolio.SpringBoot_5.service.IExperienciasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
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

public class ExperienciaController {
    
    @Autowired    // inyecta dependencia
    private IExperienciasService experienciasServ;

    @PostMapping ("/newExperiencia")
    public void agregarExperiencia(@RequestBody Experiencias exp) {
        experienciasServ.agregarExperiencia(exp);
    }
    
    @GetMapping ("/verExperiencias") // todos
    @ResponseBody
    public List<Experiencias> verExperiencias () {
        return experienciasServ.verExperiencias();
    }
 
    @GetMapping ("/buscarExperiencia/{id}") // ver solo 1 item
    @ResponseBody // localhost:8080/buscarExperiencias/id
    public Experiencias buscarExperiencia (@PathVariable Long id) {
        return experienciasServ.buscarExperiencia( id );
    }

    @PutMapping  ("/modificaExperiencia")     // para modificaciones item´s
    public void modificaExperiencia (@RequestBody Experiencias est ) {
        experienciasServ.modificaExperiencia(est);
    }

    @DeleteMapping ("/borraExperiencia/{id}")   // peticion para borrar item´s
    public void borraExperiencia (@PathVariable Long id) {    // DELETE localhost:8080/borraExperiencia?=4
        experienciasServ.borraExperiencia(id);
    }
}
