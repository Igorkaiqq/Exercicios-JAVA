/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;
/**
 *
 * @author igork
 */
public class Exer18 {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        int vet[]=new int[20];
        int maior=vet[0];
        int posicao=0;        
        
        for (int i = 0; i < 20; i++) {
          vet[i]= (int) (Math.random()*100);
          if (vet[i]>maior) {
                maior = vet[i];
                posicao=i+1;
            }  
          
          System.out.println("Posição "+(i+1)+": "+vet[i]);
            
        }
        System.out.println("O maior numero é: "+maior+" e está na posição "+posicao);
        
    }
}
