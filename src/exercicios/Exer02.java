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
public class Exer02 {
    public static void main(String[] args) {
          Scanner leia = new Scanner(System.in);
        String nome;
        int numFilhos;
        float numHoras, porcFilhos, valorHoras, valorSalario, salarioTotal;

        System.out.println("Digite o seu nome: ");
        nome = leia.nextLine();
        System.out.println("Informe o número de horas trabalhadas: ");
        numHoras = leia.nextFloat();
        System.out.println("Informe o valor recebido por cada hora trabalhada: ");
        valorHoras = leia.nextFloat();
        System.out.println("Informe o número de filhos: ");
        numFilhos = leia.nextInt();
       
        valorSalario = numHoras * valorHoras;
        porcFilhos = (float) (0.03 * numFilhos);
        salarioTotal = valorSalario + porcFilhos;
        
        System.out.println("Nome do funcionário: "+nome);
        System.out.printf("O salário bruto: R$%.2f \n ",valorSalario);
        System.out.printf("O salário total é:R$%.2f \n",salarioTotal);
        
   
        
        
    }
    
}


