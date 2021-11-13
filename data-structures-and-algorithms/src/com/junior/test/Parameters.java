package com.junior.test;

class Parameters implements Comparable<Parameters> {
	private String OS; 
    private String gamePath; 
    private String credentials;
    private int noLives; 
    public Parameters(String OS, String gamePath, String credentials,
                     int noLives) {
        this.OS = OS;
        this.gamePath = gamePath;
        this.credentials = credentials;
        this.noLives = noLives; 
    }
	@Override
	public String toString() {
		return "OS: " + OS + 
				"\nGame Path: " + gamePath + 
				"\nCredentials=" + credentials + 
				"\nNo. lives remaining: "+ noLives;
	}
	@Override
	public int compareTo(Parameters o) {
		// TODO Auto-generated method stub
		return 0;
	}
    
    
    
}
