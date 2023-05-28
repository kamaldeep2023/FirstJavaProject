package practicePrograms;

import java.util.*;

public class Game {

	char input1;
	char input2;
	char result;

	Scanner sc = new Scanner(System.in);

	public void game() {
		System.out.println("What you want ? R/P/S");
		input1 = sc.next().charAt(0);
		System.out.println("What you want ? R/P/S");
		input2 = sc.next().charAt(0);

		if((input1 == 'P') && (input2 == 'P')||(input1 == 'S') && (input2 == 'S') || (input1 == 'R') && (input2 == 'R'))
		{
			System.out.println("Try again ");
		}
		else if((input1 == 'S') && (input2 == 'P'))
		{
			System.out.println("User has won with input: " + input1);
		}
		else if((input1 == 'P') && (input2 == 'S'))
		{
			System.out.println("User has won with input: " + input2);
		}
		else if(input1=='R' || input2=='R')
		{
			System.out.println("User has won with Rock input");
		}
	}

}
