package exercices.test;

import exercices.objet.ClasseStatique;
import org.junit.Test;
import static org.junit.Assert.*;


public class ObjetTest {
    
    @Test
    public void testStatique2() {
        //ClasseStatique.afficheNbInstances();
        ClasseStatique.getInstance().afficheNbInstances();
    }
    
    @Test
    public void testStatique() {
        ClasseStatique.getInstance().afficheNbInstances();
    }
    
}
