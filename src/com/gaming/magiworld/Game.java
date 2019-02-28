package com.gaming.magiworld;

import com.gaming.magiworld.personnage.Personnage;

public class Game {
    private Personnage Pirate;
    private Personnage Magicien;
    private Personnage Ninja;
    private String name;
    int life;
    int choice;
    Personnage personnage1;
    Personnage personnage2;


    /*public void startGame() {
        int choice;
        if (life > 0) {
            do {
                choice = Main.ask(name + "(" + life + " vitalité), veuillez choisir votre action (1 : attaque, 2 : attaque spéciale)", 1, 2);
                if (choice != 1 && choice != 2) System.out.println("Veuillez saisir une valeur correcte !");
            }while (choice != 1 && choice != 2);

            System.out.println(this.play(choice));
            if (life <= 0) return;
            this.startGame();
        }else {
            System.out.println("Le " + name + " à perdu !");
        }
    }*/

    private void playGame() {
        while (true)
            if (life > 0) {
                do {
                    choice = Main.ask(name + "(" + life + " vitalité), veuillez choisir votre action (1 : attaque, 2 : attaque spéciale)", 1, 2);
                    if (choice != 1 && choice != 2) System.out.println("Veuillez saisir une valeur correcte !");
                } while (choice != 1 && choice != 2);

                System.out.println(this.play(choice));
                if (life >= 0) return;
                this.playGame();
            }else {
                personnage1.loseLife(personnage2.getPersonnage1());
                personnage2.loseLife(personnage1.getPersonnage2());
                if (personnage1.getLife() <= 0 || personnage2.getLife() <= 0) {
                    System.out.println("Le " + name + " à perdu !");
                }
            }
    }


    public void setPirate(Personnage pirate) {
        Pirate = pirate;
    }

    public void setMagicien(Personnage magicien) {
        Magicien = magicien;
    }

    public void setNinja(Personnage ninja) {
        Ninja = ninja;
    }

    /**
     * Return the choise of attack
     * @param choice at the player
     * @return
     */
    protected String play(int choice) {
        return null;
    }
}
