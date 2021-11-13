package com.junior.test;

public abstract class Creature  implements Comparable<Creature> {
    private Abilities abilities;
    private String nickname;
    private long score;
    
    public Creature(double stamina, double speed, int agility, String nickname, long score) {
        this.abilities = new Abilities(stamina, speed, agility);
        this.nickname = nickname;
        this.score = score;
    }
 
    public void updateScore(long amount) throws NumberFormatException {
        if (amount < 0) 
            throw new NumberFormatException("Expecting positive bonus                           value, got:" + amount);
        this.score += (int) amount;
    }
    
    public void powerUp(double stamina, double speed, int agility) {
        this.abilities.setStamina(this.abilities.getStamina() + stamina);
        this.abilities.setSpeed(this.abilities.getSpeed() + speed);
        this.abilities.setAgility(this.abilities.getAgility() + agility);
    }
    
    @Override
    public int compareTo(Creature other) {
        return this.abilities.compareTo(other.abilities);
    }
    
    
    
}