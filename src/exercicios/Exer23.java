/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Random;

/**
 *
 * @author igork
 */
public class Exer23 {
    public static void main(String[] args) {
        int matriz[][] = new int [5][5];
        String imprimir="";
        int somaL3=0, somaC5=0, somaDP=0, somaDS=0, somaT=0;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = new Random().nextInt(5) ;
               
            }
        }
         
                for (int i = 0; i < matriz.length; i++) {
                     for (int j = 0; j < 5; j++) {
                         somaT = somaT + matriz[i][j];
                if (i==2) {
                    somaL3 = somaL3 + matriz[i][j];
                }
                if (j==4) {
                    somaC5 = somaC5 + matriz[i][j];
                }
                if (i==j) {
                    somaDP = somaDP + matriz[i][j];
                }
               }
          }
                for (int i = matriz.length-1; i >= 0; i--) {
                     for (int j = matriz.length-1; j >= 0; j--) {
                         if (i+j==matriz.length-1) {
                             somaDS = somaDS + matriz[i][j];
                         }
                    }
        }
        System.out.println("Matrix 5x5");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < 5; j++) {
                imprimir = imprimir+" | "+matriz[i][j];
            }
            imprimir = imprimir+" |\n";
            
        }
        System.out.println(imprimir);
        System.out.println("A soma da linha 3: "+somaL3);
        System.out.println("A soma da coluna 5: "+somaC5);
        System.out.println("A soma da diagonal principal: "+somaDP);
        System.out.println("A soma da diagonal secundária: "+somaDS);
        System.out.println("A soma total da matriz: "+somaT);
    }
}

