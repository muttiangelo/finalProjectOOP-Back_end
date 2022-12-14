package br.com.finalprojectoop.team.model;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTeam;

    private String teamName;

    private int teamPoints;

    private int teamMatchesPlayed;

    private int teamWins;

    private int teamDraws;

    private int teamLosses;

    private int teamGoalsFor;

    private int teamGoalsAgainst;

    private int teamGoalDifference;

    private int teamPointsPerMatch;

    private int averageAttendance;

    public Team() {

    }
}
