package com.porfolio.SpringBoot_5.Controller;

import com.porfolio.SpringBoot_5.model.Estudios;
import com.porfolio.SpringBoot_5.service.IEstudiosService;
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

public class EstudiosController {
    
    @Autowired    // inyecta dependencia
    private IEstudiosService estudiosServ;

    @PostMapping ("/newEstudio")
    public void agregarEstudio(@RequestBody Estudios est) {
        estudiosServ.agregarEstudio(est);
    }
    
    @GetMapping ("/verEstudios") // todos
    @ResponseBody
    public List<Estudios> verEstudios () {
        return estudiosServ.verEstudios();
    }
 
    @GetMapping ("/buscarEstudio/{id}") // ver solo 1 item
    @ResponseBody // localhost:8080/buscarEstudio/4
    public Estudios buscarEstudio (@PathVariable Long id) {
        return estudiosServ.buscarEstudio( id );
    }

    @PutMapping  ("/modificaEstudio")     // para modificaciones item´s
    public void modificaEstudio (@RequestBody Estudios est ) {
        estudiosServ.modificaEstudio(est);
    }

    @DeleteMapping ("/borraEstudio/{id}")   // peticion para borrar item´s
    public void borraEstudio (@PathVariable Long id) {    // DELETE localhost:8080/borraEstudio?=4
        estudiosServ.borraEstudio(id);
    }
}
