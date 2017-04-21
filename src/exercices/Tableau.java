/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices;

/**
 *Exo tableau
 * @author formation
 */
public class Tableau {
    public static void main(String[] args) {
    }
    String[][] tab=new String[10][10];
    
    public Tableau(){
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
            tab[i][j]="*";
        }
        }
    }
    
    public void placeCarac(String[][] tab){
        for(int i=0;i<10;i++)
        {
            tab[i][(int)(Math.random()*10)]='$';
        }
        
        
    }
}
