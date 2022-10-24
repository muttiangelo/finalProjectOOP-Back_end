package br.com.finalprojectoop.team.dao;


import br.com.finalprojectoop.team.dao.repository.TeamRepository;
import br.com.finalprojectoop.team.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamDao {

    @Autowired
    private TeamRepository teamRepository;

    public List<Team> findAll() {
        return teamRepository.findAll();
    }

    public Team findById(int id) {
        return teamRepository.findById(id).orElse(null);
    }

    public Team findByName(String teamName) {
        Team teamFinded = teamRepository.findAll().stream().filter(team -> team.getTeamName().equals(teamName)).findFirst().orElse(null);
        return teamFinded;
    }
}
