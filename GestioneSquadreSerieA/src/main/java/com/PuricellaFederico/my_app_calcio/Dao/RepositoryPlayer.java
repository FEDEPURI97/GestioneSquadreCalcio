package com.puricellafederico.my_app_calcio.Dao;

import com.puricellafederico.my_app_calcio.model.PlayerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RepositoryPlayer extends JpaRepository<PlayerModel, Integer> {

    List<PlayerModel> findByTeam_Name(String nameTeam);

    List<PlayerModel> findByRole(String role);

    List<PlayerModel> findBySalaryGreaterThanEqual(Integer minPay);

    List<PlayerModel> findBySalaryLessThanEqual(Integer maxPay);

    Optional<PlayerModel> findByNameAndSurname(String name, String surname);
}
