package com.portfolio.Gabriel.Maglia.Repository;

import com.portfolio.Gabriel.Maglia.Entity.Studies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudiesRepository extends JpaRepository<Studies, Long> {
}
