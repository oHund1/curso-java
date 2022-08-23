package br.com.carlos.estrutura_sequencial.exercicio16;

//Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola!");

        System.out.print("Digite a metragem a ser pintada em metros: ");
        double area = leitor.nextDouble();
        double litros = area / 3;
        double latas = litros / 18;

        int quantidadeLatas = (int) Math.ceil(latas);
        int precoFinal = (quantidadeLatas * 80);

        System.out.println("A quantidade de latas necessarias sera de: " + quantidadeLatas);
        System.out.println("O preco da compra sera de: " + precoFinal + " reais.");

        leitor.close();
    }
}
