package com.porfolio.SpringBoot_5.repository;

import com.porfolio.SpringBoot_5.model.Experiencias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ExperienciasRepository  extends JpaRepository<Experiencias, Long>{
    
}
