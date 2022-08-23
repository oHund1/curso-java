package br.com.carlos.estrutura_sequencial.exercicio11;

//Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
//o produto do dobro do primeiro com metade do segundo .

import java.util.Scanner;

public class Exercicio11 {

     public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola!");
        System.out.print("Digite um numero inteiro: ");
        int n1 = leitor.nextInt();

        System.out.print("Digite outro numero inteiro: ");
        int n2 = leitor.nextInt();

        System.out.print("Agora, digite um numero real: ");
        double n3 = leitor.nextDouble();

        double cal1 = (n2 / 2) + (2 * n1);
        double cal2 = (3 * n1) + n3;
        double cal3 = Math.pow(n3,3);

        System.out.println("O produto do dobro do primeiro numero com metade do segundo numero e igual a " + cal1);
        System.out.println("A soma do triplo do primeiro numero com o terceiro numero e igual a " + cal2);
        System.out.println("O terceiro numero elevado ao cubo e igual a " + cal3);

        leitor.close();
    }

}
