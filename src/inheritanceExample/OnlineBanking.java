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

	public void changePinPassword() {
		System.out.println("Enter New Bank Password");
		String newBankPassword = sc.next();
		if ((!currentBankPassword.equals(newBankPassword)) && (newBankPassword.length() > 8)) {
			String newPasswordEntered = newBankPassword;
			accountDetails.setBankPassword(newPasswordEntered);
			System.out.println("New Bank Password is : " + newPasswordEntered);
		} else {
			System.out
					.println("New Password should not match with any old Password and must have minimun 8 characters");
		}
	}
}
