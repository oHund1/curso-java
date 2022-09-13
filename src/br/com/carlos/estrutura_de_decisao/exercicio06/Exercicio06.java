
//Faça um Programa que leia três números e mostre o maior deles.

package br.com.carlos.estrutura_de_decisao.exercicio06;

import java.util.Scanner;
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola!");
        System.out.print("Digite o primeiro numero: ");
        double n1 = leitor.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double n2 = leitor.nextDouble();

        System.out.print("Digite o terceiro numero: ");
        double n3 = leitor.nextDouble();

        if (n1 > n2 && n1 > n3) {
            System.out.println("O numero " + n1 + " e o maior numero digitado.");
        } else if (n2 > n3) {
            System.out.println("O numero " + n2 + " e o maior numero digitado.");
        } else {
            System.out.println("O numero " + n3 + " e o maior numero digitado.");
        }

        leitor.close();
    }
}

