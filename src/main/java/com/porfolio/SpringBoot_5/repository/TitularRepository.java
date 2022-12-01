package com.porfolio.SpringBoot_5.repository;

import com.porfolio.SpringBoot_5.model.Titular;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // se declara como repositorio
public interface TitularRepository extends JpaRepository<Titular, Long> {
    
}

