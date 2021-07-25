package com.florin.debugging_junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class BankAccountTestParametrized {

	private BankAccount account;
	private double amount;
	private boolean branch;
	private double expected;
	
	
	
	public BankAccountTestParametrized(double amount, boolean branch, double expected) {
		super();
		this.amount = amount;
		this.branch = branch;
		this.expected = expected;
	}

	@Before
	public void setup() {
		account = new BankAccount("Florin", "Zamfir", 1000.0, BankAccount.CHECKING);
		System.out.println("Running a test...");
	}
	
	@Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        return Arrays.asList(new Object[][] {
	            {100.00, true, 1100.00},
	            {200.00, true, 1200.00},
	            {325.14, true, 1325.14},
	            {489.33, true, 1489.33},
	            {1000.00, true, 2000.00}
        });

    }
	
    @Test
	public void getBalance_deposit() throws Exception {
		account.deposit(amount, branch);
		assertEquals(expected, account.getBalance(), .01);
	}
	

}
