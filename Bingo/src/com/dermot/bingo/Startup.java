package com.dermot.bingo;

public class Startup 
{
	public static void main(String[] args) 
	{
		Game game = new Game();
		game.start();
		while (!game.isOver()) 
		{
			game.update();
		}
		game.over();
	}
}
