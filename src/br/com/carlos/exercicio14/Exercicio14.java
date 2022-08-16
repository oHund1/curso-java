package br.com.carlos.exercicio14;

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

        }
}
