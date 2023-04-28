package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

import com.example.game.GameConsole;
import com.example.game.GameRunner;
import com.example.game.PacmanGame;

@Configuration
public class AppConfig {
	
	@Bean
	public GameConsole game() {		
		GameConsole game = new PacmanGame();		
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(GameConsole game) {
		GameRunner gameRunner = new GameRunner(game);
		
		return gameRunner;
	}

}


