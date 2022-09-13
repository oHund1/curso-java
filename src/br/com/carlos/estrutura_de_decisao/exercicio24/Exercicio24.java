
//Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar.
// O resultado da operação deve ser acompanhado de uma frase que diga se o número é:
//par ou ímpar;
//positivo ou negativo;
//inteiro ou decimal.

package br.com.carlos.estrutura_de_decisao.exercicio24;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola!");
        System.out.print("Digite um numero real: ");
        double numero = leitor.nextDouble();

        if (numero % 2 == 0) {
            System.out.println("O numero e par.");
        } else {
            System.out.println("O numero e impar.");
        }

        if (numero < 0) {
            System.out.println("O numero e negativo.");
        } else {
            System.out.println("O numero e positivo.");
        }

        if (numero == Math.round(numero)) {
            System.out.println("O numero e inteiro.");
        } else if (numero != Math.round(numero)) {
            System.out.println("O numero e decimal.");
        }

        leitor.close();

    }
}
