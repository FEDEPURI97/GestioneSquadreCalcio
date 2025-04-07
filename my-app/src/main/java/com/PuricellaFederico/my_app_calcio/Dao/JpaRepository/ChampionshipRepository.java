package com.PuricellaFederico.my_app_calcio.Dao.JpaRepository;

import com.PuricellaFederico.my_app_calcio.Model.ChampionshipModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ChampionshipRepository extends JpaRepository<ChampionshipModel, Integer> {

    Optional<ChampionshipModel> findByNameContaining(String championshipName);

}
