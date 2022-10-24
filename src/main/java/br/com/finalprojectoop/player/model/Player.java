package br.com.finalprojectoop.player.model;

import br.com.finalprojectoop.team.model.Team;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
//TODO: Refactor this class parameters to match the csv data
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int playerId;

    private String playerName;

    private int playerAge;

    private String playerPosition;

    private int playerGoals;

    private int playerAssists;

    private int playerYellowCards;

    @ManyToOne
    private Team idTeam;

    public Player(){}
}
