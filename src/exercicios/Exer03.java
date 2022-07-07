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
public class Exer03 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float valorA, valorB, troca;

        System.out.println("Digite um valor para A: ");
        valorA = leia.nextFloat();

        System.out.println("Digite um valor para B: ");
        valorB = leia.nextFloat();

        System.out.println("Valores originais: ");
        System.out.println("O valor de A é: " + valorA);
        System.out.println("O valor de B é: " + valorB);

        troca = valorA;

        valorA = valorB;
        valorB = troca;

        System.out.println("Valores trocados: ");
        System.out.println("O valor de A é: " + valorA);
        System.out.println("O valor de B é: " + valorB);
    }

}



