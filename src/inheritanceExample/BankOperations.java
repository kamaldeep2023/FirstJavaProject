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

	public void withDrawAmount(PersonAccountDetails account, double balance) {
		System.out.println("How much you want to withdraw");
		withDrawAmount = sc.nextInt();
		if (balance > withDrawAmount) {
			account.setAccountBalance(balance - withDrawAmount);

		} else {
			System.out.println("Not enough Balance");
		}
	}

	public void depositMoney(PersonAccountDetails account, double balance) {
		System.out.println("How much you want to deposit");
		depositAmount = sc.nextInt();
		account.setAccountBalance(balance + depositAmount);

	}

}
