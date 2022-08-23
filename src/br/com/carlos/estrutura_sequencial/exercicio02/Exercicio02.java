package br.com.carlos.estrutura_sequencial.exercicio02;

//Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

      /*
       String texto = "Texto";
        int inteiro = 2;
        float flutuante = 2.5F;
        double vezes = 2.5;
        long longo = 545653L;
        short pequeno = 1;
        char caracter = 'a';
      */
        System.out.print("Escreva seu nome: ");
        String nome = leitor.nextLine();
        System.out.println("Ola " + nome);

        System.out.print("Escreva sua idade: ");
        int idade = leitor.nextInt();
        System.out.println("Sua idade é: " + idade);

        leitor.close();

    }
}
