package inheritanceExample;

public class PersonAccountDetails {

	private String bankAccountNumber;
	private String accountHolderName;
	private double accountBalance = 1000;
	private int pinNumber;
	private String bankPassword;

	public PersonAccountDetails() {

	}

	public PersonAccountDetails(String accountNumber, String name, int pin, String password) {
		this.bankAccountNumber = accountNumber;
		this.accountHolderName = name;
		this.pinNumber = pin;
		this.bankPassword = password;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public int getPinNumber() {
		return pinNumber;
	}

	public void setpinNumber(int pinToBeUpdated) {
		this.pinNumber = pinToBeUpdated;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getBankPassword() {
		return bankPassword;
	}

	public void setBankPassword(String bankPassword) {
		this.bankPassword = bankPassword;
	}

	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

}
