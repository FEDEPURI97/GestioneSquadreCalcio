package com.PuricellaFederico.my_app_calcio.Dao.DaoImplement;

import com.PuricellaFederico.my_app_calcio.Dao.JpaRepository.TeamRepository;

import com.PuricellaFederico.my_app_calcio.Model.TeamModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DaoTeam {

    @Autowired
    TeamRepository repository;

    public Optional<TeamModel> getTeamForName(String name) {
        return repository.findByNameContaining(name);
    }

    public List<TeamModel> getAllTeam() {
        return repository.findAll();
    }

    public Optional<List<TeamModel>> getTeamMinBudget(Integer minBudget) {
        return repository.findByBudgetYearGreaterThanEqual(minBudget);
    }

    public Optional<List<TeamModel>> getTeamMaxBudget(Integer maxBudget) {
        return repository.findByBudgetYearLessThanEqual(maxBudget);
    }
}
