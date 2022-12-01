package com.porfolio.SpringBoot_5.service;

import com.porfolio.SpringBoot_5.model.Login;
import com.porfolio.SpringBoot_5.repository.LoginRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements ILoginService {

    @Autowired     // inyecta dependencia
    public LoginRepository loginRepo;
    
    @Override
    public void agregarLogin(Login log) { // alta
        loginRepo.save(log);
    }

    @Override
    public void modificarLogin(Login log) { // Ok
        loginRepo.save(log);
    }

    @Override
    public List<Login> buscarLogin() {
        return loginRepo.findAll();
    }
}

/*
        if ((originalLogin.getUsuario() == usuarioRecibido)
                && (originalLogin.getContrasenia() == contrRecibida)) {
            return "OK";    // Login correcto
        } else {
//            return "ERROR";    // Login incorrecto
//            return originalLogin.getUsuario();
            return usuarioRecibido;
        }

*/


/*

    @Override
    public String verificaLogin(Login log) {

        String usuarioRecibido = log.getUsuario();
        String contrRecibida = log.getContrasenia();

        List<Login> listOriginal = loginRepo.findAll();

        Login originalLogin = listOriginal.get(0);

        if (originalLogin.getUsuario() == null ? usuarioRecibido == null : originalLogin.getUsuario().equals(usuarioRecibido)) {
            if (originalLogin.getContrasenia() == null ? contrRecibida == null : originalLogin.getContrasenia().equals(contrRecibida)) {
                return "OK";    // Login correcto
            } else {
            return "ERROR";    // Login incorrecto
            }
        }
        return "ERROR";
    }



*/