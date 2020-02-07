package com.bridgelabz.oops.jSON_Inventry.deckOfCards;

import java.util.Random;

import com.bridgelabz.utils.InputUtility;

/**
 * @author Arvind
 *  Date: 3/12/2019 
 *  purpose: program to print the 52 cards after shuffling and devide it to 4 members 13 13 seprate
 */

public class DeckOfCards {
	// method for convert 2 one dimensional array to 2 Dimensional Array
	// and 2 Dimensional Array to one Dimensional Array

	public static void cardsSolution() throws Exception {
		String suits[] = { "Clubs", "Diamonds", "Hearts", "Spades" };

		String ranks[] = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

		String totalCards[] = new String[52];

		String check[][] = new String[4][13];
		int count = 0;
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < ranks.length; j++) {
				check[i][j] = suits[i] + "-" + ranks[j];
				totalCards[count] = check[i][j];
				count++;
			}
		}

		shuffleCards(totalCards);
	}

	// Method for shuffle the cards by Random

	public static void shuffleCards(String totalCards[]) throws Exception {
		Random random = new Random();

		for (int i = 0; i < totalCards.length; i++) {
			int randomIndex = i + random.nextInt(totalCards.length - i);

			String temp = totalCards[randomIndex];
			totalCards[randomIndex] = totalCards[i];
			totalCards[i] = temp;
		}

		String shuffleCards[][] = new String[4][13];

		int count = 0;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				if (count == totalCards.length)
					break;

				shuffleCards[i][j] = totalCards[count];
				count++;
			}
		}

		distributePlayers(shuffleCards);
	}

	// Method for print distribute 9 Cards to 4 Players and Print the Cards the
	// received by the 4 Players using 2D Array…

	public static void distributePlayers(String shuffleCards[][]) throws Exception {
		System.out.println("Enter players upto 4 ");

		int players = InputUtility.nextInt();

		// System.out.println("distributePlayers");
		if (players <= 4) {
			for (int i = 0; i < players; i++) {
				for (int j = 0; j < 13; j++) {
					if (j > 8) {
						break;
					} else {
						System.out.print(shuffleCards[i][j] + "   ");
					}
				}
				System.out.println("\n");
			}
		} else {
			System.out.println("Only 4 players can play");
		}
	}

	public static void main(String[] args) throws Exception {
		cardsSolution();
	}

}
