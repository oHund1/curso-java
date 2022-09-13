
//Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.

package br.com.carlos.estrutura_de_decisao.exercicio02;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola!");
        System.out.print("Digite um numero inteiro: ");
        double n1 = leitor.nextDouble();

        if (n1 > 0) {
            System.out.println("O numero real " + n1 + " e positivo.");
        } else {
            System.out.println("O numero real " + n1 + " e negativo.");
        }

        leitor.close();

    }
}
