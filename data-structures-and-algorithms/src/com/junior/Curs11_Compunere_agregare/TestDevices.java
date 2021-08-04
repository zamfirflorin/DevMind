package com.junior.Curs11_Compunere_agregare;

public class TestDevices {
	public static void main(String[] args) {
		// to create a smartphone, we will first create it's components
		// Obs: just like in real life
		Screen aPhoneScreen = new Screen(0, 0, 0, 0);
		Case aPhoneCase = new Case();
		Speaker aPhoneSpeaker = new Speaker(0, 0);
		Microphone aPhoneMicrophone = new Microphone(0, 0);
		Smartphone smartphone = new Smartphone(aPhoneScreen, aPhoneCase, aPhoneSpeaker, aPhoneMicrophone);

		// in this case, we use the component directly to press each case button
		System.out.println("Case 1: use the component directly:");
		smartphone.getTheCase().pressPowerButton();
		smartphone.getTheCase().pressVolumeUp();
		smartphone.getTheCase().pressVolumeDown();
		System.out.println();

		// in this case we use the 'wrapper' methods, implemented by Smartphone
		// to press each case button
		System.out.println("Case 2: use the 'wrapper' methods:");
		smartphone.pressPowerButton();
		smartphone.pressVolumeUp();
		smartphone.pressVolumeDown();
	}
}