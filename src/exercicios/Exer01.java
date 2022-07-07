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
public class Exer01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int quantChopp, quantCobertura, quantPessoas, quantPizza;
        float conta, contaDividida, contaGarçom, contaTotal;

        System.out.println("Informe a quantidade de chopps: ");
        quantChopp = leia.nextInt();
        System.out.println("Informe a quantidade de pizza: ");
        quantPizza = leia.nextInt();
        System.out.println("Informe a quantidade de cobertura: ");
        quantCobertura = leia.nextInt();
        System.out.println("Informe a quantidade de pessoas na mesa: ");
        quantPessoas = leia.nextInt();

        conta = (float) ((quantPizza * 10) + (quantChopp * 0.80) + (quantCobertura * 1.50));

        contaGarçom = (float) (conta * 0.1);
        contaTotal = conta + contaGarçom;
        contaDividida = contaTotal / quantPessoas;

        System.out.printf("O valor da conta é: R$%.2f \n ", conta);
        System.out.printf("A taxa de 10%% do garçom é: R$%.2f \n ", contaGarçom);
        System.out.printf("O valor total da conta é: R$%.2f \n ", contaTotal);
        System.out.printf("O valor por pessoa é: R$%.2f \n ", contaDividida);

    }

}
