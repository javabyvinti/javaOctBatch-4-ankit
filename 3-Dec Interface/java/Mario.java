package com.interfaceprogram.java;

public class Mario implements Game, ScoreBoard{

	int currentLife ;
	
	Mario(){//default cons
		currentLife = MAXLIFE;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void jump() {
		
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack() {
		//currentLife = MAXLIFE - 1;
		currentLife--;
	}

	@Override
	public void idle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void highestScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void currentScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int displayResult(int value) {
		// TODO Auto-generated method stub
		return 0;
	}

}
