package com.oops.functionalinterface;

import java.util.Scanner;

@FunctionalInterface
interface GuessGames
{
	void checkGuess(int guess, int target);
	
	default void hint(int guess, int target)
	{
		if(guess > target) {
			System.out.println("Try a smaller number!");
		}else {
			System.out.println("Try a bigger number!");
		}
	}
	
	static void gameRules() {
		System.out.println("Guess the correct number between 1 and 10");
	}
}

public class GuessingGameApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int targetNumber = 6;
		int userGuess = -1;
		
		GuessGames.gameRules();
		
		//lambda expression
		GuessGames game = (guess, target) -> {
			if(guess == target) {
				System.out.println("Congratulations! Correct guess");
			}else {
				System.out.println("Wrong guess!");
			}
		};
		
		while(userGuess != targetNumber)
		{
			System.out.println("Enter your guess: ");
			userGuess = sc.nextInt();
		
			game.checkGuess(userGuess, targetNumber);
		
			if(userGuess != targetNumber) {
			game.hint(userGuess, targetNumber);
			}
		}
		sc.close();
	}
}
