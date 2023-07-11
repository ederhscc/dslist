package com.eder.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eder.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
