package com.coderscampus;

import java.util.Scanner;
import java.util.Random;

public class Assignment2Application {

	public static void main(String[] args) {

		Random rand = new Random();

		int randomNumber = rand.nextInt(100) + 1;
		System.out.println(randomNumber);
		int attempts = 0;
		while (attempts < 5) {
			System.out.println("Enter your guess between 1-100");

			Scanner userGuess = new Scanner(System.in);

			int playerGuess = userGuess.nextInt();

			if (playerGuess > 100 || playerGuess < 0) {
				System.out.println("Your guess is not between 1 and 100, please try again");
			} else if (randomNumber > playerGuess) {
				System.out.println("Your guess is too low, please try again");
				attempts++;
			} else if (randomNumber < playerGuess) {
				System.out.println("Your guess is too high, please try again");
				attempts++;
			} else {
				System.out.println("You Win!!");
			}
			
		}
		System.out.println("You lose, the number to guess was: " + randomNumber);
		
	}
}
