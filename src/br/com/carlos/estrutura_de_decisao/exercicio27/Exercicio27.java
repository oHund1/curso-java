
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

        System.out.println("Ola!");
        System.out.print("Digite a quantidade de morangos: ");
        double morangos = leitor.nextDouble();

        double precoMorango1 = morangos * 2.50;
        double precoMorango2 = morangos * 2.20;

        System.out.println("Digite a quantidade de macas: ");
        double macas = leitor.nextDouble();

        double precoMacas1 = macas * 1.80;
        double precoMacas2 = macas * 1.50;

        double quantidadeTotal = morangos + macas;

        System.out.println("A quantidade de morangos foi de: " + morangos +
                " e a quantidade de macas foi de: " + macas);

        if (morangos < 5) {
            double precoFinalMorango = precoMorango1;
        } else {
            double precoFinalMorango = precoMorango2;
        }

        if (macas < 5) {
            double precoFinalMacas = precoMacas1;
        } else {
            double precoFinalMacas = precoMacas2;
        }

        // double precoTotal = precoFinalMorango + precoFinalMacas;
        // if (precoTotal > 25 or quantidadeTotal > 8) {
        // double precoComDesconto = precoTotal - 0.10;
        // System.out.println("O preco final foi de: " + precoComDesconto + " reais.")
        // } else {
        // System.out.println("O preco final foi de: " + precoTOtal + " reais.")

        leitor.close();

    }
}
