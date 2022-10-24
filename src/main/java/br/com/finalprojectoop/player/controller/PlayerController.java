package br.com.finalprojectoop.player.controller;

import br.com.finalprojectoop.player.dao.PlayerDao;
import br.com.finalprojectoop.player.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerDao playerDao;

    @GetMapping("/getAll")
    public List<Player> getAllPlayers() {
        return playerDao.getAllPlayers();
    }

    @GetMapping("/getByName")
    public List<Player> getPlayerByName(String playerName) {
        return playerDao.getPlayerByName(playerName);
    }

    @GetMapping("/getByTeam")
    public List<Player> getPlayerByTeam(String teamName) {
        return playerDao.getPlayerByTeam(teamName);
    }
}
