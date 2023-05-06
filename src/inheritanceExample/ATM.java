package inheritanceExample;

import java.util.Arrays;
import java.util.Scanner;

public class ATM extends BankOperations {

	int currentPin;

	Scanner sc = new Scanner(System.in);

	public ATM(int pin) {
		currentPin = pin;
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter your current Pin");
			int currentPinEntered = sc.nextInt();
			if (currentPinEntered == currentPin) {
				validate = true;
				break;
			} else if (i < 2 && currentPinEntered != currentPin) {
				System.out.println("Incorrect PIN! Please Enter correct PIN");
			} else {
				System.out.println("Try Again later");
			}

		}
	}

	@override
	public void changePinPassword() {

		System.out.println("Enter new PIN");
		String newPin = sc.next();
		char[] charCurrentPin = String.valueOf(currentPin).toCharArray();// String.valueof() method convert the integer
																			// to a string and tocharArray() convert the
																			// string to an array of characters
		char[] charNewPin = newPin.toCharArray();

		if (!Arrays.equals(charCurrentPin, charNewPin) && charNewPin.length == 4) {
			int newPinEntered = Integer.parseInt(new String(charNewPin));

			accountDetails.setpinNumber(newPinEntered);
			System.out.println("New PIN set: " + accountDetails.getPinNumber());
		} else {
			System.out.println("New Pin should not match with any old Pin and should be 4 digits");
		}

	}

}
