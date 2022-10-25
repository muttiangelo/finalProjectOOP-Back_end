package br.com.finalprojectoop.player.model;

import br.com.finalprojectoop.team.model.Team;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int playerId;

    private String playerName;

    private String playerPosition;

    private int playerGoals;

    private int playerAssists;

    private int playerMinutesPlayed;

    private int playerYellowCards;

    private int playerRedCards;

    @ManyToOne
    private Team idTeam;

    public Player(){}
}
