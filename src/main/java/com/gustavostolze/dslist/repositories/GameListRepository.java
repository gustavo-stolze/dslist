package com.gustavostolze.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavostolze.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
