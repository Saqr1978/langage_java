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
public class Client {
    
    
    private String nom;
    private String prenom;
    private int age;

    //constructeur par défaut
    public Client() {

    }

    //constructeur à paramètres
    public Client(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
    //accesseurs et mutateurs
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void afficherClient(){
        System.out.println("Le nom du client est: "+this.nom+", Son prénom est "+this.prenom+", il a "+this.age+" ans.");
    }

    @Override
    public String toString() {
        return "Client{" + "nom=" + nom + ", prenom=" + prenom + ", age=" + age + '}';
    }
    
    
}
