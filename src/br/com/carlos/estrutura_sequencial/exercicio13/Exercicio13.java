package br.com.carlos.estrutura_sequencial.exercicio13;

//Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
//Para homens: (72.7*h) - 58
//Para mulheres: (62.1*h) - 44.7

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola!");
        System.out.println("Digite sua altura em metros: ");
        double h = leitor.nextDouble();

        double pesoHomem = (72.7 * h) - 58;
        double pesoMulher = (62.1 * h) - 44.7;
        System.out.println("Seu peso ideal se for homem e igual a: " + pesoHomem + " kg. ");
        System.out.println("Seu peso ideal se for mulher e igual a: " + pesoMulher + " kg. ");

        leitor.close();
    }
}
