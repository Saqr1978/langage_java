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
public class Animal {

    private String nom;
    private int nbPattes;
    private String genre;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbPattes() {
        return nbPattes;
    }

    public void setNbPattes(int nbPattes) {
        this.nbPattes = nbPattes;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void afficheNoms() {
        System.out.println("L'animal s'apelle: " + this.getNom() + ", il a " + this.getNbPattes()+" pattes.");
    }
}
