package com.gaming.magiworld.mage;

import com.gaming.magiworld.personnage.Personnage;

public class Magicien extends com.gaming.magiworld.personnage.Personnage {
    private int lifeMax;

    /**
     * The different characteristics of the characters
     * @param type of character
     * @param level of character
     * @param life of character
     * @param strength of character
     * @param agility of character
     * @param intelligence of character
     */
    public Magicien(int type, int level, int life, int strength, int agility, int intelligence, String cri) {
        super(type, level, life, strength, agility, intelligence, cri);
        lifeMax = life;
        this.cri = "Abracadabra";
    }

    public Magicien(int numPersonnage, int strenght, int agility, int intelligence) {
        super();
    }

    public Magicien() {

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
                adversaire.loseLife(intelligence);
                phrase = phrase + name + " utilise Boule de Feu et inflige " + intelligence + " de dégâts";
                break;
            case 2:
                phrase = phrase + name + " utilise Soin et gagne";
                if ((intelligence * 2) + life > lifeMax) {
                    phrase = phrase + (lifeMax - life) + "de vitalité";
                    life = lifeMax;
                }else {
                    phrase = phrase + (intelligence * 2) + " de vitalité";
                    life = life + (intelligence * 2);
                }
                break;
            default:
                break;
        }
        return phrase;
    }
}
