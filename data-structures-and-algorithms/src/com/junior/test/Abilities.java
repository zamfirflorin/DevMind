package com.junior.test;

public class Abilities implements Comparable<Abilities> {
	private double stamina;
    private double speed;
    private int agility;
    
    public Abilities(double stamina, double speed, int agility) {
        this.stamina = stamina; 
        this.speed = speed;
        this.agility = agility;
    }
    
    @Override
    public int compareTo(Abilities other) {
        if (this.stamina > other.stamina) {
            return 1;
        } else if (this.stamina < other.stamina) {
            return -1; 
        } else {
            if (this.speed > other.speed) {
                return 1;
            } else if (this.speed < other.speed) {
                return -1;
            } else {
                if (this.agility > other.agility) {
                    return 1;
                } else if (this.agility < other.agility) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }
    
    public void update (double stamina, double speed, int agility) {
        this.stamina += stamina;
        this.speed += speed;
        this.agility += agility;
    }
    
    public int powerDifferenceApprox(Abilities other) {
        return (int) Math.abs(this.stamina - other.stamina);
    }

	@Override
	public String toString() {
		return "Player has a power of: " + stamina + ", the speed: " + speed + " and the agility: " + agility + ".";
	}

	public double getStamina() {
		return stamina;
	}

	public void setStamina(double stamina) {
		this.stamina = stamina;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getAgility() {
		return agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}
	
	//Player has a power of: 1836, the speed: 288 and the agility: 101.
	
	
    
    
    
}
