package br.com.carlos.estrutura_sequencial.exercicio14;

//João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.

import java.util.Scanner;
public class Exercicio14 {
        public static void main(String[] args) {

            Scanner leitor = new Scanner(System.in);

            System.out.println("Ola!");
            System.out.print("Digite o peso pescado: ");

            double pescado = leitor.nextDouble();
            int limitePermitido = 50;
            double excesso = Math.max(0, pescado - limitePermitido);
            double multa = excesso * 4;

            System.out.println("O execesso pescado foi de " + excesso + " kg e a multa a pagar é de: " + multa + " reais.");

            leitor.close();

        }
}
