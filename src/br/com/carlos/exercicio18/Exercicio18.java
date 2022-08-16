package br.com.carlos.exercicio18;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola!");
        System.out.print("Digite o tamanho do arquivo a ser baixado em MB: ");
        double tamanhoArquivo = leitor.nextDouble();

        System.out.print("Digite a velocidade de sua internet em Mbps: ");
        double velocidadeNet = leitor.nextDouble();

        int tempoEstimado = (int) Math.ceil((tamanhoArquivo / velocidadeNet) / 60);
        System.out.println("O tempo estimado para baixar o arquivo e de " + tempoEstimado + " minutos.");

        leitor.close();
    }
}
