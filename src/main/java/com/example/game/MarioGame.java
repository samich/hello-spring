package com.example.game;

public class MarioGame implements GameConsole {
	
	public void up() {
		System.out.println("Mario: Jump!");
	}
	
	public void down() {
		System.out.println("Mario: Sit down.");
	}
	
	public void left() {
		System.out.println("Mario: Go back!");
	}
	
	public void right() {
		System.out.println("Mario: Go forward");
	}

}
