package inheritanceExample;

import java.util.Scanner;

public class InheritanceMain {

	public static void main(String[] args) {

		BankOperations bank = null;
		String name;

		PersonAccountDetails accountDetailsKamal = new PersonAccountDetails("A12345", "Kamal", 1234, "Qwerty09");
		PersonAccountDetails accountDetailsPreet = new PersonAccountDetails("B78733", "Preet", 7894, "Qwerty09");
		PersonAccountDetails accountDetailsSingh = new PersonAccountDetails("C98303", "Singh", 1234, "Qwerty09");
		PersonAccountDetails accountDetailsNisha = new PersonAccountDetails("D66223", "Nisha", 1234, "Qwerty09");
		PersonAccountDetails accountDetailsDeep = new PersonAccountDetails("D66223", "Deep", 1234, "Qwerty09");

		PersonAccountDetails[] accountDetails = { accountDetailsKamal, accountDetailsPreet, accountDetailsSingh,
				accountDetailsNisha, accountDetailsDeep };
		PersonAccountDetails account = null;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name to do bank transactions");
		name = sc.next();
		for (int i = 0; i < accountDetails.length; i++) {
			if (accountDetails[i].getAccountHolderName().equals(name)) {
				account = accountDetails[i];
				System.out.println("What banking service you like? ATM / OnlineBanking or say: bankvisit");
				String optionEntered = sc.next();

				switch (optionEntered) {
				case "ATM":

					bank = new ATM(account.getPinNumber());
					if (bank.validate) {
						System.out.println(
								"Enter 1 if you want to withdraw Or Enter 2 if you want to deposit Money or Enter 3 to set new PIN ");
						int choice = sc.nextInt();

						if (choice == 1) {
							bank.withDrawAmount(account.getAccountBalance());
							bank.viewBalance(account.getAccountBalance());
							break;
						} else if (choice == 2) {
							bank.depositMoney(account.getAccountBalance());
							bank.viewBalance(account.getAccountBalance());
							break;
						} else if (choice == 3) {
							bank.changePinPassword(account);
						} else {
							System.out.println("Invalid option");
							break;
						}
					}
					break;

				case "OnlineBanking":
					bank = new OnlineBanking(account.getBankPassword());
					if (bank.validate) {
						System.out.println(
								"Enter 1 if you want to withdraw Or Enter 2 if you want to deposit Money or Enter 3 to set new Bankpassword");
						int option = sc.nextInt();

						if (option == 1) {
							bank.withDrawAmount(account.getAccountBalance());
							bank.viewBalance(account.getAccountBalance());
							break;
						} else if (option == 2) {
							bank.depositMoney(account.getAccountBalance());
							bank.viewBalance(account.getAccountBalance());
							break;
						} else if (option == 3) {

							bank.changePinPassword(account);
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

	}
}
