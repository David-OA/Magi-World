package com.gaming.magiworld;

import com.gaming.magiworld.guerrier.Pirate;
import com.gaming.magiworld.mage.Magicien;
import com.gaming.magiworld.personnage.Personnage;
import com.gaming.magiworld.rôdeur.Ninja;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numPersonnage = 1;
        Personnage personnage1 = creerPersonnage(numPersonnage);
        System.out.println(personnage1.toString());
        numPersonnage++;
        Personnage personnage2 = creerPersonnage(numPersonnage);
        System.out.println(personnage2.toString());
        Game game = new Game();
        game.playGame();
    }

    /**
     * The création of characters
      * @param numPersonnage
     * @return character
     */
    private static Personnage creerPersonnage(int numPersonnage) {
        Personnage p;
        int type, level, strenght, agility, intelligence;
        System.out.println("Création du personnage du Joueur " + numPersonnage);
        type = ask("Veuillez choisir la classe de votre personnage (1 : Geurrier, 2 : Rôdeur, 3 : Mage)", 1 , 3);
        do {
            level = ask("Niveau du personnage ?", 1);
            strenght = ask("Force du personnage ?", 0);
            agility = ask("Agilité du personnage ?", 0);
            intelligence = ask("Intelligence du personnage ?", 0);
            if (strenght + agility + intelligence != level) {
                System.out.println("Attention le total des capacités doit être égal au niveau du joueur !!!");
            }
        }while (strenght + agility + intelligence != level); //jusqu'à ce que ce soit bon //
        switch (type) {
            case 1 :
                p = new Pirate(numPersonnage, strenght, agility, intelligence);
                break;
            case 2 :
                p = new Magicien(numPersonnage, strenght, agility, intelligence);
                break;
            case 3 :
                p = new Ninja(numPersonnage, strenght, agility, intelligence);
                break;
            default:
                p = new Pirate(numPersonnage, strenght, agility, intelligence);
        }
        return p;
    }

    /**
     * The scanne of differents choice
     * @param str
     * @param min
     * @return
     */
    private static int ask(String str, int min) {
        int choice;
        boolean goodChoice;
        Scanner sc = new Scanner(System.in); // Reading from System.in
        Scanner reader; //champ de la classe en static
        reader = new Scanner(System.in);
        do {
            choice = 0;
            System.out.println(str);
            try {
                goodChoice = true;
                reader.nextInt();
            } catch (InputMismatchException e) {
                reader.next();
                goodChoice = false;
            }
            if (goodChoice) {
                if (!(choice >= min)) goodChoice = false;
            }
        }while (!goodChoice);
        return choice;
    }

    /**
     * Complete the action of scanner
     * @param str
     * @param min
     * @param max
     * @return
     */
    public static int ask(String str, int min, int max) {
        int choice;
        do {
            choice = ask(str, min);
        }while (choice > max);
        return choice;
    }
}
