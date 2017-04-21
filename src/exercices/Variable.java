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
public class Variable {
    
    public static void main(String[] args) {
        byte b=1;
        short s=32000;
        int i=123;
        long l=5555555;
        //décimal
        double d=123.456;
        float f=(float) 123.456;
        //texte
        String str="coucou";
        //booléen
        boolean bool=true;
        displayInt(expo(3,3));
        
    }
    
    static void displayInt(long k){
        System.out.println(k);
    }
            
            
    static long expo(long m, long n){
        for(int i=1;i<n;i++){
            m*=m;
        }
        return m;
    }
    
    Tableau test=new Tableau();
    

}

//tableau d'etoiles et dollars