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
public class Exer04 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num;

        System.out.println("Digite um número: ");
        num = leia.nextInt();

        if (num >= 0){
            if(num % 2 == 0){
                System.out.println("O número digitado é PAR!");
            }
            if(num % 2 != 0){
                System.out.println("O número digitado é IMPAR!");
            }
        }
             if(num < 0){
                System.out.println("O número digitado é NEGATIVO!");
             }
             
          
        }
    }


