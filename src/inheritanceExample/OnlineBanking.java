package inheritanceExample;

import java.util.Scanner;

public class OnlineBanking extends BankOperations {

	String currentBankPassword;
	Scanner sc = new Scanner(System.in);

	public OnlineBanking(String password) {
		currentBankPassword = password;
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter your account Password");
			String passwordEntered = sc.next();

			if (currentBankPassword.equals(passwordEntered)) {
				System.out.println("Password is correct");
				validate = true;
				break;
			} else if (i < 2 && (!currentBankPassword.equals(passwordEntered))) {
				System.out.println("Incorrect Password! Please Enter correct Password");
			} else {
				System.out.println("Try again Later");
			}
		}
	}

	public boolean changePinPassword() {
		boolean isSpecificChar = false;
		System.out.println("Enter New Bank Password");
		String newBankPassword = sc.next();

		if (!newBankPassword.contains("$") && !newBankPassword.contains("@") && !newBankPassword.contains("&")) {
			isSpecificChar = true;
		}
		if ((!currentBankPassword.equals(newBankPassword)) && (newBankPassword.length() > 8) && isSpecificChar) {
			passwordChanged = newBankPassword;
			isPinPassed = true;
		}
		return isPinPassed;
	}

}
