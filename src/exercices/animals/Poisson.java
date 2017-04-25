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
public class Poisson extends Animal {

    public Poisson(String nom) {
        
        this.nom = nom;
    }

    public Poisson() {

    }

    @Override
    public void bouger() {
        this.x++;
        System.out.println(String.format("My position is now %d", this.x));
    }

    @Override
    public void manger() {
        System.out.println("nomnomnom");
    }

}
