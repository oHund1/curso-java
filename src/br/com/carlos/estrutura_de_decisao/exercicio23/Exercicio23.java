
//Faça um Programa que peça um número e informe se o número é inteiro ou decimal. Dica: utilize uma função
// de arredondamento.

package br.com.carlos.estrutura_de_decisao.exercicio23;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola!");
        System.out.print("Digite um numero real: ");
        double n1 = leitor.nextDouble();

        if (n1 == Math.round(n1)) {
            System.out.println("O numero e inteiro.");
        } else if (n1 != Math.round(n1)) {
            System.out.println("O numero e decimal.");
        }

        leitor.close();

    }
}
