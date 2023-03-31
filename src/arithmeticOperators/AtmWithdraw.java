package arithmeticOperators;

import java.util.Scanner;

public class AtmWithdraw {

	int actualPin = 7890;
	int enteredPin;

	Scanner sc = new Scanner(System.in);
	
	void checkifPinCorrect()
	{
		
	for(int counter=1; counter<=3; counter++)
	{
	
		System.out.println("Enter ATM PIN");
		enteredPin = sc.nextInt();
		if(actualPin==enteredPin)
		{
			System.out.println("Entered PIN is correct");
			break;
		}
		else if (actualPin!=enteredPin && counter<3)
		{
			System.out.println("Entered PIN is incorrect and " + (3-counter) +" Attempts remaining");
		}
		else
		{
			System.out.println("Sorry your card is locked due to multiple wrong PIN attempts");
		}
		
	}
}

}
