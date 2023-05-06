package studentGame;


import java.io.FileInputStream;
//import org.apache.poi.xwpf;
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
 String fileName;
	public StudentGame() {
		pickRandomStudentName();
		System.out.print("You are guessing: ");
		replaceNameWithUnderscore();
		askUserInputALetter();

	}
	void pickFile()
	{
		try {
		FileInputStream fin = new FileInputStream("G:\\Software Testing 2023\\name%20list.docx");
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	
	void pickRandomStudentName() {
		randomName = studentNames[(int) Math.floor(Math.random() * studentNames.length)]; // Math.floor(Math.random() *
																							// (1 + High - Low)) + Low;
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
			System.out.print(randomNameCharArray[i]);
		}
	}

	void askUserInputALetter() {
		System.out.println("You have guessed " + "(" + counter + ")" + " Wrong letters");
		System.out.println("Guess a letter: ");
		ch = sc.next().charAt(0);

		fillUnderscoreWithLetter();
		System.out.println();

		if (countPoints()) {
			counter++;
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

}
