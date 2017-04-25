/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices;

/**
 *
 * @author formation
 */
public class Employe extends Personne {

    protected int salaire;

    public Employe() {
    }

    public Employe(int salaire) {
        this.salaire = salaire;
    }

    public Employe(int salaire, String nom, String prenom) {
        super(nom, prenom);
        this.salaire = salaire;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

}
