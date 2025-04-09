package com.puricellafederico.my_app_calcio.Dao;

import com.puricellafederico.my_app_calcio.model.PlayerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PlayerRepository extends JpaRepository<PlayerModel, Integer> {

    List<PlayerModel> findByTeam_NameIgnoreCase(String nameTeam);

    List<PlayerModel> findByRoleIgnoreCase(String role);

    List<PlayerModel> findBySalaryLessThanEqual(Integer minPay);

    List<PlayerModel> findBySalaryGreaterThanEqual(Integer maxPay);

    Optional<PlayerModel> findByNameAndSurnameIgnoreCase(String name, String surname);
}
