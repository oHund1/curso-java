package br.com.carlos.exercicio03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in) ;

        System.out.println("Ola!");
        System.out.print("Digite um numero: ");
        int n1 = Integer.parseInt(leitor.nextLine());

        System.out.print("Digite mais um numero: ");
        int n2 = Integer.parseInt(leitor.nextLine());
        int soma = n1 + n2;

        System.out.println("A soma dos numeros e: " + soma);

    }

}
