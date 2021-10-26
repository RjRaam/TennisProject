package com.tennis.tournament.repository;

import com.tennis.tournament.model.Tennis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.HashMap;
import java.util.Map;

@Repository
public interface TournamentRepository extends JpaRepository<Tennis, Long> {

    public default Map<String,Integer> findPlayerCountByCountry(int year) {

        return new HashMap<>();
    }

    public default Map<String,Integer> findWinnersByYearAndSurface(int year, String surface) {

        return new HashMap<>();
    }

    public default Map<String,Integer> findWinnersBetweenYearInSurface(int fromYear, int toYear, String surface){

        return new HashMap<>();
    }
}
