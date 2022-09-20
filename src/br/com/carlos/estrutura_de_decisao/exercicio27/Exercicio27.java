
// Uma fruteira está vendendo frutas com a seguinte tabela de preços:
//                      Até 5 Kg           Acima de 5 Kg
//Morango         R$ 2,50 por Kg          R$ 2,20 por Kg
//Maçã            R$ 1,80 por Kg          R$ 1,50 por Kg
//Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um
// desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a
// quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.

package br.com.carlos.estrutura_de_decisao.exercicio27;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double preco = 0;
        double desconto = 0;

        System.out.println("Ola!");
        System.out.print("Digite a quantidade de morangos em kg: ");
        int quantidadeMorangos = leitor.nextInt();

        if (quantidadeMorangos <= 5) {
            preco = 2.5 * quantidadeMorangos;
        } else {
            preco = 2.2 * quantidadeMorangos;
        }

        System.out.print("Digite a quantidade de macas em kg: ");
        int quantidadeMacas = leitor.nextInt();

        if (quantidadeMacas <= 5) {
            preco = 1.8 * quantidadeMacas;
        } else {
            preco = 1.50 * quantidadeMacas;
        }

        int quantidadeTotal = quantidadeMacas + quantidadeMorangos;

       if (quantidadeTotal > 28) {
           desconto = 0.1;
       } else if (preco >= 25) {
           desconto = 0.1;
       } else {
           desconto = 0;
       }

       double descontoTotal = preco * desconto;
       double precoTotal = preco - descontoTotal;

        System.out.println("QUANTIDADE MORANGOS: " + quantidadeMorangos + " kg");
        System.out.println("QUANTIDADE MACAS: " + quantidadeMacas + " kg");
        System.out.println("O TOTAL A SER PAGO E DE: " + precoTotal + " reais");

        leitor.close();

    }
}


