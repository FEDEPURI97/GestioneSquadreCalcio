package com.PuricellaFederico.my_app_calcio.Dao.DaoImplement;

import com.PuricellaFederico.my_app_calcio.Dao.JpaRepository.ChampionshipRepository;
import com.PuricellaFederico.my_app_calcio.Model.ChampionshipModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DaoChampionShip {

    @Autowired
    ChampionshipRepository repository;

    public List<ChampionshipModel> findAll() {
        return repository.findAll();
    }

    public Optional<ChampionshipModel> findByName(String championshipName) {
        return repository.findByNameContaining(championshipName);
    }
}
