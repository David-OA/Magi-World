package com.gaming.magiworld.guerrier;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PirateTest {
    @Test
    public void testPirateDescription() {
        Pirate pirate = new Pirate(2,40,200,8,12,20,"Woarg");
        assertEquals(pirate.toString(),"Woarg !!! Je suis le Pirate Joueur 2, niveau 40, je possède 200 de vitalité, 8 de force, 12 d'agilité et 20 d'intelligence");
    }

    @Test
    public final void testPirateJouerCoupClassique() {
        Pirate pirate = new Pirate(1, 10, 12, 8);
        Pirate adversaire = new Pirate(2, 10, 12, 8);
        pirate.setAdversaire(adversaire);
        assertEquals(pirate.play(1), "Joueur 1 utilise Coup d'épée et inflige 10 de dégâts");
    }

    @Test
    public final void testPirateJouerCoupSpecial() {
        Pirate pirate = new Pirate(1, 10, 12, 8);
        Pirate adversaire = new Pirate(2, 10, 12, 8);
        pirate.setAdversaire(adversaire);
        assertEquals(pirate.play(2), "Joueur 1 utilise Coup de rage, inflige 20 de dégâts et perd 5 de vitalité");
    }

}