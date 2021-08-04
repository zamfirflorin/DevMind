package com.junior.Curs11_Compunere_agregare;

public class Speaker {

	
	private int maxVolume; 
	private int crtVolume;
	
	
	public Speaker(int maxVolume) {
		this.crtVolume = (25 / 100) * maxVolume;
	}
	
	public Speaker(int speakerMaxVol, int speakerCrtVol) {
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

	public void setSilenceMode() {
		this.crtVolume = 0;
	}

	public int getMaxVolume() {
		return maxVolume;
	}

	public void setMaxVolume(int maxVolume) {
		this.maxVolume = maxVolume;
	}

	public int getCrtVolume() {
		return crtVolume;
	}

	public void setCrtVolume(int crtVolume) {
		this.crtVolume = crtVolume;
	}
	
	

}
