package br.com.carlos.estrutura_sequencial.exercicio17;

// Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
//Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
//comprar apenas latas de 18 litros;
//comprar apenas galões de 3,6 litros;
//misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola!");
        System.out.print("Digite a metragem a ser pintada: ");
        double area = leitor.nextDouble();

        double litros = area / 6.0;
        double litrosMistura = litros * 1.10;

        double quantidadeLatasMistura = Math.floor(litrosMistura / 18.0);
        double quantidadeGalaoesMistura = Math.ceil((litrosMistura / 18.0 - quantidadeLatasMistura) * 18.0 / 3.6);

        double quantidadeLata =  Math.ceil(litros / 18.0);
        double quantidadeGalao =  Math.ceil(litros / 3.6);

        double precoLata = quantidadeLata * 80;
        double precoGalao = quantidadeGalao * 25;

        System.out.println("A quantidade de tinta necessaria e de " + litros + "  litros.");
        System.out.println("Comprando apenas latas de 18 litros, o preco total sera de " + precoLata + " reais para um total de " + quantidadeLata + " latas.");
        System.out.println("Comprando apenas apenas galoes de 3,6 litros, o preco total sera de " + precoGalao + " reais para um total de " + quantidadeGalao + " galoes.");
        System.out.println("Misturando latas e galoes, de forma que o desperdicio de tinta seja menor, serao necessarios " + quantidadeLatasMistura + " latas e " + quantidadeGalaoesMistura + " galoes.");

    }
}
