package com.porfolio.SpringBoot_5.service;

import com.porfolio.SpringBoot_5.model.Login;
import java.util.List;

public interface ILoginService {

    public void agregarLogin(Login log);
    public void modificarLogin(Login log);
    public List<Login> buscarLogin();
//    public String verificaLogin(Login log);
}
