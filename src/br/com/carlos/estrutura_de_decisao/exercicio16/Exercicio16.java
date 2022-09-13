
// Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c. O programa deverá pedir
// os valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações:
//Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa não deve fazer pedir
// os demais valores, sendo encerrado;
//Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e encerre o programa;
//Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário;
//Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;

package br.com.carlos.estrutura_de_decisao.exercicio16;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola!");
        System.out.println("Digite o primeiro numero: ");
        double n1 = leitor.nextDouble();

        if (n1 == 0) {
            System.out.print("Valor invalido!");
        } else {
            System.out.print("Digite o segundo numero: ");
            double n2 = leitor.nextDouble();

            System.out.print("Digite o terceiro numero: ");
            double n3 = leitor.nextDouble();

            double delta = ((n2 * n2) - (4 * n1 * n3));

            if (delta < 0 ) {
                System.out.println("A equacao nao possui raizes reais.");
            } else {
                double  x1 = (-n2 + Math.sqrt(delta)) / 2 * n1;
                double  x2 = (-n2 - Math.sqrt(delta)) / 2 * n1;

                if (delta == 0) {
                    System.out.println("1 raiz real: " + x1);
                } else {
                    System.out.println("2 raizes reais: " + x1 + " e " + x2);
                }
            }

        }

        leitor.close();

    }

}
