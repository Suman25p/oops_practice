package com.oops.functionalinterface;

import java.util.Random;
import java.util.Scanner;

interface GuessingGame
{
	void checkGuess(int guess, int target);
	
	default void hint(int guess, int target)
	{
		if(guess > target) {
			System.out.println("Try smaller number");
		} else
		{
			System.out.println("Try bigger number");
		}
	}
	
	static void gameRules()
	{
		System.out.println("Guess a number between 1 and 10");
		System.out.println(" You have only three attempts");
	}
}

public class GuessingAppDriver {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		Random random = new Random();
		int targetNumber = random.nextInt(10) + 1; // 1 to 10
		int attempts = 3;
		
		GuessingGame.gameRules();
		GuessingGame game = (guess, target) -> {
			if(guess == target) {
				System.out.println("Correct guess! You win!");
			}else {
				System.out.println("Wrong guess");
			}
		};
		
		while(attempts > 0) {
			System.out.println("Enter your guess: ");
			
			int userGuess = sc.nextInt();
			game.checkGuess(userGuess, targetNumber);
			
			if(userGuess == targetNumber)
			{
				break;
			}
			attempts--;
			System.out.println("Attempts left: " + attempts);
			
			if(attempts > 0) {
				game.hint(userGuess, targetNumber);
			}
		}
		if(attempts == 0) {
			System.out.println("\n Game Over! Correct number was: " + targetNumber);
		}
		
		sc.close();
	}

}
/*
Guess a number between 1 and 10
You have only three attempts
Enter your guess: 
5
Wrong guess
Attempts left: 2
Try bigger number
Enter your guess: 
8
Wrong guess
Attempts left: 1
Try smaller number
Enter your guess: 
6
Wrong guess
Attempts left: 0

Game Over! Correct number was: 7
*/
