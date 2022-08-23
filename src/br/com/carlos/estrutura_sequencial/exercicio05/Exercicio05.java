package br.com.carlos.estrutura_sequencial.exercicio05;

//Faça um Programa que converta metros para centímetros.

import java.util.Scanner;
public class Exercicio05 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola! Seja bem-vindo ao programa de conversao de metros para centimetro. ");
        System.out.print("Digite a metragem para conversao: ");
        int n1 = leitor.nextInt();
        int conversao = n1*100;
        System.out.println( n1 + " metros em centimetros e igual a " + conversao);

        leitor.close();

    }
}
