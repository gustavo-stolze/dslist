package com.gustavostolze.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gustavostolze.dslist.dto.GameDTO;
import com.gustavostolze.dslist.dto.GameMinDTO;
import com.gustavostolze.dslist.entities.Game;
import com.gustavostolze.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}

	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		// NoSuchElementExpeption => should treat it
		GameDTO dto = new GameDTO(result);
		return dto;
	}
}
