package br.com.finalprojectoop.player.dao;

import br.com.finalprojectoop.player.model.Player;
import br.com.finalprojectoop.player.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerDao {

    @Autowired
    private PlayerRepository playerRepository;

    public List<Player> getAllPlayers() {
        return playerRepository.findAll(Sort.sort(Player.class).by(Player::getPlayerGoals).descending());
    }

    public List<Player> getPlayerByName(String playerName) {
        return playerRepository.findAll().stream().filter(player -> player.getPlayerName().equals(playerName)).toList();
    }

    public List<Player> getPlayerByTeam(String teamName) {
        return playerRepository.findAll().stream().filter(player -> player.getIdTeam().getTeamName().equals(teamName)).toList();
    }
}
