package com.example.hellospring;

import com.example.game.GameConsole;
import com.example.game.GameRunner;
import com.example.game.MarioGame;
import com.example.game.PacmanGame;

public class AppJava {
	
	public static void main(String[] args) {
		
		GameConsole game = new MarioGame();
		
		GameRunner runner = new GameRunner(game);
		runner.run();
		
	}

}
