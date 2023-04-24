package studentGame;

import java.util.Arrays;
import java.util.Scanner;

public class StudentGameMain {

	public static void main(String[] args) {

		StudentGame game = new StudentGame();

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i < 10 && game.counter < 5; i++) {
			if (Arrays.equals(game.randomChar, game.randomNameCharArray)) {
				System.out.println(" You win!");
				break;
			} else if (i < 10 || game.counter <= 5) {
				System.out.println("You are guessing: ");
				game.fillUnderscoreWithLetter();

				System.out.println();

				game.askUserInputALetter();

			}
		}
		if (game.counter == 5)
			System.out.println(" Game is over");

	}
}
