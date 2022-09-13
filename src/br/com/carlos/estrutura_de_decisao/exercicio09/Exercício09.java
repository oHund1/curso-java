
//Faça um Programa que leia três números e mostre-os em ordem decrescente.

package br.com.carlos.estrutura_de_decisao.exercicio09;

import java.util.Scanner;
public class Exercício09 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola!");
        System.out.print("Digite um numero: ");
        double n1 = leitor.nextDouble();

        System.out.print("Digite outro numero: ");
        double n2 = leitor.nextDouble();

        System.out.print("Digite mais um numero: ");
        double n3 = leitor.nextDouble();

        if (n1 > n2 && n1 > n3){
            System.out.println(n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2);
        } else if (n3 > n1 && n3 > n2) {
            System.out.println(n3);
        }

        if (n1 < n2 && n1 < n3){
            System.out.println(n1);
        } else if (n2 < n1 && n2 < n3) {
            System.out.println(n2);
        } else if (n3 < n1 && n3 < n2) {
            System.out.println(n3);
        }

        leitor.close();

    }
}






