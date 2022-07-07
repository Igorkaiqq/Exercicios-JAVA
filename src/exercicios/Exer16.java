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
public class Exer16 {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        String nome;
        int parcela, codigo;
        double valor, parcelas;
        
        System.out.println("Qual o nome do cliente?");
        nome= leia.next();
        System.out.println("Qual o codigo do cliente?");
        codigo = leia.nextInt();
        System.out.println("Qual o valor da compra?");
        valor = leia.nextDouble();
        System.out.println("Escolha a quantidade de parcelas entre 2 e 36");
        System.out.println("Qual o Numero de prestações?");
        parcela = leia.nextInt();
        System.out.println("---------------------------------------------------------");
        //if (parcela>=2 && parcela<=36) {
        //System.out.println("Cliente: "+nome);
        //System.out.println("Registro do cliente: "+codigo);
        //System.out.println("Valor da compra: "+valor);
        //System.out.println("Total de parcelas: "+parcela);
       // parcelas = valor/parcela;
            //for (int i = 1; i <= parcela; i++) {
               //System.out.println("Parcela "+i+": "+parcelas);
            //}
        //}else{
            //System.out.println("Numero de parcelas inválido");
            //}
        System.out.println("Cliente: "+nome);
        System.out.println("Registro do cliente: "+codigo);
        System.out.println("Valor da compra: "+valor);
        parcelas=valor/12;
        for (int i = 1; i <=12; i++) {
               System.out.println("Parcela "+i+": "+parcelas);
            }
      }
    
}
