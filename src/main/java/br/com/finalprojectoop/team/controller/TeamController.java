package br.com.finalprojectoop.team.controller;

import br.com.finalprojectoop.team.dao.TeamDao;
import br.com.finalprojectoop.team.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teams")
public class TeamController {

    @Autowired
    private TeamDao teamDao;

    @GetMapping("/getAll")
    public List<Team> getAllTeams() {
        return teamDao.findAll();
    }

    @GetMapping("/getByName")
    public Team getTeamByName(String teamName) {
        return teamDao.findByName(teamName);
    }

}
