package inheritanceExample;

public class OnlineBanking extends BankOperations {

	public OnlineBanking() {

	/*	System.out.println("First Set your BankPassword");
		String passwordSet = sc.next();
		accountDetails.setBankPassword(passwordSet);  */

	}

	@Override
	public double depositMoney() {
		System.out.println("Enter the amount you want to deposit");
		depositAmount = sc.nextInt();

		double existingBalance = accountDetails.getAccountBalance();
		newBalance = existingBalance + depositAmount;

		return newBalance;
	}

	@Override
	public double withDrawAmount() {
		System.out.println("Enter the amount you want to withdraw");
		withDrawAmount = sc.nextInt();

		if (accountDetails.getAccountBalance() > withDrawAmount) {
			double existingBalance = accountDetails.getAccountBalance();
			newBalance = existingBalance - withDrawAmount;
		}

		return newBalance;
	}
}
