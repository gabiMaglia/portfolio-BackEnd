package com.portfolio.Gabriel.Maglia.Repository;

import com.portfolio.Gabriel.Maglia.Entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISkillsRepository extends JpaRepository <Skills, Long> {


}
