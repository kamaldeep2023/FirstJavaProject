package arithmeticOperators;

import java.util.Scanner;

public class AtmWithDraw {

	int actualPin = 1234;
	int enteredPin;
	int withDrawAmount;
	int accountBalance;

	Scanner sc = new Scanner(System.in);

	void checkifPinCorrect() {

		for (int counter = 1; counter <= 3; counter++) {

			System.out.println("Enter ATM PIN");
			enteredPin = sc.nextInt();
			if (actualPin == enteredPin) {
				System.out.println("Entered PIN is correct");
				System.out.println("Enter withdaw amount");
				withDrawAmount = sc.nextInt();

				if (withDrawAmount <= accountBalance) {
					System.out.println("Cash withdrawn in amount of : " + withDrawAmount);
				} else {
					System.out.println("Not enough balance");
				}

				break;
			}

			else if (actualPin != enteredPin && counter < 3)

			{
				System.out.println("Entered PIN is incorrect and " + (3 - counter) + " Attempts remaining");
			}

			else {
				System.out.println("Sorry your card is locked due to multiple wrong PIN attempts");
			}

		}
	}

}
