package br.com.carlos.estrutura_sequencial.exercicio15;

//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
//salário bruto.
//quanto pagou ao INSS.
//quanto pagou ao sindicato.
//o salário líquido.
//calcule os descontos e o salário líquido, conforme a tabela abaixo:
//+ Salário Bruto : R$
//- IR (11%) : R$
//- INSS (8%) : R$
//- Sindicato ( 5%) : R$
//= Salário Liquido : R$
//Obs.: Salário Bruto - Descontos = Salário Líquido.

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
