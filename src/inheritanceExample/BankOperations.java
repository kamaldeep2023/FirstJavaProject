package inheritanceExample;

import java.util.Scanner;

public abstract class BankOperations {

	public int withDrawAmount;
	public int depositAmount;
	public double newBalance;
	public double balance;
	
	
	Scanner sc = new Scanner(System.in);

	PersonAccountDetails accountDetails= new PersonAccountDetails();
	
	public abstract void changePinPassword();
	
	public double withDrawAmount() {
		System.out.println("How much you want to withdraw");
		withDrawAmount = sc.nextInt();

		
		if (accountDetails.getAccountBalance() > withDrawAmount) {
			double existingBalance = accountDetails.getAccountBalance();
			newBalance = existingBalance - withDrawAmount;
		}

		return newBalance;
	}

	public double depositMoney() {
		System.out.println("How much you want to deposit");
		depositAmount = sc.nextInt();

		double existingBalance = accountDetails.getAccountBalance();
		newBalance = existingBalance + depositAmount;

		return newBalance;
	}

	public void viewBalance() {
		
		System.out.println("Existing Balance: " + accountDetails.getAccountBalance());

		accountDetails.setAccountBalance(newBalance);

		System.out.println("New balance: " + accountDetails.getAccountBalance());
	}

}
