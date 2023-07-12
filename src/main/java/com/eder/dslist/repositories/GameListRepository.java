package com.eder.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eder.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
