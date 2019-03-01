package com.gaming.magiworld.personnage;

public class Personnage {
    protected int type;
    protected int level;
    protected int life;
    protected int strength;
    protected int agility;
    protected int intelligence;
    protected Personnage adversaire;
    protected String name;

    String numPersonnage;
    private Object Personnage;


    /**
     * The different characteristics of the characters
     * @param type of character
     * @param level of character
     * @param life of character
     * @param strength of character
     * @param agility of character
     * @param intelligence of character
     */
    public Personnage(int type, int level, int life, int strength, int agility, int intelligence) {
        name = "Joueur " + numPersonnage;
        this.type = type;
        this.level = level = strength + agility + intelligence;
        this.life = life = level * 5;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
    }

    public Object getPersonnage() {
        return Personnage;
    }

    /**
     * Need this
     */
    public Personnage() {

    }

    /**
     * This is for lose life during the fight
     */
    public void loseLife(int lifeOut) {
        life = life - lifeOut;
    }

    /**
     * it's for said who is the adversaire
     * @param personnage2 said the adversaire
     */
    public void setAdversaire(Personnage personnage2) {
        this.adversaire = adversaire;
    }

    /**
     * It's the string of evry personnage
     * @return the string for all personnage
     */
    public String toString() {
        return " ! Je suis le " + type + ", " + ", niveau " + level + ", je possède " + life + " de vitalité, " + strength + " de force, " + agility + " d'agilité et " + intelligence + " d'intelligence;";
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }


    public int getStrength() {
        return strength;
    }


    public int getAgility() {
        return agility;
    }

    public void playGame() {
    }
}
