package studentGame;

import java.util.Scanner;

public class StudentGame {

	String[] studentNames = { "Aleena", "Angel", "Asha", "Clemin", "Gopesh", "Hamneet", "Jimna", "Jobin", "Jude",
			"Kamaldeep", "Manpreetk", "Manpreets", "Mariya", "Namitha", "Neelam", "Nisha", "Parminder", "Rajat", "Rojy",
			"Sojan", "Suchitra", "Vindhuja" };

	String randomName;
	char[] randomNameCharArray;
	char[] randomChar;

	char ch;
	int counter = 0;
	boolean flag;
	Scanner sc = new Scanner(System.in);

	public StudentGame() {
		pickRandomStudentName();
		System.out.print("You are guessing: ");
		replaceNameWithUnderscore();
		System.out.println("You have guessed " + "(" + counter + ")" + " Wrong letters");
		System.out.println("Guess a letter: ");
		ch = sc.next().charAt(0);
		fillUnderscoreWithLetter();
	}

	void pickRandomStudentName() {
		randomName = studentNames[(int) Math.floor(Math.random() * studentNames.length)];
		System.out.println(randomName);

	}

	void replaceNameWithUnderscore() {
		randomNameCharArray = new char[randomName.length()];
		for (int i = 0; i < randomName.length(); i++) {
			randomNameCharArray[i] = '_';
		}
		System.out.println(randomNameCharArray);
	}

	void fillUnderscoreWithLetter() {

		randomChar = randomName.toCharArray();

		for (int i = 0; i < randomNameCharArray.length; i++) {
			if (randomChar[i] == ch) {
				randomNameCharArray[i] = ch;
			}
			System.out.println(randomNameCharArray[i]);
		}
	}

	boolean countPoints() {

		for (int i = 0; i < randomNameCharArray.length; i++) {
			if (randomNameCharArray[i] != ch) {
				flag = true;

			} else {
				flag = false;
				break;
			}
		}

		return flag;
	}

	void gameDecision() {
		for(int i=0;i<10;i++)
		{
		if (counter <= 5 && randomChar[i]==randomNameCharArray[i]) {
			System.out.println(" Congrats! You win!");
			break;
		} else if (counter > 5) {
			System.out.println("Game is over");
			break;
		}
	}
	}
}
