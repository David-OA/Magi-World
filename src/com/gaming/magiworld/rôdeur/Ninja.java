package com.gaming.magiworld.rôdeur;

import com.gaming.magiworld.personnage.Personnage;

public class Ninja extends com.gaming.magiworld.personnage.Personnage {
    /**
     * The different characteristics of the characters
     * @param type of character
     * @param level of character
     * @param life of character
     * @param strength of character
     * @param agility of character
     * @param intelligence of character
     */
    public Ninja(int type, int level, int life, int strength, int agility, int intelligence) {
        super(type, level, life, strength, agility, intelligence);
    }

    public Ninja(int numPersonnage, int strenght, int agility, int intelligence) {
        super();
    }

    public Ninja() {

    }


    protected String play(int choice) {
        String phrase = "";
        switch (choice) {
            case 1:
                adversaire.loseLife(agility);
                phrase = phrase + name + " utilise Tir à l'Arc et inflige " + agility + " de dégâts";
                break;
            case 2:
                agility = agility + (level / 2);
                phrase = phrase + name + " utilise Concentration et gagne " + (level / 2) + " d'agilité";
                break;
            default:
                break;
        }
        return phrase;
    }

}
