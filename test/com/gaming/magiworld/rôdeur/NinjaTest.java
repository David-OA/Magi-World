package com.gaming.magiworld.rôdeur;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NinjaTest {

    @Test
    public void testNinjaDescription() {
        Ninja ninja = new Ninja(2,40,200,8,12,20, "Kowa Bounga");
        assertEquals(ninja.toString(),"Kowa Bounga !!! Je suis le Ninja joueur 2, niveau 40, je possède 200 de vitalité, 8 de force, 12 d'agilité et 20 d'intelligence");
    }

    @Test
    public final void testNinjaJouerCoupClassique() {
        Ninja ninja = new Ninja(1, 10, 12, 8);
        Ninja adversaire = new Ninja(2, 10, 12, 8);
        ninja.setAdversaire(adversaire);
        assertEquals(ninja.play(1), "Joueur 1 utilise Tir à l'Arc et inflige 12 de dégâts");
    }

    @Test
    public final void testNinjaJouerCoupSpecial() {
        Ninja ninja = new Ninja(1, 10, 12, 8);
        Ninja adversaire = new Ninja(2, 10, 12, 8);
        ninja.setAdversaire(adversaire);
        assertEquals(ninja.play(2), "Joueur 1 utilise Concentration et gagne 15 d'agilité");
    }
}