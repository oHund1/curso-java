package br.com.carlos.exercicio05;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola! Seja bem-vindo ao programa de conversao de metros para centimetro. ");
        System.out.print("Digite a metragem para conversao: ");
        int n1 = Integer.parseInt(leitor.nextLine());
        int conversao = n1*100;
        System.out.println( n1 + " metros em centimetros e igual a " + conversao);

    }
}