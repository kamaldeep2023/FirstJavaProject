package inheritanceExample;

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
	public void changePinPassword(PersonAccountDetails account) {
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter new PIN");
			int newPin = sc.nextInt();
			if (currentPin != newPin && String.valueOf(newPin).length() == 4) {
				account.setpinNumber(newPin);
				System.out.println("New Pin Set: " + account.getPinNumber());
				break;
			} else {
				System.out.println("New Pin should not match with any old Pin and should be 4 digits");
			}
		}

	}
}
