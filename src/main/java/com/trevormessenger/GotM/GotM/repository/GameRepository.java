package com.trevormessenger.GotM.GotM.repository;


import com.trevormessenger.GotM.GotM.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, String> {

}
