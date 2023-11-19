package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.GameList;

// responsavel por fazer consulta no banco de dados
public interface GameListRepository extends JpaRepository <GameList, Long> {
    
}
