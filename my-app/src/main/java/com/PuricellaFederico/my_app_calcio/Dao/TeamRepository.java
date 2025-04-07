package com.PuricellaFederico.my_app_calcio.Dao;

import com.PuricellaFederico.my_app_calcio.Model.TeamModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TeamRepository extends JpaRepository<TeamModel, Integer> {

    Optional<TeamModel> findByNameContaining(String name);

    Optional<List<TeamModel>> findByBudgetYearGreaterThanEqual(Integer minBudget);

    Optional<List<TeamModel>> findByBudgetYearLessThanEqual(Integer maxBudget);
}
