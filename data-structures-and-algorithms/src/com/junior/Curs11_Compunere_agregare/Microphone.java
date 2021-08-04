package com.junior.Curs11_Compunere_agregare;

public class Microphone {

	private int maxVolume; 
	private int crtVolume;
	
	
	public Microphone(int maxVolume) {
		this.crtVolume = (25 / 100) * maxVolume;
	}
	
	public Microphone(int speakerMaxVol, int speakerCrtVol) {
		this.maxVolume = speakerMaxVol;
		this.crtVolume = speakerCrtVol;
	}
	
	public boolean increaseVolume() {
		if (crtVolume < maxVolume) {
			this.crtVolume++;
			return true;
		}
		return false;
	}
	
	public boolean decreaseVolume() {
		if (crtVolume > 0) {
			crtVolume--;
			return true;
		}
		return false;
	}

	public void muteMicrophone() {
		this.crtVolume = 0;
	}

}
