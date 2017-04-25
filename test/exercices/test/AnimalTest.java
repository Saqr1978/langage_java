/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.test;

import exercices.Animal;
import exercices.Animal;
import org.junit.Test;

/**
 *
 * @author formation
 */
public class AnimalTest {

    @Test
    public void testConstructeur() {
        Animal renard = new Animal();
        Animal corbeau = new Animal();
        renard.setNom("Rox");
        corbeau.setNom("BlackBird");
        renard.afficheNoms();
    }

}
