package practicePrograms;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter char");
		char input = sc.next().charAt(0);
		int i = 0;

		switch (input) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			i++;

		}

		if (i == 1) {
			System.out.println("It's vowel");
		}

		if ((input >= 'a' && input <= 'z') || (input >= 'A' && input <= 'z')) {
			System.out.println("It's alphabet");

		} else {
			System.out.println("not alphabet");
		}

	}

}
