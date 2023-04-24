package studentGame;

import java.util.Scanner;

public class StudentGameMain {

	public static void main(String[] args) {

		StudentGame game = new StudentGame();

		Scanner sc = new Scanner(System.in);

		int guess = 0;
		do {
			System.out.print("You are guessing: ");
			// game.replaceNameWithUnderscore();
			System.out.println("You have guessed " + "(" + game.counter + ")" + " Wrong letters");
			System.out.println("Guess a letter: ");
			game.ch = sc.next().charAt(0);

			game.fillUnderscoreWithLetter();

			if (game.countPoints()) {
				game.counter++;
			}
			guess++;
		}

		while (guess < 10 && game.counter <= 5);

		game.gameDecision();

	}

}
