package com.florin.debugging_junit;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankAccountTest {
	
	private BankAccount account;
	private static int count;
	
	@BeforeAll //@BeforeClass in Junit4
	public static void beforeClass() {
		System.out.println("This executes before any test cases. Count = " + count++);
	}
	
	@BeforeEach //@Before in Junit4
	public void setup() {
		account = new BankAccount("Florin", "Zamfir", 1000.0, BankAccount.CHECKING);
		System.out.println("Running a test");
	}

	@Test
	public void deposit() throws Exception {
		double balance = account.deposit(200, true);
		assertEquals(1200, balance, 0);
	}
	
	@Test
	public void withdraw_branch() throws Exception {
		double balance = account.withdraw(600, true);
		assertEquals(400.00, balance, 0);
	}
	
	@org.junit.Test(expected = IllegalArgumentException.class)
	public void withdraw_notBranch() throws Exception {
		account.withdraw(600, false);
		fail("SHould have thrown IllegalArgumentException");
	}
	
	@org.junit.Test
	public void withdraw_notBranch_withTryCatch() throws Exception {
		try {
			account.withdraw(600, true);
			fail("SHould have thrown IllegalArgumentException");
		} catch (IllegalArgumentException e) {

		}
	}
	
	@Test
	public void getBalance_deposit() throws Exception {
		account.deposit(200, true);
		assertEquals(1200, account.getBalance(), 0);
	}
	
	@Test
	public void getBalance_withdraw() throws Exception {
		account.withdraw(200, true);
		assertEquals(800, account.getBalance(), 0);
	}
	
	@Test
	public void isChecking_true() {
		assertTrue("The account is NOT checking account", account.isChecking());
	}
	
	@Test
	public void dummyTest() {
		assertEquals(20, 20);
	}
	
	@AfterAll
	public static void afterClass() {
		System.out.println("This executes after any test cases. Count = " + count++);
	}
	
	@AfterEach
	public void teardown() {
		System.out.println("Count = " + count++);
	}

}
