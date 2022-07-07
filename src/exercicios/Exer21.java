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
public class Exer21 {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        
        int[] vetorG = new int[13];
        int[] apostador1=new int[13], apostador2=new int[13], apostador3=new int[13];
        int acertos1=0, acertos2=0, acertos3=0;
        System.out.println("Numeros sorteados.");
        for (int i = 0; i < 13; i++) {
            vetorG[i] = (int) (1+Math.random()*3);
            System.out.print(" "+vetorG[i]+" |" );
            
            }
        System.out.println("\n");
        System.out.println("Cartão de apostas do apostador 1.");
        for (int i = 0; i < 13; i++) {
            apostador1[i] = (int) (1+Math.random()*3);
            System.out.print (" "+apostador1[i]+" |" );
            if (apostador1[i]==vetorG[i]) {
                acertos1++;
            }
            }
        if (acertos1==13) {
                System.out.println(" Parabéns, você acertou os 13 numeros e foi premiado");
            } else {
                System.out.println(" Você acertou "+acertos1+" numeros.");
            }
        System.out.println("\n");
        System.out.println("Cartão de apostas do apostador 2.");
        for (int i = 0; i < 13; i++) {
            apostador2[i] = (int) (1+Math.random()*3);
            System.out.print (" "+apostador2[i]+" |" );
            if (apostador2[i]==vetorG[i]) {
                acertos2++;
            }
            
            }
        if (acertos2==13) {
                System.out.println(" Parabéns, você acertou os 13 numeros e foi premiado");
            } else {
                System.out.println(" Você acertou "+acertos2+" numeros.");
            }
        System.out.println("\n");
        System.out.println("Cartão de apostas do apostador 3.");
        for (int i = 0; i < 13; i++) {
            apostador3[i] = (int) (1+Math.random()*3);
            System.out.print (" "+apostador3[i]+" |" );
            if (apostador3[i]==vetorG[i]) {
                acertos3++;
            }
            
            }
        if (acertos3==13) {
                System.out.println(" Parabéns, você acertou os 13 numeros e foi premiado");
            } else {
                System.out.println(" Você acertou "+acertos3+" numeros.");
            }
    }
}
