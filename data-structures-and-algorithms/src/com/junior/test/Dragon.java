package com.junior.test;

class Dragon extends Creature{
    public Dragon(double stamina, double speed, int agility, String nickname, long score) {
		super(stamina, speed, agility, nickname, score);
		// TODO Auto-generated constructor stub
	}
	private double flamesPower;
    private int flySpeed;
	public Dragon(double stamina, double speed, int agility, String nickname, long score, double flamesPower,
			int flySpeed) {
		super(stamina, speed, agility, nickname, score);
		this.flamesPower = flamesPower;
		this.flySpeed = flySpeed;
	}
    
    
}
