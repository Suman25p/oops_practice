package com.oops.functionalinterface;

@FunctionalInterface
interface GameAction
{
	void perform();
}

public class GameApp {

	public static void main(String[] args) {
	
		//Player attacks
		GameAction attack = () -> System.out.println("Player attack with sword");
		
		//Player defends
		GameAction defend = () -> System.out.println("Player defend with shield");
		
		//Player jumps
		GameAction jump = () -> System.out.println("Player jumps");
		
		//Execute actions
		attack.perform();
		defend.perform();
		jump.perform();

	}

}
