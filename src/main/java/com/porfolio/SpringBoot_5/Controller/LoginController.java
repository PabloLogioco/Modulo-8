package com.porfolio.SpringBoot_5.Controller;

import com.porfolio.SpringBoot_5.model.Login;
import com.porfolio.SpringBoot_5.service.ILoginService;
import java.util.List;
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

public class LoginController {

    public Long id;

    @Autowired    // inyecta dependencia
    private ILoginService loginServ;

    @PostMapping ("/newLogin")
    public String agregarLogin(@RequestBody Login log) {
        loginServ.agregarLogin(log);
        return "Agregar Login OK";
    }
    
    @PutMapping ("/modificarLogin")
    public void modificarLogin(@RequestBody Login log) {
        loginServ.modificarLogin(log);
    }

    @GetMapping ("/buscarLogin")
    @ResponseBody
    public List<Login> buscarLogin() {
        return loginServ.buscarLogin();
    }
}


