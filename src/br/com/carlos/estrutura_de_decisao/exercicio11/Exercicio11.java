package br.com.carlos.estrutura_de_decisao.exercicio11;

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

public class Exercicio11 {
    public static void main(String[] args) {
        double salarioReajustado = reajustarSalario(700);
        System.out.println(salarioReajustado);
    }

    private static double reajustarSalario(double salario) {

        double perecentualReajuste = obterPercentualReajuste(salario);
        double valorReajuste = salario * perecentualReajuste / 100;
        double salarioReajustado = salario + valorReajuste;

        return salarioReajustado;
    }

    private static double obterPercentualReajuste(double salario) {
        double reajuste = 0;

        if (salario < 280) {
            reajuste = 20;
        } else if (salario >= 280 && salario < 700) {
            reajuste = 15;
        } else if (salario >= 700 && salario < 1500) {
            reajuste = 10;
        } else {
            reajuste = 5;
        }

        return reajuste;
    }

}
