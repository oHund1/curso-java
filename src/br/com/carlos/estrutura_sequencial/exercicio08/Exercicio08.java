package br.com.carlos.estrutura_sequencial.exercicio08;

//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

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
