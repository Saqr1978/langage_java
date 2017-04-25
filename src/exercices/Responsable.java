/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/**
 *
 * @author formation
 */
public class Responsable extends Employe {

    private LinkedHashSet<String> listEmployes = new LinkedHashSet<>();

    public Responsable() {
    }

    public LinkedHashSet<String> getListEmployes() {
        return listEmployes;
    }

    public void setListEmployes(LinkedHashSet<String> listEmployes) {
        this.listEmployes = listEmployes;
    }

    @Override
    public String toString() {
        return "Responsable{" + "listEmployes=" + this.listEmployes + '}';
    }

}
