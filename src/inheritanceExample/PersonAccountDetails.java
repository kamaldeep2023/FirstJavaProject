package inheritanceExample;

public class PersonAccountDetails {

	private String bankAccountNumber;
	private String accountHolderName;
	private double accountBalance = 1000;
	private int pinNumber;
	private String bankPassword;

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}

	public int getPinNumber() {
		return 1234;
	}

	public String getBankPassword() {
		return "Qwerty09";
	}

	public void setBankPassword(String bankPassword) {
		this.bankPassword = bankPassword;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double totalBalance) {
		this.accountBalance = totalBalance;
	}

}
