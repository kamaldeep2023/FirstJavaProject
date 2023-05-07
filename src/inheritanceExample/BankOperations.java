package inheritanceExample;

import java.util.Scanner;

public abstract class BankOperations {

	public int withDrawAmount;
	public int depositAmount;
	public double newBalance;
	public double balance;
	boolean validate;
	boolean isPinPassed;
	int pinChanged;
	String passwordChanged;

	Scanner sc = new Scanner(System.in);

	PersonAccountDetails accountDetails1 = new PersonAccountDetails();

	public abstract boolean changePinPassword();

	public double withDrawAmount() {
		System.out.println("How much you want to withdraw");
		withDrawAmount = sc.nextInt();
		if (accountDetails1.getAccountBalance() > withDrawAmount) {
			double existingBalance = accountDetails1.getAccountBalance();
			newBalance = existingBalance - withDrawAmount;
		}

		return newBalance;
	}

	public double depositMoney() {
		System.out.println("How much you want to deposit");
		depositAmount = sc.nextInt();

		double existingBalance = accountDetails1.getAccountBalance();
		newBalance = existingBalance + depositAmount;

		return newBalance;
	}

	public void viewBalance() {

		System.out.println("Existing Balance: " + accountDetails1.getAccountBalance());

		accountDetails1.setAccountBalance(newBalance);

		System.out.println("New balance: " + accountDetails1.getAccountBalance());
	}

}
