package com.puricellafederico.my_app_calcio.Dao;

import com.puricellafederico.my_app_calcio.model.ChampionshipModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ChampionshipRepository extends JpaRepository<ChampionshipModel, Integer> {

    Optional<ChampionshipModel> findByNameContainingIgnoreCase(String championshipName);

}
