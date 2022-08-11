package br.com.carlos.exercicio12;

import java.util.Scanner;

public class Exercicio12 {

    public static void  main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola! ");
        System.out.print("Digite sua altura em metros: ");
        double h = Double.parseDouble(String.valueOf(leitor.nextLine()));
        double pesoi = (72.7*h)-58;

        System.out.println("O seu peso ideal e: " + pesoi + "kg.");

        //Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
        //Para homens: (72.7*h) - 58
        //Para mulheres: (62.1*h) - 44.7
        // System.out.print("Digite seu genero: ");
        // double g = Double.parseDouble(String.valueOf(leitor.nextLine()));
    }
}
