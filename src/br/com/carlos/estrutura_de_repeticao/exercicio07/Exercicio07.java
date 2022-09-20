
//Faça um programa que leia 5 números e informe o maior número.

package br.com.carlos.estrutura_de_repeticao.exercicio07;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola!");

        double quantidadeInicial = 1;
        double quantidadeFinal = 5;
        double maior = 0;

        while (quantidadeInicial <= quantidadeFinal) {
            System.out.print("Digite um numero:");
            double num = leitor.nextFloat();

            if (num > maior) {
                maior = num;
            }
            quantidadeInicial++;
        }
        System.out.println("O maior numero e: " + maior);
    }
}


