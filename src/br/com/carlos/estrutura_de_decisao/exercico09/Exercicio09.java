package br.com.carlos.estrutura_de_decisao.exercico09;

//As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver o programa que calculará os reajustes. Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
//salários até R$ 280,00 (incluindo) : aumento de 20%
//salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
//salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
//salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:
//o salário antes do reajuste;
//o percentual de aumento aplicado;
//o valor do aumento;
//o novo salário, após o aumento.

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola!");
        System.out.print("Digite seu salario: ");
        double salario = leitor.nextDouble();

        double aumento1 = salario * 0.20;
        double aumento2 = salario * 0.15;
        double aumento3 = salario * 0.10;
        double aumento4 = salario * 0.05;

        double salarioFinal1 = salario + aumento1;
        double salarioFinal2 = salario + aumento2;
        double salarioFinal3 = salario + aumento3;
        double salarioFinal4 = salario + aumento4;

        if (salario < 280) {
            System.out.println("O seu salario antes do reajuste e de: " + salario);
            System.out.println("O valor de seu aumento sera de: " + aumento1);
            System.out.println("O seu novo salario, apos o aumento, sera de: " + salarioFinal1);
        } else if (salario >= 280 && salario < 700) {
            System.out.println("O seu salario antes do reajuste e de: " + salario);
            System.out.println("O valor de seu aumento sera de: " + aumento2);
            System.out.println("O seu novo salario, apos o aumento, sera de: " + salarioFinal2);
        } else if (salario >= 700 && salario < 1500) {
            System.out.println("O seu salario antes do reajuste e de: " + salario);
            System.out.println("O valor de seu aumento sera de: " + aumento3);
            System.out.println("O seu novo salario, apos o aumento, sera de: " + salarioFinal3);
        } else {
            System.out.println("O seu salario antes do reajuste e de: " + salario);
            System.out.println("O valor de seu aumento sera de: " + aumento4);
            System.out.println("O seu novo salario, apos o aumento, sera de: " + salarioFinal4);
        }

        leitor.close();

    }
}
