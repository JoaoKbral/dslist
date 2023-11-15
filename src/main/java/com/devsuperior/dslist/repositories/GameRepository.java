package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Game;

// responsavel por fazer consulta no banco de dados
public interface GameRepository extends JpaRepository <Game, Long> {
    
}