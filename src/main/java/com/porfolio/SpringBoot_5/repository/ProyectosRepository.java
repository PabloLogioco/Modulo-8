package com.porfolio.SpringBoot_5.repository;

import com.porfolio.SpringBoot_5.model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectosRepository extends JpaRepository<Proyectos, Long> {
    
}
