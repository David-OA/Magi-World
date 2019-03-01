package com.gaming.magiworld.guerrier;

import com.gaming.magiworld.personnage.Personnage;

public class Pirate extends com.gaming.magiworld.personnage.Personnage {
    /**
     * The different characteristics of the characters
     * @param type of character
     * @param level of character
     * @param life of character
     * @param strength of character
     * @param agility of character
     * @param intelligence of character
     */
    public Pirate(int type, int level, int life, int strength, int agility, int intelligence) {
        super(type, level, life, strength, agility, intelligence);
    }

    public Pirate(int numPersonnage, int strenght, int agility, int intelligence) {
        super();
    }

    public Pirate() {

    }

    /**
     * This is the different attacks of character
     * @param choice the attack
     * @returnchoice of gamer
     */
    protected String play(int choice) {
        String phrase = "";
        switch (choice) {
            case 1:
                adversaire.loseLife(strength);
                phrase = phrase + name + " utilise Coup d'épée et inflige " + strength + " de dégâts";
                break;
            case 2:
                adversaire.loseLife((strength * 2));
                life = life - (strength * 2);
                phrase = phrase + name + " utilise Coup de Rage et inflige " + (strength * 2) + " de dégâts et perd " + (strength / 2) + " de vitalité.";
                break;
            default:
                break;
        }
        if (life > 0) {
            return phrase;
        }else {
            return "Le " + name + " n'a plus de vie, il a perdu !!";
        }
    }
}
