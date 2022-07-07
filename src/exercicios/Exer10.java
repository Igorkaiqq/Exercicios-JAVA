/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Random;

/**
 *
 * @author Igor
 */
public class Exer10 {
    public static void main(String[] args) {
        
        int[][] M = new int [5][5];
        int[] somaL = new int[5];
        int[] somaC = new int[5];
        
        String imprimir="";
        
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < 5; j++) {
                M[i][j] = new Random().nextInt(5) ;
            }
        }
        
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    if (i==k) {
                somaL[k]= somaL[k] + M[i][j];
            }
                }
                for (int k = 0; k < 5; k++) {
                    if (j==k) {
                somaC[k]= somaC[k] + M[i][j];
            }
                }
                
            }
        }
        System.out.println("Matrix 5x5");
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < 5; j++) {
                imprimir = imprimir+" | "+M[i][j];
            }
            imprimir = imprimir+" |\n";
            }
        System.out.println(imprimir);
        System.out.println("---------------------------------------------");
        System.out.println("Vetor da soma das linhas");
        for (int k = 0; k < 5; k++) {
            System.out.print(somaL[k]+" ");
        }
        System.out.println("\n");
        System.out.println("Vetor da soma das colunas");
        for (int k = 0; k < 5; k++) {
            System.out.print(somaC[k]+" ");
        }
    }
}
