/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices;

import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author formation
 */
public class ExempleMap {
    public static void main(String[] args) {
        
        HashMap<String,String> map =new HashMap<String,String>();
        map.put("intrinsèque","Qui est inhérent à quelqu'un, quelque chose.");
        map.put("ésotérique","Qui ne peut être compris que par les initiés");
        
        System.out.println("ésotérique: "+map.get("ésotérique"));
        System.out.println("intrinsèque: "+map.get("intrinsèque"));
        
        Set<String> cles=map.keySet();
        
        for(String cle:cles){
            System.out.println(cle + " : " + map.get(cle));
        }
        System.out.println(map.keySet());
        
        map.remove("intrinsèque");
        System.out.println(map.keySet());
        
        
        
        
    }
    
}
