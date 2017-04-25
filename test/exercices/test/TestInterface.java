/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.test;

import exercices.interfaces.Bombardant;
import exercices.interfaces.BombardierFlottant;
import exercices.interfaces.Flottant;
import exercices.interfaces.HydravionMitrailleur;
import exercices.interfaces.Mitraillant;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

/**
 *
 * @author formation
 */
public class TestInterface {

    @Test
    public void testInterface() {
        HydravionMitrailleur hm1 = new HydravionMitrailleur();
        HydravionMitrailleur hm2 = new HydravionMitrailleur();
        BombardierFlottant bf1 = new BombardierFlottant();
        BombardierFlottant bf2 = new BombardierFlottant();

        List<Flottant> listF = new ArrayList<>();
        List<Mitraillant> listM = new ArrayList<>();
        List<Bombardant> listB = new ArrayList<>();

        listF.add(hm1);
        listF.add(hm2);
        listF.add(bf1);
        listF.add(bf2);
        listM.add(hm1);
        listM.add(hm2);
        listB.add(bf1);
        listB.add(bf2);

        for (Flottant f: listF) {
            f.flotter();
        }
        for (Mitraillant m: listM) {
            m.mitrailler();
        }
        for (Bombardant b: listB) {
            b.bombarder();
        }
    }
}
