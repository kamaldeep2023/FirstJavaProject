package inheritanceExample;

import java.util.Scanner;

public abstract class BankOperations {

	public int withDrawAmount;
	public int depositAmount;
	public double newBalance;
	public double balance;
	boolean validate;

	Scanner sc = new Scanner(System.in);

	public abstract void changePinPassword(PersonAccountDetails account);

	public double withDrawAmount(double balance) {
		System.out.println("How much you want to withdraw");
		withDrawAmount = sc.nextInt();
		if (balance > withDrawAmount) {
			double existingBalance = balance;
			newBalance = existingBalance - withDrawAmount;
		} else {
			System.out.println("Not enough Balance");
		}

		return newBalance;
	}

	public double depositMoney(double balance) {
		System.out.println("How much you want to deposit");
		depositAmount = sc.nextInt();
		double existingBalance = balance;
		newBalance = existingBalance + depositAmount;
		return newBalance;
	}

	public void viewBalance(double balance) {

		System.out.println("Existing Balance: " + balance);

		System.out.println("New balance: " + newBalance);
	}

}
