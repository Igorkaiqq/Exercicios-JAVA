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
public class Exer07 {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Você deseja converter qual unidade para qual unidade?");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        int opcao = leia.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Qual a temperatura em Celsius que deseja converter para Fahrenheit?");
                int C = leia.nextInt();
                double Fc = 9 * C/ 5+32;
                System.out.println("A temperatura de Fahrenheit é de "+Fc);
                break;
            case 2:
                System.out.println("Qual a temperatura em Fahrenheit que deseja converter para Celsius?");
                int F = leia.nextInt();
                double Cf = (F-32)*5/9;
                System.out.println("A temperatura de Celsius é de "+Cf);
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
}
}