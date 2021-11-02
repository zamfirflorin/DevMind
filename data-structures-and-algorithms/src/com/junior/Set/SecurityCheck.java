package com.junior.Set;

import java.util.HashSet;

public class SecurityCheck {

	private HashSet<String> personsIn = new HashSet<String>(100, 0.5f);

	public boolean goesIn(String person) {
		if (personsIn.contains(person)) {
			System.out.println("Security alert! Person already in! [" + person + "]");
			return false;
		}
		personsIn.add(person);
		return true;
	}

	public boolean goesOut(String person) {
		if (!personsIn.contains(person)) {
			System.out.println("Security alert! Person was not in! [" + person + "]");
			return false;
		}
		personsIn.remove(person);
		return true;
	}
}