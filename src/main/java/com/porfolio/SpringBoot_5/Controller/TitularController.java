//
// Recibe todas las peticiones de los clientes y las responde
//

package com.porfolio.SpringBoot_5.Controller;

import com.porfolio.SpringBoot_5.model.Titular;
import com.porfolio.SpringBoot_5.service.ITitularService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin(origins = "http://localhost:4200") // va a ser llamado desde esta url
@CrossOrigin(origins = "*") // habilita todas las url

public class TitularController {

    @Autowired    // inyecta dependencia
    private ITitularService titularServ;

    @GetMapping ("/verTitular")
    @ResponseBody
    public Titular verTitular () {
        return titularServ.verTitular();
    }
 
    @PutMapping  ("/modificaTitular")     // para modificaciones item´s
    public String modificaTitular (@RequestBody Titular tit ) {
        titularServ.modificaTitular(tit);
        return "Modifica Titular OK";
    }

    @PostMapping ("/newTitular")
    public String agregarTitular(@RequestBody Titular tit) { // datos vienen 
        titularServ.agregarTitular(tit);                    // body JSON
        return "Agregar Titular OK";
    }
}
