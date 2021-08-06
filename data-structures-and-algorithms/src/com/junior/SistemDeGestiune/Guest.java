package com.junior.SistemDeGestiune;

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
	public static Guest getGuestByEmail(String email) {
		Guest guest = new Guest("", "", email, "");
		return guest;
	}
	public Guest() {
		
	}
	public static Guest getGuestByPhoneNumber(String phoneNumber) {
		Guest guest = new Guest("", "", "", phoneNumber);
		return guest;
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
}
