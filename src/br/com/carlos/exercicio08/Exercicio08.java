package br.com.carlos.exercicio08;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola!");
        System.out.print("Digite seu salario por hora: ");
        double salario = leitor.nextDouble();

        System.out.print("Digite as horas trabalhadas no mes: ");
        double horas = leitor.nextDouble();

        double salarioMes =  salario * horas;
        System.out.println("Seu salario mensal e de " + salarioMes +" reais.");

        leitor.close();
    }
}
