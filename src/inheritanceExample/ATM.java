package inheritanceExample;

import java.util.Arrays;
import java.util.Scanner;

public class ATM extends BankOperations {

	int currentPin;
	
	public ATM(int pin) {
		
		currentPin = pin;	
	}
	
	Scanner sc = new Scanner(System.in);

	@override
	public void changePinPassword() {

		System.out.println("Enter your current Pin");
		int currentPinEntered = sc.nextInt();

		if (currentPinEntered == currentPin) {
			System.out.println("Enter new PIN");
			String newPin = sc.next();
			char[] charCurrentPin = String.valueOf(currentPin).toCharArray();
			char[] charNewPin = newPin.toCharArray();
			
			if(!Arrays.equals(charCurrentPin, charNewPin) && charNewPin.length==4)
			{
				int newPinEntered = Integer.parseInt(new String(charNewPin));
				accountDetails.setpinNumber(newPinEntered);
				System.out.println("New PIN set: " + newPinEntered);
			}
			
			
		}
	}

}
