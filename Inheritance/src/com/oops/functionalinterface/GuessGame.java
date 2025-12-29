package com.oops.functionalinterface;
//Guessing game using Lambda
@FunctionalInterface
interface GuessChecker{
	void check(int guess,int target);
}

public class GuessGame {

	public static void main(String[] args) {
		
		int targetNumber = 7;
		
		GuessChecker checker = (guess, target) -> {
			if(guess == target) {
				System.out.println("Congratulations Correct guess!");
			} else if( guess > target) {
				System.out.println("Too High!");
			} else
			{
				System.out.println("Too low!");
			}
		};
		
		checker.check(5, targetNumber);
		checker.check(10, targetNumber);
		checker.check(7, targetNumber);
		
	}

}
