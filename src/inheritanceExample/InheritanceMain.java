package inheritanceExample;

import java.util.Scanner;

public class InheritanceMain {

	public static void main(String[] args) {

		BankOperations bank=null;

		PersonAccountDetails accountDetails = new PersonAccountDetails("A12345", "Kamal", 1234, "Qwerty09");

		Scanner sc = new Scanner(System.in);
		

		System.out.println("Account Holder name: " + accountDetails.getAccountHolderName()); // print name

		System.out.println("What banking service you like? ATM / OnlineBanking or say: bankvisit");
		String optionEntered = sc.next();

		switch (optionEntered) {
		case "ATM":
			bank = new ATM(accountDetails.getPinNumber());

			for (int i = 0; i < 3; i++) {
				System.out.println("Enter your PIN");
				int pinNumberEntered = sc.nextInt();

				if (accountDetails.getPinNumber() == pinNumberEntered) {
					System.out.println("PIN is correct");
					System.out.println("Enter 1 if you want to withdraw Or Enter 2 if you want to deposit Money  ");
					int choice = sc.nextInt();

					if (choice == 1) {
						bank.withDrawAmount();
						break;
					} else if (choice == 2) {
						bank.depositMoney();
						break;
					} else {
						System.out.println("Invalid option");
					}
				}

				else if (i < 2 && accountDetails.getPinNumber() != pinNumberEntered) {
					System.out.println("Incorrect PIN! Please Enter correct PIN");
				} else {
					System.out.println("Try Again later");
				}

			}

			break;

		case "OnlineBanking":
			bank = new OnlineBanking();

			for (int i = 0; i < 3; i++) {
				System.out.println("Enter your account Password");
				String passwordEntered = sc.next();

				if (accountDetails.getBankPassword().equals(passwordEntered)) {
					System.out.println("Password is correct");
					System.out.println("Enter 1 if you want to withdraw Or Enter 2 if you want to deposit Money ");
					int option = sc.nextInt();

					if (option == 1) {
						bank.withDrawAmount();
						break;
					} else if (option == 2) {
						bank.depositMoney();
						break;
					} else {
						System.out.println("Invalid option");
					}

				} else if (i < 2 && (!accountDetails.getBankPassword().equals(passwordEntered))) {
					System.out.println("Incorrect Password! Please Enter correct Password");
				} else {
					System.out.println("Try again Later");
				}
			}
			break;

		default:

			System.out.println("Enter 1 for Deposit or Enter 2 for Withdraw");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				bank.withDrawAmount();
				break;
			case 2:
				bank.depositMoney();
				break;
			default:
				break;
			}
		}
		bank.viewBalance();
	}

}
