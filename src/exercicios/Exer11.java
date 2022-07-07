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
public class Exer11 {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero aleatório");
            int n = leia.nextInt();
            if (n%2==0) {
                System.out.println("O numero "+n+" é primo");
            } else {
                System.out.println("O numero "+n+" não é primo");
        }
        
    }
}
}