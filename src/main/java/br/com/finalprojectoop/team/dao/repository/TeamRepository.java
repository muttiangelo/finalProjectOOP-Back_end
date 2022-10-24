package br.com.finalprojectoop.team.dao.repository;

import br.com.finalprojectoop.team.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {

}

