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
public class Exer14 {
    public static void main(String[] args) {
        String nome, senha;
        Scanner leia = new Scanner (System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Qual o nome do usuário?");
            nome = leia.next();
            if ("alunosifpr".equals(nome)) {
                System.out.println("Qual a senha?");
                senha = leia.next();
                if ("alunosifpr".equals(nome)) {
                    System.out.println("Acesso liberado");
                    System.exit(0);
                }
            } else {
                System.out.println("Nome de usuário ou senha incorreta");
                    }
        }
        System.exit(0);
       
    }
}
