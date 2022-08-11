package br.com.carlos.exercicio08;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola!");
        System.out.print("Digite seu salario por hora: ");
        double salario = Double.parseDouble(String.valueOf(leitor.nextLine()));

        System.out.print("Digite as horas trabalhadas no mes: ");
        double horas = Double.parseDouble(String.valueOf(leitor.nextLine()));

        var salariomes =  salario*horas;
        System.out.println("Seu salario mensal e de " + salariomes +" reais.");
    }
}
