package studentGame;

import java.util.Arrays;

public class StudentGameMain {

	public static void main(String[] args) {

		StudentGame game = new StudentGame();

		for (int i = 1; i < 10 && game.counter < 5; i++) {
			if (Arrays.equals(game.randomChar, game.randomNameCharArray)) {
				System.out.println("You win!");
				break;
			} else if (i < 10 || game.counter <= 5) {
				System.out.print("You are guessing: ");
				game.fillUnderscoreWithLetter();

				System.out.println();

				game.askUserInputALetter();
			} else if (i == 10 && game.counter > 5) {
				System.out.println(" Game is over");
			}
		}
		if (game.counter == 5)
			System.out.println("You have guessed" + "(" + game.counter + ") Wrong letters");
		System.out.println("Game is over");

	}
}
