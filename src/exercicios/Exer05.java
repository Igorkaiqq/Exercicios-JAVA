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
public class Exer05 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe sua nota?");
        int n = leia.nextInt();
        if(n<3){
            System.out.println("Conceito E");
        }else if (n>=3 && n<=5){
            System.out.println("Conceito D");
        }else if(n>=6 && n<=7){
            System.out.println("Conceito C");
        }else if (n>=8 && n<=9){
            System.out.println("Conceito B");
        }else{
            System.out.println("Conceito A");
        }
    }
}
