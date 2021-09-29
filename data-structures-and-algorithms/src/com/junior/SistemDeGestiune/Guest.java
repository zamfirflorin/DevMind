package com.junior.SistemDeGestiune;

import java.util.Objects;

public class Guest {
	
	private String lastName;
	private String firstName;
	private String email;
	private String phoneNumber;
	
	public Guest(String lastName, String firstName, String email, String phoneNumber) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	public Guest(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
	}
	public Guest() {
		
	}

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Guest  Nume : " + lastName + ", Prenume : " + firstName + ", email : " + email + ", telefon : "
				+ phoneNumber + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, firstName, lastName, phoneNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Guest other = (Guest) obj;
		return Objects.equals(email, other.email) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName) && Objects.equals(phoneNumber, other.phoneNumber);
	}
	
	static int compareCase;
	//if compare case = 1 compar email
	// else if case = 2 -> compar first name
	//si fac compare inainte sa fac getByemail... 
	
	
}
