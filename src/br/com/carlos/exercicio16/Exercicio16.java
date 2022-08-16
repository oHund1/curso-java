package br.com.carlos.exercicio16;

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
