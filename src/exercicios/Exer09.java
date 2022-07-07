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
public class Exer09 {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        int sexo=0, j=4, sexoF = 0, sexoM = 0;
        String nome="";
        float altura, peso, mediaP, pesoT = 0;
            for (int i = 0; i < j; i++) {
                System.out.println("Qual o seu nome?");
                nome=leia.next();
                
                System.out.println("Qual o seu peso?");
                peso=leia.nextFloat();
                System.out.println("Qual o seu sexo?");
                System.out.println("1- Feminino");
                System.out.println("2- Masculino");
                sexo=leia.nextInt();
                if (sexo==1) {
                    sexoF=sexoF+sexo;
                } else if (sexo==2){
                    sexoM=sexoM+sexo;
                }
                pesoT =  peso + pesoT;
                
                }
       
        float Pf = (sexoF*100)/j;
        System.out.println("Foi registrado "+sexoF+" pessoas do sexo Feminino. A porcentagem de mulheres é de "+Pf+"%.");
    
        float Pm = (sexoM*100)/j;
        System.out.println("Foi registrado "+sexoM+" pessoas do sexo Masculino. A porcentagem de homens é de "+Pm+"%.");
        
        mediaP = pesoT / j;
        System.out.println("A media de peso das "+j+" pessoas registradas é de "+mediaP+" Kg.");
        
    }
}
