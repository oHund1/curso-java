package br.com.carlos.estrutura_sequencial.exercicio09;

//Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
//        C = 5 * ((F-32) / 9).

import java.util.Scanner;

public class Exercicio09 {
    public static void  main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola!");
        System.out.print("Digite a temperatura desejada para a conversao: ");
        double temperaturaFahrenheit = leitor.nextDouble();
        double temperaturaCelsius = 5 * ((temperaturaFahrenheit - 32) / 9);

        System.out.println("A temperatura " + temperaturaFahrenheit + " graus Fahrenheit e igual a " + temperaturaCelsius + " graus Celsius.");

        leitor.close();
    }
}
