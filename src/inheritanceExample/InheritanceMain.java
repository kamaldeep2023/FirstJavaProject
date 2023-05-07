package inheritanceExample;

import java.util.Scanner;

public class InheritanceMain {

	public static void main(String[] args) {

		BankOperations bank = null;
		boolean validatePin;

		PersonAccountDetails accountDetails = new PersonAccountDetails("A12345", "Kamal", 1234, "Qwerty09");

		Scanner sc = new Scanner(System.in);

		System.out.println("Account Holder name: " + accountDetails.getAccountHolderName()); // print name

		System.out.println("What banking service you like? ATM / OnlineBanking or say: bankvisit");
		String optionEntered = sc.next();

		switch (optionEntered) {
		case "ATM":
			bank = new ATM(accountDetails.getPinNumber());
			if (bank.validate) {
				System.out.println(
						"Enter 1 if you want to withdraw Or Enter 2 if you want to deposit Money or Enter 3 to set new PIN ");
				int choice = sc.nextInt();

				if (choice == 1) {
					bank.withDrawAmount();
					bank.viewBalance();

					break;
				} else if (choice == 2) {
					bank.depositMoney();
					bank.viewBalance();
					break;
				} else if (choice == 3) {
					validatePin = bank.changePinPassword();
					if (validatePin) {
						accountDetails.setpinNumber(bank.pinChanged);
					} else {
						System.out.println("New Pin should not match with any old Pin and should be 4 digits");
					}

				} else {
					System.out.println("Invalid option");
				}
			}
			break;

		case "OnlineBanking":
			bank = new OnlineBanking(accountDetails.getBankPassword());
			if (bank.validate) {
				System.out.println(
						"Enter 1 if you want to withdraw Or Enter 2 if you want to deposit Money or Enter 3 to set new Bankpassword");
				int option = sc.nextInt();

				if (option == 1) {
					bank.withDrawAmount();
					bank.viewBalance();
					break;
				} else if (option == 2) {
					bank.depositMoney();
					bank.viewBalance();
					break;
				} else if (option == 3) {
					validatePin = bank.changePinPassword();
					if (validatePin) {
						accountDetails.setBankPassword(bank.passwordChanged);
					} else {
						System.out.println("New Pin should not match with any old Pin and should be 4 digits");
					}
				} else {
					System.out.println("Invalid option");
				}
			}

			break;

		default:

			System.out.println("Please visit Bank");

		}
	}

}
