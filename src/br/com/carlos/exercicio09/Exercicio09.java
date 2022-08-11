package br.com.carlos.exercicio09;

import java.util.Scanner;

public class Exercicio09 {
    public static void  main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola!");
        System.out.print("Digite a temperatura desejada para a conversao: ");
        double tempf = Double.parseDouble(String.valueOf(leitor.nextLine()));
        double tempc = 5*((tempf-32)/9);

        System.out.println("A temperatura " + tempf + " graus Fahrenheit e igual a " + tempc + " graus Celsius.");

    }
}
