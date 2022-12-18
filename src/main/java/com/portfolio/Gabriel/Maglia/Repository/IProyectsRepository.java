package com.portfolio.Gabriel.Maglia.Repository;

import com.portfolio.Gabriel.Maglia.Entity.Proyects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProyectsRepository extends JpaRepository<Proyects, Long> {


}
