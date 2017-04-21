/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author formation
 */
public class ExempleList {
    public static void main(String[] args) {
        
        //liste typée
        ArrayList<String> titres=new ArrayList<String>();
        
        titres.add("a");
        titres.add("b");
        titres.add("c");
        
        ArrayList<String> listeA=new ArrayList<String>();               
        ArrayList<String> listeB=new ArrayList<String>();
        ArrayList<String> listeC=new ArrayList<String>();
        
        listeA.add("a");
        listeA.add("b");
        listeA.add("c");
        
        listeB.add("d");
        listeB.add("e");
        listeB.add("f");
        
        listeC.addAll(listeA);
        listeC.addAll(listeB);
        
        for(String s:titres)
            System.out.println(s);

        for(String s:listeA)
            System.out.println(listeA);
        
        for(String s:listeB)
            System.out.println(listeB);
        
        for(String s:listeC)
            System.out.println(listeC);
        
        listeC.remove(listeA);
       
        for(String s:listeC)
            System.out.println(listeC);
        
        if(listeC.contains(listeA)==true){
            System.out.println("C contient A");
           }
        else
        {
            System.out.println("C ne contient pas A");
        }
        
        
       /* 
        //liste non typée
        ArrayList liste=new ArrayList();
        
        liste.add("La fierté des nôtres");
        liste.add(new Date());
        liste.add(10);
        
        for(Object object:liste){
            System.out.println(object);
        }*/
    }
    

}
