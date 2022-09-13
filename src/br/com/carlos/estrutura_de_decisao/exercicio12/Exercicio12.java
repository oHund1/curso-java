
//Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que
// depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário
// Bruto, mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os
// descontos.
// O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
//Desconto do IR:
//Salário Bruto até 900 (inclusive) - isento
//Salário Bruto até 1500 (inclusive) - desconto de 5%
//Salário Bruto até 2500 (inclusive) - desconto de 10%
//Salário Bruto acima de 2500 - desconto de 20% Imprima na tela as informações, dispostas conforme o exemplo abaixo.
// No exemplo o valor da hora é 5 e a quantidade de hora é 220.
//        Salário Bruto: (5 * 220)        : R$ 1100,00
//        (-) IR (5%)                     : R$   55,00
//        (-) INSS ( 10%)                 : R$  110,00
//        FGTS (11%)                      : R$  121,00
//        Total de descontos              : R$  165,00
//        Salário Liquido                 : R$  935,00

package br.com.carlos.estrutura_de_decisao.exercicio12;

import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola!");
        System.out.print("Digite o valor de sua hora trabalhada: ");
        double valorHora = leitor.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas na semana: ");
        double horasTrabalhadasSemana = leitor.nextDouble() * 4;
        double salarioBruto = valorHora * horasTrabalhadasSemana;

        double IR = 0;
        double INSS = 0.1 * salarioBruto;
        double FGTS = 0.11 * salarioBruto;
        double sindicato = 0.03 * salarioBruto;

        if (salarioBruto > 900 && salarioBruto <= 1500) {
            IR = 0.05 * salarioBruto;
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            IR = 0.1 * salarioBruto;
        }else if (salarioBruto > 2500){
            IR = 0.2 * salarioBruto;
        }

        double descontos = IR + INSS + sindicato;
        double salarioLiquido = salarioBruto - descontos;

        System.out.println("Salario Bruto     : " + salarioBruto);
        System.out.println("INSS              : " + INSS);
        System.out.println("FGTS              : " + FGTS);
        System.out.println("Sindicato         : " + sindicato);
        System.out.println("Total de descontos: " + descontos);
        System.out.println("Salario Liquido   : " + salarioLiquido);

        leitor.close();

    }
}
