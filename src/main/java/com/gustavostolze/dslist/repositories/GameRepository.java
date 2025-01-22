package com.gustavostolze.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavostolze.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
