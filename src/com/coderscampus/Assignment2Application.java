package com.coderscampus;

import java.util.Scanner;
import java.util.Random;

public class Assignment2Application {

	public static void main(String[] args) {

		Random rand = new Random();
		int randomNumber = rand.nextInt(100) + 1;
		int attempts = 0;
		Scanner userGuess = new Scanner(System.in);
		System.out.println("Enter your guess between 1-100");

		while (attempts < 5) {

			int playerGuess = userGuess.nextInt();

			if (playerGuess > 100 || playerGuess <= 0) {
				System.out.println("Your guess is not between 1 and 100, please try again");
			} else if (randomNumber > playerGuess) {
				attempts++;
				System.out.println("Please pick a higher number");
			} else if (randomNumber < playerGuess) {
				attempts++;
				System.out.println("Please pick a lower number");
			} else {
				break;
			}

		}
		if (attempts < 5) {
			System.out.println("You Win!");
		} else {
			System.out.println("You lose!");
			System.out.println("The number to guess was: " + randomNumber);
		}

	}
}
