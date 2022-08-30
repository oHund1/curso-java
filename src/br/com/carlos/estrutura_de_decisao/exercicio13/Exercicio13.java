package br.com.carlos.estrutura_de_decisao.exercicio13;

//Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-Domingo, 2- Segunda, etc.), se digitar
// outro valor deve aparecer valor inválido.

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola!");
        System.out.print("Digite o numero do dia correspondente: ");
        double dia = leitor.nextDouble();

        if (dia == 1) {
            System.out.println("O dia correspondente e Domingo.");
        } else if (dia == 2) {
            System.out.println("O dia correspondente e Segunda-Feira.");
        } else if (dia == 3) {
            System.out.println("O dia correspondente e Terca-Feira.");
        } else if (dia == 4) {
            System.out.println("O dia correspondente e Quarta-Feira.");
        } else if (dia == 5) {
            System.out.println("O dia correspondente e Quinta-Feira.");
        } else if (dia == 6) {
            System.out.println("O dia correspondente e Sexta-Feira.");
        } else if (dia == 7) {
            System.out.println("O dia correspondente e Sabado.");
        } else {
            System.out.println("Valor invalido.");
        }

        leitor.close();
    }
}
