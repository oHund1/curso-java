package br.com.carlos.exercicio15;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola!");
        System.out.print("Digite o valor da sua hora trabalhada: ");
        double salarioHora = leitor.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas no mes: ");
        double horasMes = leitor.nextDouble();

        double salarioBrutoMes = salarioHora * horasMes;
        System.out.println("Seu salario mensal bruto e de " + salarioBrutoMes + " reais.");

        double IR = salarioBrutoMes * 0.11;
        double INSS = salarioBrutoMes * 0.08;
        double sindicato = salarioBrutoMes * 0.05;
        double salarioLiquido = salarioBrutoMes - IR - INSS - sindicato;

        System.out.println("De Imposto de Renda foi descontado um valor de : " + IR + " reais do seu salario bruto mensal. ");
        System.out.println("De INSS foi descontado um valor de : " + INSS + " reais do seu salario bruto mensal. ");
        System.out.println("De Sindicato foi descontado um valor de : " + sindicato + " reais do seu salario bruto mensal. ");
        System.out.println("Seu salario mensal liquido e de: " + salarioLiquido + " reais.");

        leitor.close();

    }
}
