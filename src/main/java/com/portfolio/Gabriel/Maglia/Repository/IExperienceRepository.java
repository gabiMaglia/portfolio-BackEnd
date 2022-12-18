package com.portfolio.Gabriel.Maglia.Repository;

import com.portfolio.Gabriel.Maglia.Entity.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienceRepository extends JpaRepository<Experience, Long> {
}
