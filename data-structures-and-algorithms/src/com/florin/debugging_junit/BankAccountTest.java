package com.florin.debugging_junit;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class BankAccountTest {
	
	private BankAccount account;
	
	@Before
	public void setup() {
		BankAccount account = new BankAccount("Florin", "Zamfir", 1000.0, BankAccount.CHECKING);
		System.out.println("Running a test");
	}

	@Test
	public void deposit() throws Exception {
		BankAccount account = new BankAccount("Florin", "Zamfir", 1000.0, BankAccount.CHECKING);
		double balance = account.deposit(200, true);
		assertEquals(1200, balance, 0);
	}
	
	@Test
	public void withdraw() throws Exception {
		fail("This test has yet to be implemented");
	}
	
	@Test
	public void getBalance_deposit() throws Exception {
		BankAccount account = new BankAccount("Florin", "Zamfir", 1000.0, BankAccount.CHECKING);
		account.deposit(200, true);
		assertEquals(1200, account.getBalance(), 0);
	}
	
	@Test
	public void getBalance_withdraw() throws Exception {
		BankAccount account = new BankAccount("Florin", "Zamfir", 1000.0, BankAccount.CHECKING);
		account.withdraw(200, true);
		assertEquals(800, account.getBalance(), 0);
	}
	
	@Test
	public void isChecking_true() {
		BankAccount account = new BankAccount("Florin", "Zamfir", 1000.0, BankAccount.CHECKING);
		assertTrue("The account is NOT checking account", account.isChecking());
	}
	
	@Test
	public void dummyTest() {
		assertEquals(20, 20);
	}
	

}
