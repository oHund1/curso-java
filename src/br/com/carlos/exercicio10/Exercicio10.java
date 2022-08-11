package br.com.carlos.exercicio10;

import java.util.Scanner;

public class Exercicio10 {
    public static void  main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola");
        System.out.print("Digite a temperatura desejada para conversao: ");
        double tempc = Double.parseDouble(String.valueOf(leitor.nextLine()));
        double tempf = tempc*1.8+32;

        System.out.println("A temperatura " + tempc + " graus Celsius e igual a " + tempf + " graus Fahrenheit.");
    }
}
