package br.com.finalprojectoop.player.repository;

import br.com.finalprojectoop.player.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

}

