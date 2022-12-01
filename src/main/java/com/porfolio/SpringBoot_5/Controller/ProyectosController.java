package com.porfolio.SpringBoot_5.Controller;

import com.porfolio.SpringBoot_5.model.Proyectos;
import com.porfolio.SpringBoot_5.service.IProyectosService;
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

public class ProyectosController {
   
    @Autowired    // inyecta dependencia
    private IProyectosService proyectosServ;

    @PostMapping ("/newProyecto")
    public void agregarProyecto(@RequestBody Proyectos proy) {
        proyectosServ.agregarProyecto(proy);
    }
    
    @GetMapping ("/verProyectos") // todos
    @ResponseBody
    public List<Proyectos> verProyectos () {
        return proyectosServ.verProyectos();
    }
 
    @GetMapping ("/buscarProyecto/{id}") // ver solo 1 item
    @ResponseBody // localhost:8080/buscarProyecto/id
    public Proyectos buscarProyecto (@PathVariable Long id) {
        return proyectosServ.buscarProyecto( id );
    }

    @PutMapping  ("/modificaProyecto")     // para modificaciones item´s
    public void modificaProyecto (@RequestBody Proyectos proy ) {
        proyectosServ.modificaProyecto(proy);
    }

    @DeleteMapping ("/borraProyecto/{id}")   // peticion para borrar item´s
    public void borraProyecto (@PathVariable Long id) {    // DELETE localhost:8080/borraProyecto?=id
        proyectosServ.borraProyecto(id);
    }
}
