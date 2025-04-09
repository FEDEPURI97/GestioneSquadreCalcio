package com.puricellafederico.my_app_calcio.Dao;

import com.puricellafederico.my_app_calcio.model.TeamModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TeamRepository extends JpaRepository<TeamModel, Integer> {

    Optional<TeamModel> findByNameContainingIgnoreCase(String name);

    Optional<List<TeamModel>> findByBudgetYearLessThanEqual(Integer minBudget);

    Optional<List<TeamModel>> findByBudgetYearGreaterThanEqual(Integer maxBudget);
}
