package com.junior.Curs11_Compunere_agregare;

public class Smartphone {

	private Screen theScreen;
	private Case theCase;
	private Speaker theSpeaker;
	private Microphone theMicrophone;
	private Cover aCover;
	


	// initializare directa
	public Smartphone(Screen theScreen, Case theCase, Speaker theSpeaker, Microphone theMicrophone) {
		this.theScreen = theScreen;
		this.theCase = theCase;
		this.theSpeaker = theSpeaker;
		this.theMicrophone = theMicrophone;
	}

	// initializare indirecta
	public Smartphone(int pixelsNo, int width, int length, int depth, int speakerMaxVol, int speakerCrtVol,
			int microMaxVol, int microCrtVol) {
		this.theScreen = new Screen(pixelsNo, width, length, depth);
		this.theCase = new Case();
		this.theSpeaker = new Speaker(speakerMaxVol, speakerCrtVol);
		this.theMicrophone = new Microphone(microMaxVol, microCrtVol);
	}

	public boolean setCover(Cover aCover) {
		if (this.aCover != null) {
			System.out.println("Err: A cover is already in place!");
			return false;
		}
		this.aCover = aCover;
		return true;
	}

	public Cover removeCover() {
		Cover referenceToCover = this.aCover;
		this.aCover = null; // remove cover
		return referenceToCover;
	}

	// in this case we implement wrapper methods for all the methods we want to
	// expose
	// i.e. for power button, volume UP and volume DOWN:
	public void pressPowerButton() {
		// delegate the responsibility to the object specific method
		// Obs: reusing the object functionality
		System.out.println("class Smartphone: delegate to Case ->");
		this.theCase.pressPowerButton();		
	}

	public void pressVolumeUp() {
		// delegate the responsibility to the object specific method
		// Obs: reusing the object functionality
		System.out.println("class Smartphone: delegate to Case ->");
		this.theCase.pressVolumeUp();
		this.theSpeaker.increaseVolume();
	}

	public void pressVolumeDown() {
		// delegate the responsibility to the object specific method
		// Obs: reusing the object functionality
		System.out.println("class Smartphone: delegate to Case ->");
		this.theCase.pressVolumeDown();
		this.theSpeaker.decreaseVolume();
	}
	
	public void setPixel(int pixelIndex, String pixelColor) {
		this.theScreen.setPixel(pixelIndex, pixelColor);
	}
	
	public void colorScreen(String color) {
		this.theScreen.colorScreen(color);
	}
	
	public void increaseMicrophoneVolume() {
		this.theMicrophone.increaseVolume();
	}
	
	public void decreaseMicrophoneVolume() {
		this.theMicrophone.decreaseVolume();
	}
	
	public void muteMicrophone() {
		this.theMicrophone.muteMicrophone();
	}
	
	public void setSilenceMode() {
		this.theSpeaker.setSilenceMode();
	}
}
