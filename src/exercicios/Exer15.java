/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Igor
 */
public class Exer15 {
    public static void main(String[] args) {
        int[][] matriz = new int [10][10], matrizz=new int [10][10];
        int maior = 0, linha = 0;
        String imprimir = "", imprimirr="";
        int[] vetor = new int [10];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j]= new Random().nextInt(10);
            }
        }
        System.out.println("Matrix 10x10");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < 10; j++) {
                imprimir = imprimir+" | "+matriz[i][j];
            }
            imprimir = imprimir+" |\n";
            
        }
        System.out.println(imprimir);
    
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < 10; j++) {
                Arrays.sort(matriz[i]);
               
            }
        }
        System.out.println("Matrix 10x10 em ordem crescente");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < 10; j++) {
                imprimirr = imprimirr+" | "+matriz[i][j];
            }
            imprimirr = imprimirr+" |\n";
        }
        System.out.println(imprimirr);
    }
}
