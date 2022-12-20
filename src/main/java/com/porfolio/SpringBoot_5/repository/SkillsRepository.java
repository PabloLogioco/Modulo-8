package com.porfolio.SpringBoot_5.repository;

import com.porfolio.SpringBoot_5.model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface SkillsRepository extends JpaRepository<Skills, Long>{
    
}
