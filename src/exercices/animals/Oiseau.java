/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.animals;

/**
 *
 * @author formation
 */
public class Oiseau extends Animal {

    public Oiseau(String nom) {
        this.nom = nom;
    }

    @Override
    public void bouger() {
        this.y++;
        System.out.println(String.format("Je suis désormais à %d", this.y));
    }

    @Override
    public void manger() {
        System.out.println("picpicpic");
    }

}
