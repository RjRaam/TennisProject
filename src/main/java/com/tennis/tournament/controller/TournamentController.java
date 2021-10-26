package com.tennis.tournament.controller;

import com.tennis.tournament.repository.TournamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/tournament/")
public class TournamentController {

    @Autowired
    TournamentRepository repository;

    @GetMapping("/country/{year}")
    public Map<String, Long> getPlayersCountByCountry(@PathVariable int year){

        return new HashMap<>();
    }

    @GetMapping("/winners/{year}/{surface}")
    public Map<String, Long> getPlayersCountByCountry(@PathVariable int year, @PathVariable String surface){

        return new HashMap<>();
    }

    @GetMapping("/winners/{fromYear}/{toYear}/<surface>")
    public Map<String, Long> getWinnersBetweenYearsAndSurface(@PathVariable int fromYear,@PathVariable int toYear, @PathVariable String surface){

        return new HashMap<>();
    }
}
