/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

/**
 *
 * @author igork
 */
public class Exer22 {
    public static void main(String[] args) {
       
        
        int [][] matriz ;
        matriz = new int [5][6];
        int ale, cont = 0, soma=0;
            
        for (int i=0;i<matriz.length;i++)
        {
           for (int j=0;j<matriz.length+1;j++){
            matriz[i][j]= (int) (Math.random()*100);
               ale = matriz[i][j];

        }
            
        }
        
        
        
        String imprimir="";
        for (int i=0;i<matriz.length;i++)
        {
              for (int j=0;j<matriz.length+1;j++)
        {
           imprimir=imprimir+"| "+matriz[i][j];
      
        }
              imprimir=imprimir+" |\n";
        }System.out.println(imprimir);
    }
    }

