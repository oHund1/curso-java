package br.com.carlos.exercicio06;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola!");
        System.out.print("Digite o raio da circunferencia: ");
        double raio = leitor.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("Area da circunferencia e de " + area);

        leitor.close();

    }
}
