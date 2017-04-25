/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.test;

import exercices.animals.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

/**
 *
 * @author formation
 */
public class AnimalsTest {

    @Test
    public void testAnimals() {

        List<Animal> anims = new ArrayList();

        Poisson p1 = new Poisson("nemo");
        Poisson p2 = new Poisson("Carlo le mollusque");
        p1.setX(10);
        p2.setY(12);
        anims.add(p1);
        anims.add(p2);
    }

}
