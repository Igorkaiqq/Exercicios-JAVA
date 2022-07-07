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
public class Exer24 {
    public static void main(String[] args) {
        int[][] matriz = new int [10][10];
        int maior = 0, minimax=100, linha=0, coluna=0;
        String imprimir="";
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                 matriz[i][j] = new Random().nextInt(100) ;
            }
        }
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matriz[i][j]>maior) {
                    maior = matriz[i][j];
                    linha = i;
                }
                
            }
        }
        
        for (int i = 0; i < 10; i++) {
            if (minimax>matriz[linha][i]) {
                    minimax=matriz[linha][i];

                } 
                
            
        }
        
        System.out.println("Matrix 10x10");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                imprimir = imprimir+" | "+matriz[i][j];
            }
            imprimir = imprimir+" |\n";
            }
        System.out.println(imprimir);
        System.out.println("Matriz maior "+maior);
        System.out.println("Valor maior na linha "+(linha+1));
        System.out.println("Valor do minimax da matriz "+minimax);
    }
}
