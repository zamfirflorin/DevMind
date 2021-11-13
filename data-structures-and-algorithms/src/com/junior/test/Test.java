package com.junior.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

interface ICreature {
    String getNickname();
    void setNickname(String nickname);
    void updateScore(long amount) throws NumberFormatException;
    void powerUp(double stamina, double speed, int agility);
}

interface IBurn {
    double getFlamesPower();
    int getFlyingSpeed();
}

interface IBite {
    double getBitePower();
}

class Parameters {
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
    
}

class Abilities implements Comparable<Abilities> {
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
    
    public void update(double stamina, double speed, int agility) {
        this.stamina += stamina;
        this.speed += speed;
        this.agility += agility;
    }
    
    public int powerDifferenceApprox(Abilities other) {
        return (int) Math.abs(this.stamina - other.stamina);
    }
    
    @Override
    public String toString() {
        return "Player has a power of: " + stamina + ", the speed: " +                  speed + " and the agility: " + agility + ".";
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
    
    
}

abstract class Creature implements ICreature,  Comparable<Creature> {
    public Abilities abilities;
    private String nickname;
    private long score;
    
    public Creature(double stamina, double speed, int agility, String nickname, long score) {
        this.abilities = new Abilities(stamina, speed, agility);
        this.nickname = nickname;
        this.score = score;
    }
    
    @Override 
    public String getNickname() {
        return this.nickname;
    }
    
    @Override
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    
    @Override
    public void updateScore(long amount) throws NumberFormatException {
        if (amount < 0) 
            throw new NumberFormatException("Expecting positive bonus                           value, got:" + amount);
        this.score += (int) amount;
    }
    
    @Override
    public void powerUp(double stamina, double speed, int agility) {
        this.abilities.setStamina(this.abilities.getStamina() + stamina);
        this.abilities.setSpeed(this.abilities.getSpeed() + speed);
        this.abilities.setAgility(this.abilities.getAgility() + agility);
    }
    
    @Override
    public int compareTo(Creature other) {
        return this.abilities.compareTo(other.abilities);
    }
    
    @Override
    public String toString() {
        return "Nickname: " + this.nickname + "\nScore: " + this.score +           "\nAbilities: " + this.abilities.toString();
    }
    
}

class Dragon extends Creature implements IBurn{
    private double flamesPower;
    private int flySpeed;
    
        public Dragon(double stamina, double speed, int agility, String nickname, long score, double flamesPower,
            int flySpeed) {
        super(stamina, speed, agility, nickname, score);
        this.flamesPower = flamesPower;
        this.flySpeed = flySpeed;
    }
    
    @Override
    public  double getFlamesPower() {
        return this.flamesPower;
    }
    
    @Override
    public int getFlyingSpeed() {
        return this.flySpeed;
    }
    
    @Override
    public void powerUp(double newStamina, double newSpeed, int newAgility) {
        this.abilities.setStamina(this.abilities.getStamina() + 2* newStamina);
        this.abilities.setSpeed(this.abilities.getSpeed() + newSpeed / 2);
        this.abilities.setAgility(this.abilities.getAgility() +  newAgility);
    }
    
    @Override
    public String toString() {
        return "Nickname: " + super.getNickname() + "\nScore: " + super.getScore() +           "\nAbilities: " + super.abilities.toString() + 
            "\nFlames power: " + this.flamesPower + 
            "\nFly speed: " + this.flySpeed;
    }
}

class Warg extends Creature implements IBite {
	private double bitePower;
    public Warg(double stamina, double speed, int agility, String nickname, long score, double bitePower) {
        super(stamina, speed, agility, nickname, score);
    }

    @Override
    public double getBitePower() {
        return this.bitePower;
    }
    
    @Override
    public void powerUp(double newStamina, double newSpeed, int newAgility) {
        this.abilities.setStamina(this.abilities.getStamina() +  newStamina /2);
        this.abilities.setSpeed(this.abilities.getSpeed() + newSpeed * 4);
        this.abilities.setAgility(this.abilities.getAgility() +  newAgility);
    }
    
    @Override
    public String toString() {
        return "Nickname: " + super.getNickname() + "\nScore: " + super.ge +           "\nAbilities: " + super.abilities.toString() +
            "\nBite Power " + this.bitePower;
    }
}

class Mumakil extends Creature {
	
        public Mumakil(double stamina, double speed, int agility, String nickname, long score) {
        this.abilities = new Abilities(stamina, speed, agility);
        this.nickname = nickname;
        this.score = score;
    }
    
        @Override
    public void powerUp(double newStamina, double newSpeed, int newAgility) {
        this.abilities.setStamina(this.abilities.getStamina() +  newStamina * 0.75);
        this.abilities.setSpeed(this.abilities.getSpeed() + newSpeed +10);
        this.abilities.setAgility(this.abilities.getAgility() +  newAgility);
    }
    
    @Override
    public String toString() {
        return "Nickname: " + super.nickname + "\nScore: " + super.score +           "\nAbilities: " + super.abilities.toString() +
            "\nBite Power " + this.bitePower + "." 
            +"\nA creature of type Mumakil.";
    }
}

class Cohort<C> {
	private Map<String, C> map = new HashMap<>();
    
    public int size() {
        return map.size();
    }
    
    public C getCitizenAt(String address) {
        return map.get(address);
    }
    
    public boolean isEmpty() {
        return map.isEmpty();
    }
    
    public void addNewCitizen(String address, C creature) {
        map.put(address, creature);
    }
    
    public ArrayList getAllCitizensToFight() {
        ArrayList<C> citizens = (ArrayList<C>) map.values();
        Collections.sort(citizens);
        return citizens;
    }
    
    @Override
    public String toString() {
    
        ArrayList<C> citizens = getAllCitizensToFight();
        for (C c : citizens) {
           return  c.toString() + "\n";
            
        }
    }
    
}

class LordOfJava {
	private Parameters parameters; 
    private Cohort<Dragon> dragons; 
    private Cohort<Warg> wargs; 
    private Cohort<Mumakil> mumakils;
    
    public LordOfJava(String OS, String gamePATH, String credentials, int       noLives) {
        this.parameters = new Parameters(OS, gamePATH, credentials, noLives);
        
    }
    
    public void addCreature(Creature creature, String address) {
        if (creature instanceof Dragon) {
            dragons.addNewCitizen(address, creature);
        } else if (creature instanceof Warg) {
             wargs.addNewCitizen(address, creature);
        } else if (creature instanceof Mumakil) {
            mumakils.addNewCitizen(address, creature);
        } else {
            throw IllegalArgumentException("Creature type unknown: " + creature.getClass().getName());
        }
    }
    
    public int battleDragonsWargs() {
        int sum = 0;
        if (wargs.size() > dragons.size()) {
            return 1;
        } else if (wargs.size() < dragons.size()) {
            return -1;
        } else {
            for (int i = 0; i < wargs.size(); i++) {
                sum += dragons.get(i).compareTo(wargs.get(i));
            }
        }
    }
    
    @Override
    public String toString() {
        return 
            parameters.toString() + "\n"
            +dragons.size() + "\n"
            +wargs.size() + "\n"
            +mumakils.size();
            
    }
    
}
