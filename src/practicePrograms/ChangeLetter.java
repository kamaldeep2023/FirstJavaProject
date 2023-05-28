package practicePrograms;

import java.util.Scanner;

public class ChangeLetter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence/word to chnage it's cases ");
		String name = sc.nextLine();
		String nameUpper = name.toUpperCase();
		System.out.println(nameUpper);
		System.out.println(name.toLowerCase());

		boolean isAlphabet;
		System.out.println("Enter alphabet to know if it's alphabet or not");
		char c = sc.next().charAt(0);
		
		isAlphabet = Character.isAlphabetic(c);
		System.out.println(isAlphabet);

	}

}
