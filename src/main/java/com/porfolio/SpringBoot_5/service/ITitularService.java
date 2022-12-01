package com.porfolio.SpringBoot_5.service;

import com.porfolio.SpringBoot_5.model.Titular;

public interface ITitularService {

    public void agregarTitular(Titular tit);
    public Titular verTitular();
    public void modificaTitular (Titular tit);
}
