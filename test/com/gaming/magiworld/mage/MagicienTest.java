package com.gaming.magiworld.mage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagicienTest {
    @Test
    public void testMagicienDescription(){
        Magicien magicien = new Magicien(1,40,200, 8, 12, 20);
        assertEquals(magicien.toString(), "Abracadabra ! Je suis le Magicien, Joueur 1, niveau 40, je possède 200 de vitalité, 8 de force, 12 d'agilité et 20 d'intelligence");
    }

    @Test
    public final void testMagicienJouerCoupClassique() {
        Magicien magicien = new Magicien(1, 10, 12, 8);
        Magicien adversaire = new Magicien(2, 10, 12, 8);
        magicien.setAdversaire(adversaire);
        assertEquals(magicien.play(1), "Joueur 1 utilise boule de feu et inflige 8 de dégâts");
    }

    @Test
    public final void testMagicienJouerCoupSpecial() {
        Magicien magicien = new Magicien(1, 10, 12, 8);
        Magicien adversaire = new Magicien(2, 10, 12, 8);
        magicien.setAdversaire(adversaire);
        assertEquals(magicien.play(2), "Joueur 1 utilise Soin et gagne 0 de vitalité");
        magicien.setLife(0);
        assertEquals(magicien.play(2), "Joueur 1 utilise Soin et gagne 16 de vitalité");
    }

}