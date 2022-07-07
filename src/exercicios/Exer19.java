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
public class Exer19 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int n=20, vet[] = new int[n], troquei = 0, ultimo=n-1;
        System.out.println("------VETOR ORIGINAL-----");
        for (int i = 0; i < n; i++) {
            vet[i]= (int) (Math.random()*100);
            
            System.out.print("  "+vet[i]);
        }
        System.out.println("\n\n------VETOR TROCADO-----");
        for (int i = 0; i < n/2; i++) {
            troquei = vet[ultimo];
            vet[ultimo]=vet[i];
            vet[i]=troquei;
            ultimo--;
        }
        for (int i = 0; i <n; i++) {
         System.out.print("  "+vet[i]);
     
        }
        System.out.println("\n");
    }
}
