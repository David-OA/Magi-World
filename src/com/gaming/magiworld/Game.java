package com.gaming.magiworld;

import com.gaming.magiworld.personnage.Personnage;

public class Game {
    private String name;
    int life;
    int choice;
    Personnage personnage1;
    Personnage personnage2;
    Personnage adversaire;

    /**
     *
     */
    public void playGame() {
        while (true)
            if (life > 0) {
                do {
                    choice = Main.ask(name + "(" + life + " vitalité), veuillez choisir votre action (1 : attaque, 2 : attaque spéciale)", 1, 2);
                    if (choice != 1 && choice != 2) System.out.println("Veuillez saisir une valeur correcte !");
                } while (choice != 1 && choice != 2);

                System.out.println(this.play(choice));
                if (life >= 0) return;
                this.adversaire.playGame();
            }else {
                personnage1.loseLife(personnage2.getAgility());
                personnage2.loseLife(personnage1.getStrength());
                if (personnage1.getLife() <= 0 || personnage2.getLife() <= 0) {
                    System.out.println("Le " + name + " à perdu !");
                }
            }
    }

    /**
     * Return the choise of attack
     * @param choice at the player
     * @return
     */
    protected int play(int choice) {
        return choice;
    }
}
