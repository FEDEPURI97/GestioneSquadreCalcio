package com.PuricellaFederico.my_app_calcio.Dao.DaoImplement;

import com.PuricellaFederico.my_app_calcio.Dao.JpaRepository.PlayerRepository;
import com.PuricellaFederico.my_app_calcio.Model.PlayerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DaoPlayer {

    @Autowired
    PlayerRepository repository;

    public List<PlayerModel> getPlayerForTeam(String nameTeam) {
        return repository.findByTeam_Name(nameTeam);
    }

    public List<PlayerModel> getPlayerForRole(String role) {
        return repository.findByRole(role);
    }

    public List<PlayerModel> getForMinSalary(Integer minPay) {
        return repository.findBySalaryGreaterThanEqual(minPay);
    }

    public List<PlayerModel> getForMaxSalary(Integer maxPay) {
        return repository.findBySalaryLessThanEqual(maxPay);
    }

    public Optional<PlayerModel> getGetPlayerForNameSurname(String name , String surname) {
        return repository.findByNameAndSurname(name , surname);
    }
}
