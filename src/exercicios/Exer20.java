/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author igork
 */
public class Exer20 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] vetor = new int[15];
        int aux;
         for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random()*100);
            System.out.print(" "+vetor[i]);
             for (int j = 0; j < vetor.length-1; j++) {
                 if (vetor[j]>vetor[j+1]) {
                     aux=vetor[j];
                    vetor[j]=vetor[j+1];
                    vetor[j+1]=aux;
                    
                 }
             }
         }
         int k=0;
         System.out.println("\n");
         while(k<vetor.length){
             System.out.print(+vetor[k]+" ");
             k++;   
    }
}
}