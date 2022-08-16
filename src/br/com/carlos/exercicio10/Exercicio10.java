package br.com.carlos.exercicio10;

import java.util.Scanner;

public class Exercicio10 {
    public static void  main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola");
        System.out.print("Digite a temperatura desejada para conversao: ");
        double temperaturaCelsius = leitor.nextDouble();
        double temperaturaFahrenheit = temperaturaCelsius * 1.8 + 32;

        System.out.println("A temperatura " + temperaturaCelsius + " graus Celsius e igual a " + temperaturaFahrenheit + " graus Fahrenheit.");

        leitor.close();
    }
}
