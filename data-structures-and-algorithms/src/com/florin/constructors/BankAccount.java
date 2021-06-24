package com.florin.constructors;

public class BankAccount {
	private String firstName;
	private String lastName;
	private int accountBalance;

	private static String bankSWIFT;

	public void initializeBankAccount(String personFirstName, String personLastName, int initialAccountBalance) {
		this.firstName = personFirstName;
		this.lastName = personLastName;
		this.accountBalance = initialAccountBalance;
	}
	
	public BankAccount () {
		this("UNKNOWN_FIRST_NAME", "UNKNOWN_LAST_NAME", 0);
	}

	public BankAccount(String firstName) {
		this(firstName,  "UNKNOWN_LAST_NAME", 0);
	}
	
	public BankAccount(String firstName, String lastName) {
		this(firstName, lastName, 0);
	}
	
	public BankAccount(String lastName, int accountBalance) {
		this("UNKNOWN_FIRST_NAME", lastName, accountBalance);
	}
	
	public BankAccount(String firstName, String lastName, int accountBalance) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountBalance = accountBalance;
	}

	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}

	public void setFullName(String personFirstName, String personLastName) {
		this.firstName = personFirstName;
		this.lastName = personLastName;
	}

	public boolean debitAccount(int amount) {
		if (amount <= accountBalance) {
			this.accountBalance -= amount;
			return true;
		}
		return false;
	}

	public void creditAccount(int amount) {
		this.accountBalance += amount;
	}

	protected void adminBlockAccount() {
		this.accountBalance = -1;
	}

	public static String getBankSWIFT() {
		return bankSWIFT;
	}

	public static void setBankSWIFT(String newBankSWIFT) {
		bankSWIFT = newBankSWIFT;
	}
}