package com.florin.debugging_junit;

public class BankAccount {

	private String firstName; 
	private String lastName;
	private double balance;
	public static final int CHECKING = 1;
	public static final int SAVINGS = 2;
	
	private int accountType;
	
	public BankAccount(String firstName, String lastName, double balance, int typeOfAccount) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
		this.accountType = typeOfAccount;
	}
	
	//the branch argument is true if the customer is performing the transaction at a branch with a teller
	//false if performing transaction at ATM
	public double deposit(double amount, boolean branch) {
		this.balance += amount; 
		return this.balance;
	}
	
	public double withdraw(double amount, boolean branch) {
		if (amount > 500 && !branch) {
			throw new IllegalArgumentException();
		}
		this.balance -= amount; 
		return this.balance;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public boolean isChecking() {
		return accountType == CHECKING;
	}
	
}
