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
public class Exer06 {
     public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("informe seu nome? ");
        String nome = leia.next();
        System.out.println("informe seu salário? ");
        float salario = leia.nextFloat();
        if(salario>0 && salario<=400){
         float nsalario = (float) (salario * 0.15);
            System.out.println("Nome: "+nome+"Salário Antigo: " +salario+"Aumento de 15%: "+nsalario);
        }else if(salario>=401 && salario<=700){
            float nsalario = (float) (salario * 0.12);
            System.out.println("Nome: "+nome+"Salário Antigo: " +salario+"Aumento de 12%: "+nsalario);
        }else if(salario>=701 && salario<=1000){
            float nsalario = (float) (salario * 0.10);
            System.out.println("Nome: "+nome+"Salário Antigo: " +salario+"Aumento de 10%: "+nsalario);
        }else if(salario>=1001 && salario<=1800){
            float nsalario = (float) (salario * 0.07);
            System.out.println("Nome: "+nome+"Salário Antigo: " +salario+"Aumento de 7%: "+nsalario);
        }else if(salario>=1801 && salario<=2500){
            float nsalario = (float) (salario * 0.04);
            System.out.println("Nome: "+nome+"Salário Antigo: " +salario+"Aumento de 4%: "+nsalario);
        }else{
            System.out.println("Já ganha o suficiente");
        }
    }
}

