package com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.services.GameListService;
import com.devsuperior.dslist.services.GameService;

import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(value = "/games")
public class GameListController {
    
    @Autowired
    private GameListService gameListService;
    @Autowired
    private GameService gameService;
    
    @GetMapping
    public List<GameListDTO> findAll(){
        return gameListService.findAll();
    }

    @GetMapping(value="/{listId}/games")
    public List<GameMinDTO> findByList(@RequestParam Long listId) {
        return gameService.findByList(listId);
    }
    
}
