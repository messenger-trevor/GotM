package com.trevormessenger.GotM.GotM.rest;


import com.trevormessenger.GotM.GotM.entity.Game;
import com.trevormessenger.GotM.GotM.repository.GameRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;


@RestController
public class GameController {

    private GameRepository gameRepository;

    public GameController(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @GetMapping("/game")
    public List<Game> getGame() {
        return gameRepository.findAll();
    };
}
