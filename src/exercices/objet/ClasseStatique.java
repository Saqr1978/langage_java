/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.objet;

/**
 *
 * @author formation
 */
public class ClasseStatique {
  
   /* static {
        singleton = null;
        nbInstances = 0;
    }*/
    
    private static ClasseStatique singleton;
    private static int nbInstances;

    
    public static ClasseStatique getInstance(){
        if( singleton!=null)
            return singleton;//si diff de null, alors existe deja
        
        singleton = new ClasseStatique();//
        return singleton;
    }
    /*public ClasseStatique() {
        nbInstances++;
    }*/
    private ClasseStatique() {
        nbInstances++;
        System.out.println("***");
    }
    
    public static void afficheNbInstances() {

        System.out.println("Instance:" + ClasseStatique.nbInstances);

    }
    
    
}
