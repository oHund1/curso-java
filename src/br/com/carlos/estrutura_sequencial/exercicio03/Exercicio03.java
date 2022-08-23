package br.com.carlos.estrutura_sequencial.exercicio03;

//Faça um Programa que peça dois números e imprima a soma.

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in) ;

        System.out.println("Ola!");
        System.out.print("Digite um numero: ");
        int n1 = leitor.nextInt();


        System.out.print("Digite mais um numero: ");
        int n2 = leitor.nextInt();
        int soma = n1 + n2;

        System.out.println("A soma dos numeros e: " + soma);

        leitor.close();

    }

}
