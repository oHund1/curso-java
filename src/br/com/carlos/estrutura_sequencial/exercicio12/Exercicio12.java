package br.com.carlos.estrutura_sequencial.exercicio12;

//Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58

import java.util.Scanner;

public class Exercicio12 {

    public static void  main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola! ");
        System.out.print("Digite sua altura em metros: ");
        double h = leitor.nextDouble();
        double pesoI = (72.7 * h) - 58;

        System.out.println("O seu peso ideal e: " + pesoI + "kg.");

        leitor.close();
     }
}
