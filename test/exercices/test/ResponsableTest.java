/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.test;

import exercices.Responsable;
import org.junit.Test;

/**
 *
 * @author formation
 */
public class ResponsableTest {
    Responsable boss = new Responsable();
    
    @Test
    public void reponsableTest(){
        Responsable pers=new Responsable();
        System.out.println(pers);
    }
}
