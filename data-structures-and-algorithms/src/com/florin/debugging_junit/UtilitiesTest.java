package com.florin.debugging_junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class UtilitiesTest {

	private Utilities utilities;
	
	@Before
	public void setup() {
		utilities = new Utilities();
		System.out.println("Running tests");
	}
	
	@Test
	public void everyNthChar() throws Exception{

	}
	
	@Test
	public void removePairs() {
		String test = "AABBEDEEFFG";
		assertEquals("ABEDEFG", utilities.removePairs(test));
		String test2 = "AAAAAABBBBCDEFHIIJJJJKLLL";
		assertEquals("ABCDEFHIJKL", utilities.removePairs(test2));
	}

}
