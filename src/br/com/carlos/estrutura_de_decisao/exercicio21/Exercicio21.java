
//Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário a valor do saque e depois informar
// quantas notas de cada valor serão fornecidas. As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais. O valor
// mínimo é de 10 reais e o máximo de 600 reais. O programa não deve se preocupar com a quantidade de notas existentes
// na máquina.
//Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma nota de 50, uma nota de 5 e
// uma nota de 1;
//Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de 100, uma nota de 50, quatro notas de
// 10, uma nota de 5 e quatro notas de 1.

package br.com.carlos.estrutura_de_decisao.exercicio21;

import java.util.Scanner;

public class Exercicio21 {
        public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola!");
        System.out.print("Digite um numero entre 10 e 600: ");
        int valor = leitor.nextInt();

            int cem = valor / 100;
            valor = valor - (cem * 100);

            int cinquenta = valor / 50;
            valor = valor - (cinquenta * 50);

            int dez = valor / 10;
            valor = valor - (dez * 10);

            int cinco = valor / 5;
            valor = valor - cinco * 5;

            int um = valor;

            System.out.println("Notas R$100,00 = " + cem);
            System.out.println("Notas R$ 50,00 = " + cinquenta);
            System.out.println("Notas R$ 10,00 = " + dez);
            System.out.println("Notas R$  5,00 = " + cinco);
            System.out.println("Notas R$  1,00 = " + um);

            leitor.close();

    }
}
