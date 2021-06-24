package com.florin.p1;

public class PlayerStatus {

	public static String gameName;
	
	private String nickname;
	private int score;
	private int lives; 
	private int health;
	private String weaponInHand;
	private double positionX;
	private double positionY;
	


	public boolean shouldAttackOpponent(PlayerStatus opponent) {
		
		double distance = Math.sqrt(Math.pow((this.positionX - opponent.positionX), 2) + Math.pow((this.positionY - opponent.positionY), 2));
		System.out.println("Distanta este : " + distance);
		
		if (this.getWeaponInHand().equals(opponent.getWeaponInHand())) {
		
			if (this.probabilityToWin(this.getHealth(), this.getScore()) > opponent.probabilityToWin(opponent.getHealth(), opponent.getScore())) {
				return true;
			} else {
				return false;
			}
			
		} else {
			
			if (distance <= 1000) {
				//kalashnikov > sniper > knife
				if (this.getWeaponInHand().equals("kalashnikov")) {
					return true;
				} else if (this.getWeaponInHand().equals("sniper") && opponent.getWeaponInHand().equals("knife")) {
					return true;
				} else {
					return false;
				}
				
			} else {
				//sniper > kalashnikov > knife
				if (this.getWeaponInHand().equals("sniper")) {
					return true;
				} else if (this.getWeaponInHand().equals("kalashnikov") && opponent.getWeaponInHand().equals("knife")) {
					return true;
				} else {
					return false;
				}
			}
		}		
	}
	
	private double probabilityToWin(int health, int score) {
		return (3 * health + score / 1000) / 4;
	}
	
	public void initPlayer(String nickname) {
		this.nickname = nickname;
	}
	
	public void initPlayer(String nickname, int lives) {
		this.nickname = nickname;
		this.lives = lives;
	}
	
	public void initPlayer(String nickname, int lives, int score) {
		this.nickname = nickname;
		this.lives = lives;
		this.score = score;
	}

	public int getScore() {
		return this.score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getLives() {
		return this.lives;
	}

	public void setLives(int lives) {
		if (lives > 0) {
			this.lives = lives;
		} else {
			System.out.println("Game Over");
		}
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
	
		if (health > 0 && health <= 100) {
			this.health = health;
		}
		
		if (health > 100) {
			this.health = 100;
		}

		if (health <= 0) {
			if (getLives() > 0) {
				setLives(getLives()-1);
				setHealth(100);
			} else {
				System.out.println("Game Over");
			}
		}
	}
	
	public void findArtifact(int artifactId) {
		if (isPerfectNumber(artifactId)) {
			setScore(getScore()+5000);
			setLives(getLives()+1);
			setHealth(100);
		} else if (isPrime(artifactId)) {
			setScore(getScore()+1000);
			setLives(getLives()+2);
			setHealth(getHealth()+25);
		} else if (isEven(artifactId) && dividableByThree(artifactId)){
			setScore(getScore()-3000);
			setHealth(getHealth()-25);
		} else {
			setScore(getScore()+artifactId);
		}
	}
	
	
	
	private boolean dividableByThree(int n) {
		if (n % 3 == 0) {
			return true;
		} else {
		return false;
		}
	}


	private boolean isEven(int n) {
		boolean even = false;
		if (n % 2 == 0) {
			even = true;
		}
		return even;
	}


	private static boolean isPrime(int n) {
		if (n == 1) {
			return true;
		} 
		
		if (n == 2) {
			return true;
		}
		
		for (int i = 2; i <= n; i++) {
			
			if (n % i == 0) {
				return false;
			} else {
				return true;
			}
		}
		return false;
	}


	private boolean isPerfectNumber(int artifactId) {
		boolean isPerfectNumber = false;
		int sum = 0; 
		
		for (int i = 1; i < artifactId; i++) {
			if (artifactId % i == 0) {
				sum += i;
			}
		}
		
		if (sum == artifactId) {
			isPerfectNumber = true;
		}
		return isPerfectNumber;
	}
	
	public String getWeaponInHand() {
		return weaponInHand;
	}

	public boolean setWeaponInHand(String weaponInHand) {
		int weaponPrice = 0;
		
		if (weaponInHand.equals("knife")) {
			weaponPrice = 1000;
		} else if (weaponInHand.equals("sniper")) {
			weaponPrice = 10000;
		} else if (weaponInHand.equals("kalashnikov")) {
			weaponPrice = 20000;
		} else {
			System.out.println("Numele armei nu este valid");
		}
		
		if((getScore() - weaponPrice) >= 0) {
			setScore(getScore() - weaponPrice);
			this.weaponInHand = weaponInHand;
			return true;
		} else {
			return false;
		}
	
		
	}

	public double getPositionX() {
		return positionX;
	}

	public void setPositionX(double positionX) {
		this.positionX = positionX;
	}

	public double getPositionY() {
		return positionY;
	}

	public void setPositionY(double positionY) {
		this.positionY = positionY;
	}


	static String getGameName() {
		return gameName;
	}


	static void setGameName(String gameName) {
		PlayerStatus.gameName = gameName;
	}
	
	public void movePlayerTo(double positionX, double positionY) {
		this.positionX = positionX;
		this.positionY = positionY;
	}


	public String getNickname() {
		return nickname;
	}


	public void afiseazaStarea() {
		System.out.println( "PlayerStatus [nickname=" + nickname + ", score=" + score + ", lives=" + lives + ", health=" + health
				+ ", weaponInHand=" + weaponInHand + ", positionX=" + positionX + ", positionY=" + positionY + "]");
	}
	
	
	
	
}
