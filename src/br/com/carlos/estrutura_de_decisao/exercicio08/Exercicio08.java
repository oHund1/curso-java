
//Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar,
// sabendo que a decisão é sempre pelo mais barato.

package br.com.carlos.estrutura_de_decisao.exercicio08;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola!");
        System.out.print("Digite o preco do primeiro produto: ");
        double preco1 = leitor.nextDouble();

        System.out.print("Digite o preco do segundo produto: ");
        double preco2 = leitor.nextDouble();

        System.out.print("Digite o preco do terceiro produto: ");
        double preco3 = leitor.nextDouble();

        if (preco1 < preco2 && preco1 < preco3) {
            System.out.println("O produto mais barato para compra e o PRIMEIRO.");
        } else if (preco2 < preco1 && preco2 < preco3) {
            System.out.println("O produto mais barato para compra e o SEGUNDO.");
        } else if (preco3 < preco1 && preco3 < preco2) {
            System.out.println("O produto mais barato para compra e o TERCEIRO.");
        }

        leitor.close();

    }
}
