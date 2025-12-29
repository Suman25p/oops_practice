package com.oops.functionalinterface;

@FunctionalInterface
interface GamePower
{
	void usePower(String playerName);
	
	default void powerInfo() {
		System.out.println("This power can be used once per level ");
	}
	
	static void gameRule()
	{
		System.out.println("Follow game rules to win ");
	}
}

public class GameAppDriver {

	public static void main(String[] args) {
		
		GamePower firePower = (playerName) -> System.out.println(playerName + " uses Fire Power ");
		
		firePower.usePower("Warrior");
		
		firePower.powerInfo();
		
		GamePower.gameRule();
	}

}
