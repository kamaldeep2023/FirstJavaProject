package studentGame;

import java.util.Arrays;
import java.util.Scanner;

public class StudentGameMain {

	public static void main(String[] args) {

		StudentGame game = new StudentGame();

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10 && game.counter <= 5; i++) {
			if (Arrays.equals(game.randomChar, game.randomNameCharArray)) {
				System.out.println("You win!");
				break;
			} else if (i < 10 || game.counter <= 5) {
				System.out.print("You are guessing: ");
				System.out.println("You have guessed " + "(" + game.counter + ")" + " Wrong letters");
				System.out.println("Guess a letter: ");
				game.ch = sc.next().charAt(0);

				game.fillUnderscoreWithLetter();

				if (game.countPoints()) {
					game.counter++;
				}
			}
		}
		if(game.counter==5)
		System.out.println("Game is over");

	}
}
