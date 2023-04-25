package com.example.game;

public class PacmanGame implements GameConsole {
	
	public void up() {
		System.out.println("Pacman: Jump!");
	}
	
	public void down() {
		System.out.println("Pacman: Sit down.");
	}
	
	public void left() {
		System.out.println("Pacman: Go back!");
	}
	
	public void right() {
		System.out.println("Pacman: Go forward");
	}

}
